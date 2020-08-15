
public class Usuario {

	private String nombre;
	private int edad;
	private String DNI;

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
	// El enunciado dice que la función debe devolver un booleano conforme el DNI es
	// correcto o no. De momento, obviamos este requisito por resultar innecesario.
	public void setDNI(String DNI) {

		if (DNI.matches("^[0-9]{8}-?[a-zA-Z]$") == true) {

			this.DNI = DNI.toUpperCase();

		} else {

			this.DNI = null;
		}

	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}

}
