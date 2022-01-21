//Pregunta 2.28
import javax.swing.JOptionPane;

public class Circunferencia {
	public static void main (String args[])
	{
		String radio;
		radio=JOptionPane.showInputDialog("Introduzca el radio:");
		
		int r;
		
		r=Integer.parseInt(radio);
		
		System.out.printf("El diametro es %d\n",2*r);
		System.out.printf("\nLa longitud de la circunferencia es %f\n",2*Math.PI*r);
		System.out.printf("\nEl area es %f\n",Math.PI*r*r);
		
		System.exit(0);
	}
}