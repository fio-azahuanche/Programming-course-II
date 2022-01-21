public class Cuenta{
	
	//varible de instancia o atributo
	private double saldo;
	
	//Constructor
	public Cuenta(double saldoInicial)
	{
		if(saldoInicial>0.0)
			saldo = saldoInicial;
			
	}
	
	//Metodos abonar y obtenerSaldo
	public void abonar (double monto)
	{
		saldo = saldo + monto;
	}
	
	public double obtenerSaldo()
	{
		return saldo;
	}
}