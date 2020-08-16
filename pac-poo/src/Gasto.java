
public class Gasto extends Dinero {
	// Proba Git2+1
	// Constructor
	public Gasto(double dinero, String description) {
		
		this.dinero = dinero;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Gasto [dinero=" + dinero + ", description=" + description + "]";
		//System.out.println("Hola!");
	}
}

// Proba Git Linux