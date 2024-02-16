package Fb3_3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException, NotSerializableException {
		/*
		 * 3. Crea un programa con un objeto rectángulo que tenga implementado el método
		 * del área y del perímetro. Además incluirá los atributos área y perímetro (los
		 * dejamos inicializados a 0.0).
		 * 
		 * El objeto se va a enviar del cliente al servidor, el servidor realizará la
		 * operación de área y perímetro y lo meterá en los atributos anteriores
		 * (setter's con los métodos)
		 * 
		 * Posteriormente se le devolverá el objeto y el cliente mostrara el valor de
		 * esos atributos. (getter's)
		 */

		Scanner scn = new Scanner(System.in);

		Socket conexion = new Socket("127.0.0.1", 6003);
		// conexion al server
		System.out.println("Me he conectado al server");

		OutputStream salida = conexion.getOutputStream();
		ObjectOutputStream flujoSalida = new ObjectOutputStream(salida);

		// crear un objeto rectangulo para poder trabajar con la clase
		Rectangulo rectangulo;

		// introducimos valores de las variables
		System.out.print("Ingrese la base del rectángulo: ");
		double base = scn.nextDouble();
		System.out.print("Ingrese la altura del rectángulo: ");
		double altura = scn.nextDouble();

		rectangulo = new Rectangulo(base, altura);

		// enviamos el objeto con el valor establecido
		flujoSalida.writeObject(rectangulo);

		salida.close();
		flujoSalida.close();
        scn.close();

	}

}
