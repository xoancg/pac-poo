
public class Ingreso extends Dinero {

	// Constructor
	public Ingreso(double dinero, String description) {
		
		this.dinero = dinero;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Ingreso [dinero=" + dinero + ", description=" + description + "]";
	}
	
}
