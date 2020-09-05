import java.util.ArrayList; // Para poder construir ArrayList<>
import java.util.List; // Para poder construir ArrayList<>

public class Cuenta {

	// Atributos
	private static double saldo;
	private Usuario usuario;
	private static List<Gasto> gastos; // Lista 'gastos' de tipo Gasto
	private static List<Ingreso> ingresos; // Lista 'ingresos' de tipo Ingreso

	// Constructor de cuenta
	public Cuenta(Usuario usuario) {

		this.usuario = usuario;
		saldo = 0.0;

		// Inicializamos las listas
		ingresos = new ArrayList<>();
		gastos = new ArrayList<>();
	}

	// Getter saldo
	public double getSaldo() {

		return saldo;
	}

	// Setter saldo
	public void setSaldo(double saldo) {

	}

	// Getter usuario
	public Usuario getUsuario() {

		return usuario;
	}

	// Setter usuario
	public void setUsuario(Usuario usuario) {

		this.usuario = usuario;
	}

	public double addIngresos(String description, double cantidad) {

		saldo = saldo + cantidad;

		ingresos.add(new Ingreso(cantidad, description));

		return saldo; // this.saldo?
	}

	public double addGastos(String description, double cantidad) throws GastoException {

		if (cantidad > saldo) {

			throw new GastoException();

		} else {

			saldo = saldo - cantidad;

			gastos.add(new Gasto(cantidad, description));
		}

		return saldo; // this.saldo?
	}

	// Getter ingresos
	public List<Ingreso> getIngresos() {

		return ingresos;
	}

	// Getter gastos
	public List<Gasto> getGastos() {

		return gastos;
	}

	@Override
	public String toString() {

		return "Cuenta [saldo=" + saldo + ", usuario=" + usuario + "]";
	}

}