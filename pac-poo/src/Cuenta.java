import java.util.List;

public class Cuenta {

	// Atributos
	private Usuario usuario;
	private static double saldo;
	private List<Gasto> gastos; // Lista 'gastos' de tipo Gasto
	private List<Ingreso> ingresos; // Lista 'ingresos' de tipo Ingreso

	// Constructor cuenta
	public Cuenta(Usuario usuario) {

		this.usuario = usuario;
		Cuenta.saldo = 0.0;

	}

	// Getter saldo
	public static double getSaldo() {

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

	public static double addIngresos(String description, double cantidad) {

		saldo = saldo + cantidad;

		return saldo; // this.saldo?
	}

	public static double addGastos(String description, double cantidad) throws GastoException {

		if (cantidad > saldo) {

			throw new GastoException();

		} else {

			saldo = saldo - cantidad;
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
