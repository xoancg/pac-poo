
public class Gasto extends Dinero {

	// Constructor
	public Gasto(double dinero, String description) {
		
		this.dinero = dinero;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Gasto [dinero=" + dinero + ", description=" + description + "]";
	}
}
// Proba Git