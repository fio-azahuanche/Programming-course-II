//Utilizacion del javax.swing.JoptionPane
import javax.swing.JOptionPane;

public class TEMPERATURA {
	public static void main (String args [])
	{
		String farenheit;
		farenheit = JOptionPane.showInputDialog("Ingrese la temperatura en Farenheit");
		//Pedimos la temperatura en Farenheit
		
		double f,c;
		f = Double.parseDouble(farenheit);
		//Convertimos String a double
		
		c=5*(f-32)/9;
		//Convertimos de Farenheit a Celsius
		
		JOptionPane.showMessageDialog(null,"En grados Celsius es "+c,"LA TEMPERATURA",JOptionPane.PLAIN_MESSAGE);
		//Impresion en grados Celsius
		
		System.exit(0);
	}//Fin de main
}//Fin de class