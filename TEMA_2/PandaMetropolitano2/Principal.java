package PandaMetropolitano2;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		ListaPaciente l1 = new ListaPaciente("l1", new int[]{ 3, 5, 7, 2 });
		ListaPaciente l2 = new ListaPaciente("l2", new int[]{ 4, 5, 2, 6 });

		long inicio = System.currentTimeMillis();
		Enfermero e1 = new Enfermero("Valentino", l2, inicio);
		Enfermero e2 = new Enfermero("Mark", l1, inicio);
		
		e1. start();
		e2.start();

		
	}

}
