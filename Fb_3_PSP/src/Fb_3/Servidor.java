package Fb_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Servidor {

	public static void main(String[] args) throws UnknownHostException, IOException {
		/*
		 * Utilizar la clase DataInputStream y DataOutputStream
		 * 
		 * 1. Crea un programa servidor que envíe un mensaje a otro programa cliente y
		 * el programa cliente le devuelva el mensaje en minúscula
		 * 
		 * 
		 */
		ServerSocket servidor = new ServerSocket(6001); // entre parentesis va un puerto
		System.out.println("El puerto 6001 esta abierto \n Esperando al cliente");
		Socket cliente = servidor.accept();
		System.out.println("El cliente se ha conectado");
		OutputStream salida = cliente.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);

		flujoSalida.writeUTF("BLAHBLAHBLAHBLAH ");
		salida.close();
		flujoSalida.close();
		
		//RECIBIR EL MENSAJE NE MINUSCULAS
		InputStream entrada = cliente.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);
		System.out.println("Recibiendo: " + flujoEntrada.readUTF());

	}

}
