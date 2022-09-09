package ejercicio1_3;

import java.util.Scanner;

import tp02.ejercicio1.*;

/*
 * Escriba una clase llamada TestListaDeEnterosEnlazada que reciba en su método
main una secuencia de números, los agregue a un objeto de tipo
ListaDeEnterosEnlazada y luego imprima los elementos de dicha lista.

 */

public class Ejercicio_1_3 {

	public static void main(String[] args) {

			ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();

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


