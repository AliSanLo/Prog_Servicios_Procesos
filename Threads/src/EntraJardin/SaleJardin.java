package EntraJardin;

public class SaleJardin extends Thread {
	private RecursoJardin jardin;

	public SaleJardin(String name, RecursoJardin jardin) {
		super();
		this.jardin = jardin;
	}

	@Override
	public void run() {
		jardin.decrementaCuenta();
	}
}
