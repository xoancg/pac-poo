import java.util.List;

public class Cuenta {

	// Atributos
	private Usuario usuario;
	private double saldo;
	private List<Gasto> gastos; // Lista 'gastos' de tipo Gasto
	private List<Ingreso> ingresos; // Lista 'ingresos' de tipo Ingreso
	
	// Constructor cuenta	
	public Cuenta (Usuario usuario) {
		
		this.usuario = usuario;
		this.saldo = 0.0;
		
	}
	
	// Getter saldo
	public double getSaldo() {
		
		return saldo;
	}
	
	// Setter saldo
	public void setSaldo (double saldo) {
		
	}
	
	// Getter usuario
	public Usuario getUsuario() {
		
		return usuario;
	}
	
	// Setter usuario
	public void setUsuario(Usuario usuario) {
		
		this.usuario = usuario;
	}
	
	public double addIngresos (String description, double cantidad) {
		
		saldo = saldo - cantidad;
		
		return saldo; // this.saldo?
	}
	
	public double addGastos (String description, double cantidad) {
		
		if (cantidad >= saldo) {

			saldo = saldo - cantidad;
			
			return saldo; // this.saldo?
			
		} else  {
			
			return -1; // Por exemplo, xa que o saldo nunca poderá ser negativo.
			
		}

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
