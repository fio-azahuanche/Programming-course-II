//Pregunta 2.16
import javax.swing.JOptionPane;
public class Comparacion {
	public static void main (String args [])
	{
		String numero1, numero2;
		
		numero1=JOptionPane.showInputDialog("Escriba el primer numero:");
		numero2=JOptionPane.showInputDialog("Escriba el segundo numero:");
		int num1, num2;
		
		num1=Integer.parseInt(numero1);
		num2=Integer.parseInt(numero2);
		
		if(num1<num2)
			JOptionPane.showMessageDialog(null,num2+" es mas grande que "+num1,"Comparación",JOptionPane.PLAIN_MESSAGE);
		if(num1>num2)
			JOptionPane.showMessageDialog(null,num1+" es mas grande que "+num2,"Comparación",JOptionPane.PLAIN_MESSAGE);
		if(num1==num2)
			JOptionPane.showMessageDialog(null,"Estos números son iguales","Comparación",JOptionPane.PLAIN_MESSAGE);	
	}
}