package Socket1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(6001); // entre parentesis va un puerto
		System.out.println("El puerto 6001 esta abierto \n Esperando al cliente");
		Socket cliente = servidor.accept();
		// el servidor tiene que aceptar la conexion
		System.out.println("El cliente se ha conectado");

		// leer los dato que me envia
		InputStream entrada = cliente.getInputStream();
		// clase que permite trabajar con datos primitivos.
		// recoge un formato definido
		DataInputStream flujoEntrada = new DataInputStream(entrada);

		// GRACIAS A LO QUE HAY HASTA AQUI, YA PUEDE HABER UN INTERCAMBIO DE DATOS
		// PRIMITIVO
		System.out.println("Recibiendo: " + flujoEntrada.readUTF());

//SI EL SERVIDOR QUIERE ESCRIBIR
		OutputStream salida = cliente.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);

		flujoSalida.writeUTF("HOLAHOLAHOLAHOLA SPY EL SERVIDOR");

		
		entrada.close();
		flujoEntrada.close();

	}

}
