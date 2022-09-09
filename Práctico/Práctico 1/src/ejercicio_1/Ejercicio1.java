package ejercicio_1;
public class Ejercicio1 {

	public static void incisoA (int a , int b) {
		for (int i = a ; i <= b ; i++) {
			System.out.print(i + " - ");
		}
	}
	
	public static void incisoB (int a , int b) {
		while (a<=b) {
			System.out.print(a + " - ");
			a++;
		}
	}
	
	public static void incisoC (int a , int b) {
		System.out.print( a + " - ");
		if (a < b) {
			incisoC(a+1,b);
		}
	}
	
	public static void main(String[] args) {
		int a = 2; 
		int b = 13;
		
		incisoA(a,b);
		System.out.println("");
		incisoB(a,b);
		System.out.println("");
		incisoC(a,b);

	}

}
