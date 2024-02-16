package Fb3_3;

import java.io.Serializable;

public class Rectangulo implements Serializable{

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
	private double area = 0.0;
	private double perimetro = 0.0;
	private double base;
	private double altura;

	// getter y setter vacios
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Rectangulo(double area, double perimetro, double base, double altura) {
		super();
		this.area = area;
		this.perimetro = perimetro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;

	}

	public double calcularPerimetro() {
		double perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

	public double calcularArea() {
		double totalarea = base * altura;
		return totalarea;
	}

}
