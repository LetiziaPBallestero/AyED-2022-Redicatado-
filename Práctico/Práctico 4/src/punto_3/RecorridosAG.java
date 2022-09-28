package punto_3;

import ejercicio1.ArbolGeneral;
import ejercicio2.ListaGenerica;
import pilaycola.ColaGenerica;
import tp02.ejercicio2.*;

public class RecorridosAG {
	private ArbolGeneral<Integer> arbol;

	/*
	 * Método que retorna una lista con los elementos impares del árbol “a” que sean
	 * mayores al valor “n” pasados como parámetros, recorrido en preorden.
	 */

	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n) {
		this.arbol = a;
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePreOrden(lista, this.arbol, n);
		return lista;
	}

	private void numerosImparesMayoresQuePreOrden(ListaGenerica<Integer> l, ArbolGeneral<Integer> a, Integer n) {
		// preOrden = r - hi - resto
		// primero analizo , lo mando a los hijos
		if ((a.getDato() % 2 != 0) && (a.getDato() > n))
			// si es impar y es mayor n
			l.agregarFinal(a.getDato());
		// lo agrego
		if (a.tieneHijos()) {
			// si tiene hijos
			ListaGenerica<ArbolGeneral<Integer>> lhijos = a.getHijos();
			// agrego a los hijos
			lhijos.comenzar();
			while (!lhijos.fin())
				// mientras no termine la lista de hijos recorro y analizo
				numerosImparesMayoresQuePreOrden(l, lhijos.proximo(), n);
		}
	}

	/*
	 * Método que retorna una lista con los elementos impares del árbol “a” que sean
	 * mayores al valor “n” pasados como parámetros, recorrido en inorden.
	 * 
	 */
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n) {
		this.arbol = a;
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQueInOrden(lista, this.arbol, n);
		return lista;
	}

	private void numerosImparesMayoresQueInOrden(ListaGenerica<Integer> l, ArbolGeneral<Integer> a, Integer n) {
		// inOrden = hi - r - resto

		ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
		lHijos.comenzar();

		if (!lHijos.esVacia())
			numerosImparesMayoresQueInOrden(l, lHijos.proximo(), n);
		// recorro

		if ((a.getDato() % 2 != 0) && (a.getDato() > n))
			l.agregarFinal(a.getDato());

		while (!lHijos.fin() && !lHijos.esVacia())
			numerosImparesMayoresQueInOrden(l, lHijos.proximo(), n);
	}

	/*
	 * Método que retorna una lista con los elementos impares del árbol “a” que sean
	 * mayores al valor “n” pasados como parámetros recorrido en postorden.
	 */
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n) {
		this.arbol = a;
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePostOrden(lista, this.arbol, n);
		return lista;
	}

	public void numerosImparesMayoresQuePostOrden(ListaGenerica<Integer> l, ArbolGeneral<Integer> a, Integer n) {
		// hijos , raiz
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();

			lHijos.comenzar();
			while (!lHijos.fin())
				numerosImparesMayoresQuePostOrden(l, lHijos.proximo(), n);
			// recorro
		}
		if ((a.getDato() % 2 != 0) && (a.getDato() > n))
			l.agregarFinal(a.getDato());
	}

	/*
	 * blablablabla por niveles
	 */
	public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles(ArbolGeneral <Integer> a, Integer n) {
		this.arbol = a; 
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> aux;
		
		cola.encolar(a);
		cola.encolar(null);
		
		while (!cola.esVacia()) {
			aux = cola.desencolar();
			
			if (aux != null) {
				if ((aux.getDato() % 2 != 0) && (aux.getDato() > n))
					lista.agregarFinal(aux.getDato());
				
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<Integer>> lHijos = aux.getHijos();
					lHijos.comenzar();
					while (!lHijos.fin()) {
						cola.encolar(lHijos.proximo());
					}
				}
			}
			else 
				if (!cola.esVacia())
					cola.encolar(null);
		}
		
		return lista;
		
	}


}
