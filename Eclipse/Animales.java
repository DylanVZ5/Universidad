package taller_1;

public class Animales {

	protected String nombre;
	protected String tipo;
	protected String habitad;
	protected String dieta;
	protected String c_actividad;
	protected String sonido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getHabitad() {
		return habitad;
	}
	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	public String getC_actividad() {
		return c_actividad;
	}
	public void setC_actividad(String c_actividad) {
		this.c_actividad = c_actividad;
	}
	
	public String getSonido() {
		return sonido;
	}
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	public Animales(String nombre, String tipo, String habitad, String dieta, String c_actividad, String sonido) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.habitad = habitad;
		this.dieta = dieta;
		this.c_actividad = c_actividad;
		this.sonido = sonido;
	}
	
	void sonido() {
		System.out.println("El sonido del "+this.getClass().getSimpleName()+" es un "+ getSonido());
		
	}
}
