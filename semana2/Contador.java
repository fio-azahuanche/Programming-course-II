//Pregunta 2.32

import javax.swing.JOptionPane;
public class Contador {
	public static void main (String args [])
	{
		String numero1, numero2, numero3, numero4, numero5;
		
		numero1=JOptionPane.showInputDialog("Escriba el primer numero:");
		numero2=JOptionPane.showInputDialog("Escriba el segundo numero:");
		numero3=JOptionPane.showInputDialog("Escriba el tercer numero:");
		numero4=JOptionPane.showInputDialog("Escriba el cuarto numero:");
		numero5=JOptionPane.showInputDialog("Escriba el quinto numero:");
		
		int num1, num2,num3,num4,num5;
		
		num1=Integer.parseInt(numero1);
		num2=Integer.parseInt(numero2);
		num3=Integer.parseInt(numero3);
		num4=Integer.parseInt(numero4);
		num5=Integer.parseInt(numero5);
		
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		
		if ( num1 > 0)
			positivos = positivos + 1;
			
		if ( num1 < 0)
			negativos = negativos + 1;
			
		if ( 0 == num1)
			ceros = ceros + 1;
			
		if ( num2 > 0)
			positivos = positivos + 1;
			
		if ( num2 < 0)
			negativos = negativos + 1;
			
		if ( 0 == num2)
			ceros = ceros + 1;
			
		if ( num3 > 0)
			positivos = positivos + 1;
			
		if ( num3 < 0)
			negativos = negativos + 1;
			
		if ( 0 == num3)
			ceros = ceros + 1;
			
		if ( num4 > 0)
			positivos = positivos + 1;
			
		if ( num4 < 0)
			negativos = negativos + 1;
			
		if ( 0 == num4)
			ceros = ceros + 1;
			
		if ( num5 > 0)
			positivos = positivos + 1;
			
		if ( num5 < 0)
			negativos = negativos + 1;
		
		if ( 0 == num5)
				ceros = ceros + 1;
		
		JOptionPane.showMessageDialog(null,"\nDe los numeros introducidos,"+positivos+" son positivos","POSITIVOS",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"\nDe los numeros introducidos,"+negativos+" son negativos","NEGATIVOS",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"\nDe los numeros introducidos,"+ceros+" son ceros","CEROS",JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);	
	}
}
  