
public class GastoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Excepción: no hay saldo suficiente
	// Constructor
	public GastoException() {
		
		// Sobreescribimos el método getMessage() de la clase java.lang.Exception
		super("\nOperación no realizada por saldo insuficiente. El saldo disponible es de " + Cuenta.getSaldo() + " €");

	}

}
