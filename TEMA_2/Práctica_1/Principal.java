package Práctica_1;

public class Principal extends Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Progrma pincipal: ");

Hilo h1 = new Hilo();
Hilo2 h2 = new Hilo2();
h1.start();
h2.start();
//si no hacemos le join, cada hilo va por su parte
h1.join();
h2.join();
System.out.println("Programa principal terminado");

	}

}
