import javax.swing.JOptionPane;

public class Edad {
	public static void mostrarEdad(String e){
	
		int edad;
		//Pasa de cadena a numero
		edad=Integer.parseInt(e);
		
		JOptionPane.showMessageDialog(null,"La edad ingresada es: "+edad,"EDAD",JOptionPane.PLAIN_MESSAGE);
		
	}
	
}
