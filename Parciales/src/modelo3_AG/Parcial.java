package modelo3_AG;

import recursos.ArbolGeneral;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

/* 
 * Implementar que se devuelva LA SUMA de los ELEMENTOS del árbol que tengan hijo impar
 * es un dolor de huevos este parcial
 */

public class Parcial {

	public ListaGenerica<Integer> resolver(ArbolGeneral<Integer> ab) {
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if (!ab.esVacio() && ab != null) {
			resolver(ab, lista);
		}
		return lista;
	}

	private void resolver(ArbolGeneral<Integer> ab, ListaGenerica<Integer> lista) {
		int suma = 0;
		boolean ok = false;

		if (ab.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = ab.getHijos();
			while (!hijos.fin()) {
				ArbolGeneral<Integer> aux = hijos.proximo();
				if ((hijos.tamanio() % 2) == 1) {
					ok = true;
					suma += aux.getDato();
				}
				resolver(aux, lista);

			}
		}
		if (!ab.esHoja()) {
			if (ok) {
				lista.agregarFinal(suma);
			}
		}

	}

}
