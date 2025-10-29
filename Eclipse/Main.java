package taller_1;

public class Main {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Firulais","husky siberiano","Lugares frios/nevados","Carbohidratos, proteínas, minerales y vitaminas","Diurno","Ladrido");
		Gato gato1 = new Gato("Michi","gato doméstico","Casa y ciudad","Carnívoro","Crepuscular/Nocturno","Maullido");
		Halcon halcon1 = new Halcon("Rapto","halcón","Zonas abiertas, montañas","Carnívoro","Diurno","Chillido");
		Coyote coyote1 = new Coyote("Colmillo","coyote","Bosques, praderas, desiertos","Omnívoro","Nocturno","Aullido");
		Avion avion1 = new Avion();
		
		perro1.sonido();
		gato1.sonido();
		halcon1.sonido();
		coyote1.sonido();
		avion1.volar();
		halcon1.volar();
		
	}
}