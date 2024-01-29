package PandaMetropolitano;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		ListaPaciente l1 = new ListaPaciente("l1", new int[]{ 3, 5, 7, 2 });
		ListaPaciente l2 = new ListaPaciente("l2", new int[]{ 4, 5, 2, 6 });

		Enfermero e1 = new Enfermero("Valentino");
		Enfermero e2 = new Enfermero("Mark");

		long inicio = System.currentTimeMillis();

		e1.vacunar(l1, inicio);
		e2.vacunar(l2, inicio);

	}

}
