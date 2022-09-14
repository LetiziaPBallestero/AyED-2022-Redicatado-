package ejercicio_1_6;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class Ejercicio1_6 {
	/*
	 * se aplica la siguiente función de forma recursiva a partir de un número n
	 * positivo se obtiene un sucesión que termina en 1:
	 */

	private ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();

	/*
	 * A. Escriba un programa recursivo que, a partir de un número n, devuelva una
	 * lista con cada miembro de la sucesión.
	 */

	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		lista.agregarFinal(n);
		if (n != 1) {// la sucesion termina en 1
			if (n % 2 == 0)  // si n es par
				n = n / 2;
			 else 
				n = 3 * n + 1;
			
			calcularSucesion(n);
		}
		return lista;

	}

	/*
	 * B. ) Escriba un método main que pruebe el método implementado en a) y recorra
	 * la lista resultado e imprima cada uno de los elementos.
	 * 
	 */

	public static void main(String[] args) {
		int n = 6;
		Ejercicio1_6 sucesion = new Ejercicio1_6();
		ListaDeEnterosEnlazada listaMain = sucesion.calcularSucesion(n);
		listaMain.comenzar();
		while (!listaMain.fin()) {
			System.out.print(listaMain.proximo() + " - ");

		}
	}

}
