
public abstract class Dinero {

	// No podemos crear objetos en clases abstractas
	protected double dinero;
	protected String description;
	
	// Getter dinero
	public double getDinero() {
		
		return dinero;
	}
	
	// Setter dinero
	public void setDinero (double dinero) {
		
		this.dinero = dinero;
	}
	
	// Getter description
	public String getDescription() {
		
		return description;
	}
	
	// Setter description
	public void setDescription(String description) {
		
		this.description = description;
	}
}
