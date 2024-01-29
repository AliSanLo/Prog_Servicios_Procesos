package PandaMetropolitano;

public class Enfermero {
	private String nombre;

	public Enfermero(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void tiempoVacunacion(int segundos) throws InterruptedException {
		Thread.sleep(segundos * 1000);
	}

	public void vacunar(ListaPaciente list, long timeStamp) throws InterruptedException {
		System.out.println("El enfermero " + nombre + " empieza " + list.getNombre() + " TIEMPO: "
				+ (System.currentTimeMillis() - timeStamp) / 1000);

		for (int i = 0; i < list.getTiempoPacientes().length; i++) {
			tiempoVacunacion(list.getTiempoPacientes()[i]);
			System.out.println("Vacunando al paciente " + (i + 1) + " -> TIEMPO TRABAJADO: "
					+ (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
		}

		System.out.println("El enfermero " + nombre + " ha TERMINADO en " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
	}
}
