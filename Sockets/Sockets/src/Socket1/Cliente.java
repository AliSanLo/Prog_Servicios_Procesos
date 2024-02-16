package Socket1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws IOException {
		Socket conexion = new Socket("127.0.0.1", 6001);
		/*
		 * entre parentesis se pone la IP desde la que se conecta el cliente y el puerto
		 * del servidor al que se quiere conectar.
		 */
		System.out.println("Me he conectado al server");
		OutputStream salida = conexion.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);

//GRACIAS A LO QUE HAY HASTA AQUI, YA PUEDE HABER UN INTERCAMBIO DE DATOS PRIMITIVO	
		// Escribimos en el socket
		flujoSalida.writeUTF("BLAHBLAHBLAHBLAH SOY EL CLIENTE");
//RECBIR MENSAJES DEL SERVIDOR
		InputStream entrada = conexion.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);

		System.out.println("Recibiendo: " + flujoEntrada.readUTF());

		salida.close();
		flujoSalida.close();
	}

}
