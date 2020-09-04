import java.util.List;
import java.util.Scanner; // Importamos a clase Scanner para habilitar o programa para ler o que o usuario introduza vía consola

public class Main {

	private static String description;
	private static double cantidad;

	// Clase Scanner para que el usuario pueda introducir los datos por consola
	private static Scanner consola = new Scanner(System.in);

	// Variable de objeto para poder acceder a las propiedades de 'miCuenta' desde
	// toda la clase
	private static Cuenta miCuenta;

	// Método para creación del usuario y su cuenta
	private static void login() {

		// Creamos un usuario vacío y el usuario introducirá nombre, edad y DNI
		Usuario miUsuario = new Usuario();

		System.out.println("Introduce tu nombre: ");

		String nombre = consola.nextLine();

		miUsuario.setNombre(nombre);

		System.out.println("Introduce tu edad: ");

		int edad = Integer.parseInt(consola.nextLine()); // Consume salto de línea
		// https://es.stackoverflow.com/questions/121684/problema-clase-scanner-en-java-al-introducir-varios-strings-como-variables

		miUsuario.setEdad(edad);

		// Cuando el valor de DNI deje de ser nulo, se crea el usuario
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
		miCuenta = new Cuenta(miUsuario);

		System.out.println("\nEl saldo inicial de tu cuenta es de " + miCuenta.getSaldo() + " €.");

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

			System.out.println("\nTu gastos han sido los siguientes:\n");

			mostrarGastos();

			break;

		case 4: // Mostrar ingresos

			System.out.println("\nTu ingresos han sido los siguientes:\n");

			mostrarIngresos();

			break;

		case 5: // Ver saldo

			mostrarSaldo();

			break;
		}

	} // menu()

	private static void nuevoGasto() {

		System.out.println("\nIntroduce la descripción del gasto:");

		description = consola.nextLine();

		System.out.println("\nIntroduce la cantidad a gastar (Saldo disponible: " + miCuenta.getSaldo() + " €)");

		cantidad = Double.parseDouble(consola.nextLine()); // Consume salto de línea

		// Si la cantidad del gasto es mayor que el saldo disponible, se lanzará la
		// excepción 'saldoInsuficiente' de tipo 'GastoException', la cual será
		// capturada para que el programa se siga ejecutando y muestre al usuario un
		// mensaje de error. El movimiento no se realizará y se mostrará el menú de
		// opciones para que el usuario pueda realizar una nueva acción.
		try {

			miCuenta.addGastos(description, cantidad);

			System.out.println(
					"\nMovimiento realizado. El saldo resultante de tu cuenta es de " + miCuenta.getSaldo() + " €");

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

		miCuenta.addIngresos(description, cantidad);

		System.out.println(
				"\nMovimiento realizado. El saldo resultante de tu cuenta es de " + miCuenta.getSaldo() + " €");

		menu();

	} // nuevoIngreso()

	private static void mostrarGastos() {

		List<Gasto> listaGastos = miCuenta.getGastos();

		for (int i = 0; i < listaGastos.size(); i++) {

			System.out.println(listaGastos.get(i));
		}

		menu();
	}

	private static void mostrarIngresos() {

		List<Ingreso> listaIngresos = miCuenta.getIngresos();

		for (int i = 0; i < listaIngresos.size(); i++) {

			System.out.println(listaIngresos.get(i));
		}

		menu();
	}

	private static void mostrarSaldo() {

		System.out.println("\nEl saldo actual de tu cuenta es de " + miCuenta.getSaldo() + " €");

		menu();
	}

	public static void main(String[] args) {

		// Creación de usuario y cuenta
		login();

		// Visualización del menú
		menu();

		// Gestión de movimientos de ingreso o gasto

		System.out.println("\nFin del programa. \nGracias por utilizar la aplicación.");

	} // main()

} // Main Class