import javax.swing.JOptionPane;
public class Rectangulo{
	private double  ancho;
	private double  largo;
	
	public Rectangulo(){
		this.ancho=1;
		this.largo=2;
	}
	
	public Rectangulo(double ancho, double largo){
		this.ancho=ancho;
		this.largo=largo;
	}
	
	public void establecerAncho (double a){
		this.ancho=a;
	}
	public void establecerLargo (double l){
		this.largo=l;
	}
	public double getAncho (){
		return this.ancho;
	}
	public double getLargo (){
		return this.largo;
	}
	
	public void mostrarM()
	{
		JOptionPane.showMessageDialog("El largo es:"+getAncho()+"\nEl ancho es:"+getLargo());
	}
}