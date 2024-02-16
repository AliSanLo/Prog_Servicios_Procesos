package Fb_3_2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		/*
		 * 2. Crea un programa cliente que introduzca por teclado un número entero y se
		 * lo envíe al servidor. El servidor le devolverá el cuadrado del número
		 */
		Scanner scn = new Scanner(System.in);

		Socket conexion = new Socket("127.0.0.1", 6002);
		// conexion al server
		System.out.println("Me he conectado al server");

		OutputStream salida = conexion.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);

		System.out.println("Introduce un numero: ");
		int num = scn.nextInt();
		
		flujoSalida.writeInt(num);
		
		salida.close();
		flujoSalida.close();
	}

}
