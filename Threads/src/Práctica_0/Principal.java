package Práctica_0;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Ejecutamos la aplicación");
		//constructor del ProcessBuilder
		ProcessBuilder p = new ProcessBuilder("calc.exe");
		p.start();
		//el programa se para 3000 segundos
		Thread.sleep(3000); 
		//fb1 es pregunta de exm		

	}

}
