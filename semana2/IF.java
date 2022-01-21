//Utilizacion del javax.swing.JoptionPane
import javax.swing.JOptionPane;

//USO DEL CONDICIONAL IF
public class IF {
	public static void main (String args [])
	{
		String num1,num2;
		
		num1 = JOptionPane.showInputDialog("Ingrese el entero num1=");
		num2 = JOptionPane.showInputDialog("Ingrese el entero num2=");
		
		int n1,n2;
		n1=Integer.parseInt(num1);
		n2=Integer.parseInt(num2);
		
		String todo=" ";
		
		if (n1==n2)
		//JOptionPane.showMessageDialog(null,n1+" es igual a "+n2,"NUMEROS IGUALES",JOptionPane.PLAIN_MESSAGE);
		todo= n1+" ES IGUAL "+n2;
		
		if (n1!=n2)
		//JOptionPane.showMessageDialog(null,n1+" es igual a "+n2,"NUMEROS IGUALES",JOptionPane.PLAIN_MESSAGE);
		todo= n1+" NO ES IGUAL "+n2;
		
		if (n1<=n2)
		//JOptionPane.showMessageDialog(null,n1+" es igual a "+n2,"NUMEROS IGUALES",JOptionPane.PLAIN_MESSAGE);
		todo= todo+" ES MENOR IGUAL QUE "+n2;
		
		if (n1>=n2)
		//JOptionPane.showMessageDialog(null,n1+" es igual a "+n2,"NUMEROS IGUALES",JOptionPane.PLAIN_MESSAGE);
		todo= todo+"\n"+n1+" ES MAYOR IGUAL QUE "+n2;
		
		JOptionPane.showMessageDialog(null,todo,"NUMEROS",JOptionPane.PLAIN_MESSAGE);
	
		System.exit(0);
	}//Fin de main
}//Fin de class