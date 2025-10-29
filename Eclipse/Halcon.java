package taller_1;

public class Halcon extends Animales implements Vuelacion{

	public Halcon(String nombre, String tipo, String habitad, String dieta, String c_actividad, String sonido) {
		super(nombre, tipo, habitad, dieta, c_actividad, sonido);
	}

	@Override
	public void volar() {
	 System.out.println(this.getClass().getSimpleName()+" puede volar");
	}
}
