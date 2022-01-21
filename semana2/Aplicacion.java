//Pregunta 2.24
import javax.swing.JOptionPane;
public class Aplicacion {
	public static void main (String args [])
	{
		String numero1, numero2, numero3, numero4, numero5;
		
		numero1=JOptionPane.showInputDialog("Escriba el primer numero:");
		numero2=JOptionPane.showInputDialog("Escriba el segundo numero:");
		numero3=JOptionPane.showInputDialog("Escriba el tercer numero:");
		numero4=JOptionPane.showInputDialog("Escriba el cuarto numero:");
		numero5=JOptionPane.showInputDialog("Escriba el quinto numero:");
		
		int num1, num2, num3, num4, num5;
		
		num1=Integer.parseInt(numero1);
		num2=Integer.parseInt(numero2);
		num3=Integer.parseInt(numero3);
		num4=Integer.parseInt(numero4);
		num5=Integer.parseInt(numero5);
		
	//Encontramos el menor numero
		 
		int menor = num1;
		
		if ( num2 < menor)
			menor = num2;
		if ( num3 < menor)
			menor = num3;
		if (num4 < menor)
			menor = num4;
		if (num5 < menor)
			menor = num5;
			
	//Encontramos el mayor numero
		
		int mayor = num1;
		
		if (num2 > mayor)
			mayor = num2;
		if (num3 > mayor)
			mayor = num3;
		if (num4 > mayor)
			mayor = num4;
		if(num5 > mayor)
			mayor = num5;
			
			JOptionPane.showMessageDialog(null,"El mayor numero es "+mayor+"\ny el menor numero es "+menor,"Aplicacion",JOptionPane.PLAIN_MESSAGE);
	}
}
