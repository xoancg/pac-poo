
public class Gasto extends Dinero {

	// Constructor
	public Gasto(double gasto, String description) {
		
		dinero = gasto;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Gasto [dinero=" + dinero + ", description=" + description + "]";

	}
}
