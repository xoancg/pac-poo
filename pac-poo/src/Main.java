import java.util.Scanner; // Importamos a clase Scanner para habilitar o programa para ler o que o usuario introduza vía consola

public class Main {

	private static String description;
	private static double cantidad;
	private static double saldo;

	private static Scanner consola = new Scanner(System.in);

	// Método para creación del usuario y su cuenta
	private static void login() {

		// Creamos un usuario vacío

		Usuario miUsuario = new Usuario();

		// Scanner consola = new Scanner(System.in);

		// Nombre

		System.out.println("Introduce tu nombre: ");

		String nombre = consola.nextLine();

		miUsuario.setNombre(nombre);

		// Edad

		System.out.println("Introduce tu edad: ");

		int edad = Integer.parseInt(consola.nextLine()); // Consume salto de línea
		// https://es.stackoverflow.com/questions/121684/problema-clase-scanner-en-java-al-introducir-varios-strings-como-variables

		miUsuario.setEdad(edad);

		// DNI y creación del usuario
		// El bucle se ejecuta mientras el valor de DNI sea nulo.
		do {

			System.out.println("Introduce tu DNI: ");

			String DNI = consola.nextLine();

			miUsuario.setDNI(DNI);

			if (miUsuario.setDNI(DNI) == true) {

				System.out.println("\nHola, " + miUsuario.getNombre() + ". Tu usuario ha sido creado correctamente.");

			} else {

				System.out.println("DNI Incorrecto. Inténtalo de nuevo:");

			}

		} while (miUsuario.getDNI() == null);

		// Creación de cuenta y mensaje de confirmación

		Cuenta miCuenta = new Cuenta(miUsuario);

		System.out.println("\nEl saldo inicial de tu cuenta es de " + Cuenta.getSaldo() + " €.");

		System.out.println("\n>>> " + miCuenta.toString());

	} // login()

	// Función para imprimir el menú en pantalla y seleccionar una opción a realizar
	private static void menu() {

		int accion;

		// Mostramos el menú de acciones disponibles
		do {

			System.out.println("\nRealiza una nueva acción:\n" + "1. Introduce un nuevo gasto\n"
					+ "2. Introduce un nuevo ingreso\n" + "3. Mostrar gastos\n" + "4. Mostrar ingresos\n"
					+ "5. Mostrar saldo\n" + "0. Salir\n");

			// Scanner consola = new Scanner(System.in);

			// Acción seleccionada por el usuario
			accion = Integer.parseInt(consola.nextLine()); // Consume salto de línea

			// https://es.stackoverflow.com/questions/121684/problema-clase-scanner-en-java-al-introducir-varios-strings-como-variables

		} while (accion < 0 || accion > 5);

		switch (accion) {

		case 0: // Salir

			System.out.println("\nSalir.");
			break;

		case 1: // Nuevo gasto

			nuevoGasto();

			break;

		case 2: // Nuevo ingreso

			nuevoIngreso();

			break;

		case 3: // Mostrar gastos

			System.out.println("Éstos son tu gastos:\n");
			break;

		case 4: // Mostrar ingresos

			System.out.println("Éstos son tu ingresos:\n");
			break;

		case 5: // Ver saldo

			System.out.println("El saldo de tu cuenta es: " + Cuenta.getSaldo() + " €");
			break;
		}

	} // menu()

	private static void nuevoGasto() {

		System.out.println("\nIntroduce la descripción del gasto:");

		description = consola.nextLine();

		System.out.println("\nIntroduce la cantidad a gastar (Saldo disponible: " + Cuenta.getSaldo() + " €)");

		cantidad = Double.parseDouble(consola.nextLine()); // Consume salto de línea

		//System.out.println("\n" + cantidad);

		try {

			saldo = Cuenta.addGastos(description, cantidad);

			System.out.println(
					"\nMovimiento realizado. El saldo resultante de tu cuenta es de " + Cuenta.getSaldo() + " €");

		} catch (GastoException saldoInsuficiente) {

			System.out.println(saldoInsuficiente.getMessage());

		}

		menu();

	} // nuevoGasto()*/

	private static void nuevoIngreso() {

		System.out.println("\nIntroduce la descripción del ingreso:");

		description = consola.nextLine();

		System.out.println("\nIntroduce la cantidad a ingresar:");

		cantidad = Double.parseDouble(consola.nextLine()); // Consume salto de línea

		saldo = Cuenta.addIngresos(description, cantidad);

		System.out
				.println("\nMovimiento realizado. El saldo resultante de tu cuenta es de " + Cuenta.getSaldo() + " €");

		menu();

	} // nuevoIngreso()

	public static void main(String[] args) {

		// Creación de usuario y cuenta
		login();

		// Visualización del menú
		menu();

		// Gestión de movimientos de ingreso o gasto
		// operaciones();

		System.out.println("\nFin del programa. \nGracias por utilizar la aplicación.");

	} // main()

} // Main Class