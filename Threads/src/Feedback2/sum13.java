package Feedback2;

public class sum13 extends Thread {
	int suma = 0;

	public void run() {
		int suma = 0;
		for (int i = 13; i >= 1; i--) {
			suma += i;
			System.out.println("Sumatorio de 13: " + suma);

		}
	}

}
