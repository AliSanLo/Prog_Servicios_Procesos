package EntraJardin;

public class EntraJardin extends Thread {

private RecursoJardin jardin;

public EntraJardin(String name, RecursoJardin jardin) {
	super(name);
	this.jardin = jardin;
}
@Override
public void run() {
    jardin.decrementaCuenta();
}
}





