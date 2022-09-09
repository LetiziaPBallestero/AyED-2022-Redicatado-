package ejercicio_1_5;
import java.util.Scanner;

import tp02.ejercicio1.*;

/* 
 * Escriba un método recursivo que imprima los elementos de una lista en sentido inverso.
La lista la recibe por parámetro.
 */

public class recursivo {
	
	public static void imprimirInvertido (ListaDeEnterosEnlazada lista) {
		if (!lista.fin()) {
			int nodo = lista.proximo();
			imprimirInvertido(lista);
			System.out.println(nodo);
		}
	}

	public static void main(String[] args) {
	
		
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();

		lista.agregarFinal(1);
		lista.agregarFinal(2);
		lista.agregarFinal(3);
		lista.agregarFinal(4);
		lista.agregarFinal(5);

		lista.comenzar();
		imprimirInvertido(lista);

	}

}
