
public class Usuario {
	
	// Atributos
	private String nombre;
	private int edad;
	private String DNI = null;

	// Constructor de usuarios
	public Usuario() {

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

		this.edad = edad;

	}

	// Getter DNI
	public String getDNI() {

		return DNI;
	}

	// Setter DNI con comprobación de formato correcto del DNI: ocho números y una
	// letra con guión opcional
	public boolean setDNI(String DNI) {

		if (DNI.matches("^[0-9]{8}-?[a-zA-Z]$") == true) {

			this.DNI = DNI.toUpperCase();
			
			return true;

		} else {

			return false;
		}

	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}

}
