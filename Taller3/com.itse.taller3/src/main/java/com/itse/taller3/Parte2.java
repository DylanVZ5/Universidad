package com.itse.taller3;

public class Parte2 {

    public class Singleton {
        // Implementación del patrón Singleton
        class Configuracion {
            // 1. Campo estático y privado para la instancia única. Inicialmente null.
            private static Configuracion instancia = null; // se inicializa a null

            private String configValor; //

            // 2. Constructor privado para evitar la instanciación externa con 'new'.
            private Configuracion() { // Modificado a privado
                configValor = "Valor por defecto"; //
            }

            // 3. Método estático público para obtener la instancia única (acceso global).
            // Se utiliza inicialización perezosa (Lazy Initialization).
            public Configuracion getInstancia() {
                // Creamos la instancia solo si no existe
                if (instancia == null) {
                    instancia = new Configuracion();
                }
                return instancia;
            }

            // Getters y Setters de la configuración
            public String getConfigValor() { //
                return configValor; //
            }

            public void setConfigValor(String valor) { //
                this.configValor = valor; //
            }
        // Ejemplo de uso:
        // Configuracion config1 = Configuracion.getInstancia();
        // Configuracion config2 = Configuracion.getInstancia();
        // // config1 y config2 son la misma instancia.
        }
    }   

    public class FactoryMethod {
        // Implementación del patrón Factory Method

        // Clase base del Producto: Usuario
        class Usuario { //
            private final String nombre; //

            public Usuario(String nombre) { //
                this.nombre = nombre; //
            }

            public String getNombre() { //
                return nombre; //
            }

            public void mostrarTipo() { //
                System.out.println("Soy un usuario general"); //
            }
        }

            // Producto Concreto 1: Usuario Admin
        public class UsuarioAdmin extends Usuario {
            public UsuarioAdmin(String nombre) {
                super(nombre);
            }

            @Override
            public void mostrarTipo() {
                System.out.println("Soy un usuario ADMINISTRADOR: " + getNombre());
            }
        }

        // Producto Concreto 2: Usuario Invitado
        public class UsuarioInvitado extends Usuario {
            public UsuarioInvitado(String nombre) {
                super(nombre);
            }

            @Override
            public void mostrarTipo() {
                System.out.println("Soy un usuario INVITADO: " + getNombre());
            }
        }

        // Clase Creadora: UsuarioFactory
        public class UsuarioFactory { //

            Usuario crearUsuario(String tipo, String nombre) { //
                if (tipo.equalsIgnoreCase("normal")) { //
                    // Comentario: Devolverá el tipo de usuario base.
                    return new Usuario(nombre); //

                } else if (tipo.equalsIgnoreCase("admin")) {
                    // Comentario: Creación de un UsuarioAdmin.
                    return new UsuarioAdmin(nombre); //

                } else if (tipo.equalsIgnoreCase("invitado")) {
                    // Comentario: Creación de un UsuarioInvitado.
                    return new UsuarioInvitado(nombre); //

                } else {
                    // Comentario: Tipo no reconocido.
                    return null; //
                }
            }
        }

        // Ejemplo de uso:
        // UsuarioFactory factory = new UsuarioFactory();
        // Usuario admin = factory.crearUsuario("admin", "Carlos");
        // admin.mostrarTipo(); // Imprime: Soy un usuario ADMINISTRADOR: Carlos
    }

    public class Adapter {
        // Implementación del patrón Adapter

            // Librería externa (Adaptee) - NO MODIFICAR
        public class LibreriaExterna { //

            public void metodoExterno() { //
                System.out.println("Funcionalidad externa sin modificar."); //
            }
        }

            // Interfaz Objetivo (Target) que el cliente espera
        public interface ServicioTarget {
            void ejecutarServicio();
        }

                // Adaptador (Adapter) que implementa ServicioTarget y encapsula LibreriaExterna
        public class Adaptador implements ServicioTarget { // Modificado para implementar Target

            private LibreriaExterna externa; // Referencia al Adaptee

            public Adaptador() { //
                // Se inicializa la librería externa en el constructor.
                externa = new LibreriaExterna(); //
            }

            // Implementación del método que el cliente espera (Target)
            @Override
            public void ejecutarServicio() { // Modificado el nombre a 'ejecutarServicio' para la interfaz Target
                System.out.println("Adaptador: Llamando al método externo...");
                // Delegación de la llamada al método incompatible del Adaptee
                externa.metodoExterno(); //
            }
        }

        // Ejemplo de uso:
        // ServicioTarget servicio = new Adaptador();
        // servicio.ejecutarServicio(); // Llama al método externo de la librería a través del Adaptador.
    }

    public class Decorator {
        // Implementación del patrón Decorator
            // Componente Concreto
        public class Animal { //

            public void hacerSonido() { //
                System.out.println("Sonido genérico de animal"); //
            }
        }

                // Decorador Abstracto
        public class AnimalDecorator extends Animal { //

            protected Animal animal; // Referencia al objeto envuelto (Componente)

            public AnimalDecorator(Animal animal) { //
                this.animal = animal; //
            }

            @Override
            public void hacerSonido() { //
                // Delegar la llamada al objeto envuelto
                animal.hacerSonido(); //
            }
        }

                // Decorador Concreto 1: Habilidad de Volar
        public class AnimalVoladorDecorator extends AnimalDecorator {

            public AnimalVoladorDecorator(Animal animal) {
                super(animal);
            }

            @Override
            public void hacerSonido() {
                super.hacerSonido(); // Llamada al comportamiento base
                volar(); // Añadir el nuevo comportamiento
            }

            private void volar() {
                System.out.println("... y también puede VOLAR (Habilidad añadida por Decorator)");
            }
        }

        // Decorador Concreto 2: Habilidad de Cazar
        public class AnimalCazadorDecorator extends AnimalDecorator {

            public AnimalCazadorDecorator(Animal animal) {
                super(animal);
            }

            @Override
            public void hacerSonido() {
                super.hacerSonido(); // Llamada al comportamiento base
                cazar(); // Añadir el nuevo comportamiento
            }

            private void cazar() {
                System.out.println("... y también puede CAZAR (Habilidad añadida por Decorator)");
            }
        }

        // Ejemplo de uso:
        // Animal animalBase = new Animal();
        // Animal animalCazadorVolador = new AnimalCazadorDecorator(new AnimalVoladorDecorator(animalBase));
        // animalCazadorVolador.hacerSonido();
    }
}