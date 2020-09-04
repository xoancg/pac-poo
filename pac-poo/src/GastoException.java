
public class GastoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Excepción: no hay saldo suficiente
	// Constructor
	public GastoException() {
		
		// Sobreescribimos el método getMessage() de la clase java.lang.Exception
		super("\n¡Vaya! Va a ser que no dispones de saldo suficiente. El movimiento no ha sido realizado.");

	}

}
