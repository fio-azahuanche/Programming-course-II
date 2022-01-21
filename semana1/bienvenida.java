// Escribir su comentario-tipo de comentario de linea
import java.util.Scanner;
/* este es un tipo de 
 comentario de multiples lineas*/
 
public class Bienvenido {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.print("Escriba un numero:");
		numero = entrada.nextInt();
		//System.out.println("Bienvenidos al Curso\nde programacion en Java!");
		/*String variable = "ProgramacionII";
		System.out.println(variable);*/
		
		//int numero = 45;
		System.out.println("La raiz cuadrada de "+numero+" es "+Math.sqrt(numero));
		
	}
}
