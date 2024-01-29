package PandaMetropolitano2;

public class Enfermero extends Thread{
	private String nombre;
	private ListaPaciente list;
	private long timeStamp;
	

	
	public Enfermero(String nombre, ListaPaciente list, long timeStamp) {
		super();
		this.nombre = nombre;
		this.list = list;
		this.timeStamp = timeStamp;
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
	
	public void run() {
		System.out.println("El enfermero " + nombre + " empieza " + list.getNombre() + " TIEMPO: "
				+ (System.currentTimeMillis() - timeStamp) / 1000);

		for (int i = 0; i < list.getTiempoPacientes().length; i++) {
			try {
				tiempoVacunacion(list.getTiempoPacientes()[i]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Vacunando al paciente " + (i + 1) + " -> TIEMPO TRABAJADO: "
					+ (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
		}

		System.out.println("El enfermero " + nombre + " ha TERMINADO en " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
	}
}
