package Práctica_1;

public class Hilo2 extends Thread{
	public void run(){
		for (int i = 20 ; i <=30;  i++ ) {
			System.out.println("Soy el hilo " + i);
		}
	}
}
