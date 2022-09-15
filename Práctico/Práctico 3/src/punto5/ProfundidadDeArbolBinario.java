package punto5;

import ejercicio1.ArbolBinario;
import pilaycola.ColaGenerica;

public class ProfundidadDeArbolBinario {
	/*
	 * Implemente una clase Java llamada ProfundidadDeArbolBinario que tiene como
	 * variable de instancia un �rbol binario de n�meros enteros y un m�todo de
	 * instancia sumaElementosProfundidad(int p):int el cu�l devuelve la suma de
	 * todos los nodos del �rbol que se encuentren a la profundidad pasada como
	 * argumento.
	 */

	private ArbolBinario<Integer> arbol;

	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.arbol = a;
	}

	public int sumaElementosProfundidad(int p) {
		// recorrido por niveles

		int suma = 0, limite = 0;
		boolean llegue = false;

		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ArbolBinario<Integer> arbolAux;
		cola.encolar(this.arbol);
		cola.encolar(null);

		if (arbol.esVacio())
			return -1;

		while (!cola.esVacia() && !llegue) {
			// mientras no tenga la cola vacia y no llegue

			arbolAux = cola.desencolar();
			if (arbolAux != null) {
				if (limite == p) {
					suma += arbolAux.getDato();
					// el resto de los niveles no me interesa
				} else {
					if (arbolAux.tieneHijoIzquierdo())
						cola.encolar(arbolAux.getHijoIzquierdo());
					if (arbolAux.tieneHijoDerecho())
						cola.encolar(arbolAux.getHijoDerecho());
				}
			} else {
				// si es null
				if (!cola.esVacia()) {
					cola.encolar(null);
					limite++;
				} else {
					if (limite < p)
						suma = -1;
				}
			}
			if (limite > p)
				llegue = true;

		}
		return suma;

	}

}
