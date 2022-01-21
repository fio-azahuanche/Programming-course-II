//La clase
public class Robot {
	//Atributos
	String estatus;
	int velocidad;
	float temperatura;
	
	public Robot(){
		estatus="explorando";
		velocidad=2;
		temperatura=510.0F;
	}
	
	//crear pimer comportamiento o metodo
	public void comprobarTemperatura()
	{
		if(temperatura>660)
		{estatus = "Volviendo a casa";
		velocidad=5;
		}
	}
	//otro metodo
	public void mostrarAtributos()
	{
		System.out.println("Su situacion es "+estatus);
		System.out.println("Su rapidez es "+velocidad);
		System.out.println("Su temperatura es "+temperatura);
	}
}