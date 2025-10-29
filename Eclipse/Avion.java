package taller_1;

public class Avion implements Vuelacion{

	@Override
	public void volar() {
		 System.out.println(this.getClass().getSimpleName()+" puede volar");
	}
}