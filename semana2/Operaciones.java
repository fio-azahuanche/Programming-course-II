//Pregunta 2.15
import javax.swing.JOptionPane;
public class Operaciones {
	public static void main (String args [])
	{
		String numero1, numero2;
		
		numero1=JOptionPane.showInputDialog("Escriba el primer numero:");
		numero2=JOptionPane.showInputDialog("Escriba el segundo numero:");
		int num1, num2, suma, producto, diferencia;
		double cociente;
		
		num1=Integer.parseInt(numero1);
		num2=Integer.parseInt(numero2);
		
		suma= num1+num2;
		producto=num1*num2;
		diferencia=num1-num2;
		cociente=num1/num2;
		
		JOptionPane.showMessageDialog(null," suma = "+suma,"SUMA",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null," producto = "+producto,"PRODUCTO",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null," diferencia = "+diferencia,"DIFERENCIA",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null," cociente = "+cociente,"COCIENTE",JOptionPane.PLAIN_MESSAGE);
		System.exit(0);	
	}
}