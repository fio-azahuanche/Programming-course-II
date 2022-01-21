import javax.swing.JOptionPane;

public class Libro3 {
	private String nombreCurso;//nombreCurso es una variable de instancia o atributos
	
	//Metodo
	public void establecerCurso(String nombre){
		nombreCurso = nombre;
	}
	
	//Metodo
	public String obtenerCurso(){
		return nombreCurso;
	}
	
	//Metodo
	public void mostrarM(){
		//JOptionPane.showMessageDialog(null,"Bienvenido al libro para\n"+obtenerCurso());
		System.out.printf("Bienvenido al libro \n%s!\n",obtenerCurso());
	}
}
//variables locales se usan solo en los metodos
