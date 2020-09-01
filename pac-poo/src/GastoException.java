
public class GastoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Excepción: no hay saldo suficiente
	// Constructor
	public GastoException() {
		
		super("Operación no realizada por saldo insuficiente.");
		
	}

}
