import java.util.Scanner; //Importamos a clase Scanner para habilitar o programa para ler o que o usuario introduza vía consola

public class Main {

	// Método para creación del usuario
	private static void login() {

		// Creamos un usuario vacío
		
		Usuario miUsuario = new Usuario();	
		
		Scanner consola = new Scanner(System.in);
		
		// Nombre
		
		System.out.println("Introduce tu nombre: ");

		String nombre = consola.nextLine();

		miUsuario.setNombre(nombre);
		
		// Edad
		
		System.out.println("Introduce tu edad: ");

		//int edad = consola.nextInt();
		int edad = Integer.parseInt(consola.nextLine());
		// https://es.stackoverflow.com/questions/121684/problema-clase-scanner-en-java-al-introducir-varios-strings-como-variables
				
		miUsuario.setEdad(edad);
		
		// DNI

		do {

			System.out.println("Introduce tu DNI: ");
			
			String DNI = consola.nextLine();
			
			miUsuario.setDNI(DNI);
		
			if (miUsuario.getDNI() != null) {
				
				System.out.println("\nHola, " + miUsuario.getNombre() + ". Sesión iniciada correctamente.\n");
				
			} else {
												
				System.out.println("DNI Incorrecto. Inténtao de novo.");
				
				//String DNI = consola.nextLine();
				
			}

				
		} while (miUsuario.getDNI() == null);
		
		System.out.println(miUsuario.toString());

		// consola.close();
	}

	private static void menu() {

		int accion;

		System.out.println(
				"\nRealiza una nueva acción:\n" + "1. Introduce un nuevo gasto\n" + "2. Introduce un nuevo ingreso\n"
						+ "3. Mostrar gastos\n" + "4. Mostrar ingresos\n" + "5. Mostrar saldo\n" + "0. Salir\n");

		Scanner consola = new Scanner(System.in);

		System.out.println("Elige una opción: ");

		accion = consola.nextInt();

		System.out.println("Escogiste la opción " + accion);

		// consola.close();

	}

	public static void main(String[] args) {

		// Creación del usuario y sus datos
		login();

		// Creación de la cuenta

		// Visualización del menú
		menu();

		System.out.println("\nFin del programa. \nGracias por utilizar la aplicación.");

	}

}