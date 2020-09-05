
public class Ingreso extends Dinero {

	// Constructor
	public Ingreso(double ingreso, String description) {
		
		dinero = ingreso;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Ingreso [dinero=" + dinero + ", description=" + description + "]";
	}
	
}
