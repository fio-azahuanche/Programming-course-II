public class PruebaMejorada
{
	public static void main (String args[])
	{
		int[] arreglo = {7,6,4,0,3,7,5,9};
		int total =0;
		//suma el valor de cada elemento al total
		for (int numero:arreglo)
			total = total + numero;
			System.out.printf("Total de elementos del arreglo: %s\n",total);
	}
}