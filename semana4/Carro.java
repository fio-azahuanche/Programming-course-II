public class Carro{
	private double peso;
	private double altura;
	private boolean encendido = false;
	
	public Carro(){
		this.peso=100;
		this.altura=1.3;
	}
	public double obtenerPeso(){
		return this.peso;
	}
	
	public void encender(){
		this.encendido=true;
		System.out.println("El carro esta encendido");
	}
	
	public void apagar(){
		this.encendido= false;
		System.out.println("El carro esta apagado");
		
	}
	
	public void estado(){
		if (this.encendido==true)
			System.out.println("El carro esta encendido");
		else
			System.out.println("El carro esta apagado");
			
	}
}