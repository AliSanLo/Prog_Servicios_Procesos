package Fb3_3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NotSerializableException {
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

		ServerSocket servidor = new ServerSocket(6003);

		System.out.println("El puerto 6003 esta abierto \n Esperando al cliente");

		// confirmamos la conexion
		Socket cliente = servidor.accept();
		System.out.println("El cliente se ha conectado");

		// Recibir datos del Cliente
		InputStream entrada = cliente.getInputStream();
		ObjectInputStream flujoEntrada = new ObjectInputStream(entrada);

		// Deserializamos el objeto Rectangulo
		Rectangulo rectangulo = (Rectangulo) flujoEntrada.readObject();

		// Calculamos el área usando los valores de base y altura
		double areaRectangulo = rectangulo.calcularArea();
		double perimetro = rectangulo.calcularPerimetro();

		// Mostrar el área del rectángulo recibido
		System.out.println("El área del rectángulo recibido es de : " + areaRectangulo);
		System.out.println("El perimetro del rectángulo recibido es de : " + perimetro);

		flujoEntrada.close();
		entrada.close();
		cliente.close();
		servidor.close();
	}

}
