package Feedback2;

public class sum15 extends Thread {
	int suma = 0;

	public void run() {
		suma = 0;
		for (int i = 15; i >= 1; i--) {
			suma += i;
			System.out.println("Sumatorio de 15: " + suma + " ");
		}
	}

}
