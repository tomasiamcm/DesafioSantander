package singleton;

/**
 * Singleton "apressado" - modo básico
 * @author Tomásia Mussurí
 *
 */

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
