import java.util.StringTokenizer;

class ProbarToken {
	public static void main (String[] args) {
		
		StringTokenizer st1, st2;
		String cita1 = "TEXTO 6 -3/4" ;
		st1 = new StringTokenizer(cita1);
		
		System.out.println ("Token1 : "+st1.nextToken());
		System.out.println ("Token2 : "+st1.nextToken());
		System.out.println ("Token3 : "+st1.nextToken());
		
		String cita2 = "DSGR$9 32/ 25$2/17";
		st2 = new StringTokenizer(cita2,"$");
		
		System.out.println ("Token1 : "+st2.nextToken());
		System.out.println ("Token2 : "+st2.nextToken());
		System.out.println ("Token3 : "+st2.nextToken());
	
	}
}