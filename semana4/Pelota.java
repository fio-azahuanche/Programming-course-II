public class Pelota {
	private float radio;
	private float peso;
	
	//constructor
	public Pelota(){
		this.radio=10;
		this.peso=5;
	}
	
	public Pelota(float radio, float peso){
		this.radio=radio;
		this.peso=peso;
	}
	public void establecerRadio(float r){
		this.radio=r;
	}
	public void establecerPeso(float p){
		this.peso=p;
	}
	
	public float obtenerPeso(){
		return this.peso;
	}
	
	public float  obtenerRadio(){
		return this.radio;
	}
	
	public void tirarPelota(){
		System.out.println("Has tirado la pelota");
	}
	
	public void atraparPelota(){
		System.out.println("Has atrapado la pelota");
	}
}