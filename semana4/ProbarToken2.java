import java.util.StringTokenizer;

class ProbarToken2 {
	
	public static void main(String [] arguments){
		
		StringTokenizer st1, st2;
		
		String cita = "DSGR@9 32/ 25@2/17";
		
		st1 = new StringTokenizer(cita);
		System.out.println ("Token1 : "+st1.nextToken());
		System.out.println ("Token2 : "+st1.nextToken());
		System.out.println ("Token3 : "+st1.nextToken());
		
		st2 = new StringTokenizer(cita, "@");
		System.out.println ("\nToken1 : "+st2.nextToken());
		System.out.println ("Token2 : "+st2.nextToken());
		System.out.println ("Token3 : "+st2.nextToken());
	}
}