
public class Usuario {

	private String nombre;
	private int edad;
	private String DNI;

	// Constructor de usuarios
	public Usuario() {
		
		//this.nombre = nombre;
		//this.edad = edad;
		//this.DNI = DNI;
		
	}
	
	// Getter nombre
	public String getNombre() {

		return nombre;
	}

	// Setter nombre
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	// Getter edad
	public int getEdad() {

		return edad;
	}

	// Setter edad
	public void setEdad(int edad) {

	}

	// Getter DNI
	public String getDNI() {

		return DNI;
	}

	// Setter DNI: Comprobar formato correcto
	public setDNI(String DNI) {
		
		if (validarDNI(DNI)) {
			
			this.DNI = DNI;
			
			return DNI;
		}

	}

	public boolean validarDNI (String DNI) {
		
		return DNI.matches("^[0-9]{8}[A-Z]$");
		// "^ $" Indicamos inicio e fin
		
	}
	
}
