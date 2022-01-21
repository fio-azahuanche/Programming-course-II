//Utilizacion de Scanner
import java.util.Scanner;

public class Temperatura2 {
	public static void main (String args [])
	{
		Scanner variable = new Scanner (System.in);
		
		//Declaramos las variables
		double x;
		double y;
		
		//Pedimos el grado en Farenheit
		System.out.print("Ingrese en grados farenheit ");
		x = variable.nextDouble();
		//Convertimos Farenheit a Celsius
		y=(x-32)*5/9;
		
		//Imprimimos la Temperatura en Celsius
		System.out.print("La temperatura es "+y+" celsius");
	}//Fin de main
}//Fin de class