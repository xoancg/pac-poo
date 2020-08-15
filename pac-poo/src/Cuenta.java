
public class Cuenta {

	// Atributos
	private double saldo;
	private Usuario usuario;
	//private List<Gasto> gastos;
	//private List<Ingreso> ingresos;
	
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
	/*
	public double addIngresos (String description, double cantidad) {
		
	}
	
	double addGastos (String description, double cantidad) {
		
	}
	
	public List<Ingresos> getIngresos() {
		
		return ingresos;
	}
	
	public List<Gastos> getGastos() {
		
		return gastos;
	}*/

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", usuario=" + usuario + "]";
	}
	
	
}
