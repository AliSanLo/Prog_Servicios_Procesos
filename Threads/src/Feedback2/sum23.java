package Feedback2;

public class sum23 extends Thread {
	int suma = 0;

	public void run() {
		int suma = 0;
		for (int i = 23; i >= 1; i--) {
			suma += i;
			System.out.println("Sumatorio de 23: " + suma);

		}
		System.out.println("Sumatorio de 23: " + suma);
	}

}
