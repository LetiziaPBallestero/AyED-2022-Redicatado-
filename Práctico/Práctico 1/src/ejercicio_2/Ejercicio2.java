package ejercicio_2;

import java.util.Arrays;
import java.util.Scanner;

/* Escriba un método de clase que dado un número n devuelva un nuevo arreglo de
tamaño n con los n primeros múltiplos enteros de n mayores o iguales que 1.
Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {nk/k : 1..k}
Agregue al programa la posibilidad de probar con distintos valores de n
ingresándolos por teclado, mediante el uso de System.in. La clase Scanner permite
leer de forma sencilla valores de entrada.  */ 
public class Ejercicio2 {
	
	 public static void main(String[] args) {
	        Scanner S = new Scanner(System.in);
	        System.out.print("Cantidad de numeros a leer: ");
	        int n = S.nextInt();
	        System.out.println("");

	            System.out.println("Multiplos de "+ n);
	            System.out.println( Arrays.toString(multiplosN(n)));

	        S.close();
	    }
	 
	 public static int[] multiplosN(int n) {
		 int [] multiplos = new int [n]; // arreglo de tam n
		 for (int i = 1 ; i <= n ; i++) {
			/* tiene que ponerse i=1 e i<=n ya que si se pone 0, se va a poner 
			 el primer elemento en -1 y va a salir error
			 y es i-1 para la pos anterior y n*i para generar el multiplo
			 */
			 
			 multiplos[i-1] = n * i ; 
         }
         return multiplos;
	 }
}
