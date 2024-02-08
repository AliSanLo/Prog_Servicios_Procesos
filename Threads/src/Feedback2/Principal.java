package Feedback2;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// creamos el objeto con el que trabajaremos de cada hilo
		sum23 h1 = new sum23();
		sum13 h2 = new sum13();
		sum15 h3 = new sum15();
//run sumatorios 
		h1.start();
		h2.start();
		h3.start();
//para que se imprima a la vezz los tres hilos
		h1.join();
		h2.join();
		h3.join();

		int media = (h1.suma + h2.suma + h3.suma) / 3;
		System.out.println("Resultado: " + media);

		System.out.println("Programa principal terminado");

	}

}
