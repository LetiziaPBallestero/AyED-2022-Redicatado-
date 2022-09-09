package ejercicio_1_2;

import java.util.Scanner;

import tp02.ejercicio1.ListaDeEnterosConArreglos;

/* 
 * Escriba una clase llamada TestListaDeEnterosConArreglos que reciba en su método
main una secuencia de números, los agregue a un objeto de tipo
ListaDeEnterosConArreglos y luego imprima los elementos de dicha lista.
 */
public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {

		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();

		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de numeros: ");
		int cantidad = sc.nextInt();

		System.out.println("");
		int i = 0;
		while (i < cantidad) {
			System.out.print("Numero para la lista: ");
			lista.agregarFinal(sc.nextInt());
			i++;
		}

		System.out.println("");

		lista.comenzar();
		while (!lista.fin()) {
			System.out.print(lista.proximo() + " - " );
		}

	}

}
