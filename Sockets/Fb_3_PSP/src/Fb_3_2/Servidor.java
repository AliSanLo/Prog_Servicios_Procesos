package Fb_3_2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {
		/*
		 * 2. Crea un programa cliente que introduzca por teclado un número entero y se
		 * lo envíe al servidor. El servidor le devolverá el cuadrado del número
		 */

		// le atribuimos un puerto
		ServerSocket servidor = new ServerSocket(6002);
		System.out.println("El puerto 6002 esta abierto \n Esperando al cliente");

		// confirmamos la conexion
		Socket cliente = servidor.accept();
		System.out.println("El cliente se ha conectado");

		// Recibir datos del Cliente
		InputStream entrada = cliente.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);

		int numero = flujoEntrada.readInt();
		System.out.println("Recibiendo: " + numero);

		// Calculamos el cuadrado
		int cuadrado = numero * numero;
		System.out.println("El cuadrado del número " + numero + " es " + cuadrado);

	}

}
