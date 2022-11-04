package modelo4_AG;

import recursos.ArbolGeneral;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

/*
 * Devolver el camino a la hoja más alejada, 
 * si hay más de uno devolver el primero
 */
public class Parcial {

	public ListaEnlazadaGenerica<Integer> resolver(ArbolGeneral<Integer> ab) {

		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		ListaEnlazadaGenerica<Integer> definitiva = new ListaEnlazadaGenerica<Integer>();
		
		if (!ab.esVacio() && ab != null) {
			resolver(ab, lista, definitiva);
		}
		return definitiva;
	}

	private void resolver(ArbolGeneral<Integer> ab, ListaEnlazadaGenerica<Integer> lista,
			ListaEnlazadaGenerica<Integer> definitiva) {
		
		lista.agregarFinal(ab.getDato());
		

		if (ab.esHoja()) {

			if (lista.tamanio() > definitiva.tamanio()) {
				System.out.println("Vamos a clonar la lista turururu");

				definitiva.comenzar();
				while (!definitiva.fin())
					definitiva.eliminar(definitiva.proximo());

				lista.comenzar();
				while (!lista.fin()) {
					definitiva.agregarFinal(lista.proximo());
				}

			}
		} else {
			// no hace falta preguntar si tiene hijos porque es un else
				ListaGenerica<ArbolGeneral<Integer>> hijos = ab.getHijos();
				hijos.comenzar();
				while (!hijos.fin()) {
					ArbolGeneral<Integer> aux = hijos.proximo();
					resolver(aux, lista, definitiva);
					lista.eliminarEn(lista.tamanio());

				}
			

		}

	}
}
