package Fb_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket conexion = new Socket("127.0.0.1", 6001);
		System.out.println("Me he conectado al server");
		InputStream entrada = conexion.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);
		System.out.println("Recibiendo: " + flujoEntrada.readUTF());

		// DEVOLVEMOS EL MENSAJE EN MINUSCULA
		OutputStream salida = conexion.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);

		flujoSalida.writeUTF(flujoEntrada.readUTF().toLowerCase());

		entrada.close();
		flujoEntrada.close();
	}

}
