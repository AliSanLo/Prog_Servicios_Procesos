package EntraJardin;

public class RecursoJardin {
private int cuenta;

public RecursoJardin() {
	super();
	this.cuenta = 100;
}

public synchronized void incrementaCuenta() {
	System.out.println("Hilo " + Thread.currentThread().getName() + "entra en el jardin");
	cuenta ++;
	System.out.println(cuenta +" en e jardin");

}
/*synchronized sirve para que los distintos metodos no se pisen entre si y actuen a la vez si 
 * no queremos, haciendo cosas raras
 * Al contrario que con el join()
*/
public synchronized void decrementaCuenta() {
	System.out.println("Hilo " + Thread.currentThread().getName() + "sale del jardin");
	cuenta --;
	System.out.println(cuenta +" en e jardin");

}

}
