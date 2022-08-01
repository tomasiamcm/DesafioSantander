package singleton;

/**
 * Singleton "Lazy Holder" - modo básico.
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * @author Tomásia Mussurí
 *
 */

public class SingletonLazyHolder {
	private static class InstanciaHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanciaHolder.instancia;
	}
}
