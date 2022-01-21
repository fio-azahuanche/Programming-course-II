//Utilizacion del javax.swing.JoptionPane
import javax.swing.JOptionPane;

public class CodigosJava {
	public static void main (String args [])
	{
		String numero1,numero2,numero3;
		numero1 = JOptionPane.showInputDialog("Escriba el primer numero");
		numero2 = JOptionPane.showInputDialog("Escriba el segundo numero");
		numero3 = JOptionPane.showInputDialog("Escriba el tercerr numero");
		//Pedimos la temperatura en Farenheit
		
		double n1,n2,n3,suma,producto,division;
		
		//Conversion de variables de tipo String a numeros
		
		n1 = Integer.parseInt(numero1);
		n2 = Integer.parseInt(numero2);
		n3 = Integer.parseInt(numero3);
		
		//Operacion suma, producto y division
		
		suma = n1 + n2 + n3;
		producto =n1*n2*n3;
		division=n1/n2;
		
		JOptionPane.showMessageDialog(null,"La suma es "+suma,"SUMA",JOptionPane.PLAIN_MESSAGE);
		//Impresion de la suma
		JOptionPane.showMessageDialog(null,"El producto es "+producto,"PRODUCTO",JOptionPane.PLAIN_MESSAGE);
		//Impresion del producto
		JOptionPane.showMessageDialog(null,"La suma es "+suma+"\nEl producto es "+producto,"SUMA Y PRODUCTO",JOptionPane.PLAIN_MESSAGE);
		//Impresion de la suma y del producto
		JOptionPane.showMessageDialog(null,"La divison de "+n1+" entre "+n2+" es "+division,"DIVISION",JOptionPane.PLAIN_MESSAGE);
		//Impresion de la division
	
		
		//System.exit(0);
	}//Fin de main
}//Fin de class