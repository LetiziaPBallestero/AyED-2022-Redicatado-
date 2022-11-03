package modelo1_AG;

import recursos.ArbolGeneral;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

/* 
 * Dado un árbol general, encontrar los caminos desde la raíz a una hoja 
 * tales que la cantidad de nodos en el camino sea un número par. 
 */
public class Parcial {

	public ListaEnlazadaGenerica<ListaEnlazadaGenerica<Character>> caminosPares(ArbolGeneral<Character> arbol) {
		ListaEnlazadaGenerica<ListaEnlazadaGenerica<Character>> listaDeListas = new ListaEnlazadaGenerica<ListaEnlazadaGenerica<Character>>();

		if (!arbol.esVacio() && !arbol.esHoja() && arbol != null) {
			ListaEnlazadaGenerica<Character> listaCaracteres = new ListaEnlazadaGenerica<Character>();
			int contador = 0;
			caminosPares(arbol, listaCaracteres, listaDeListas, contador);
		}
		return listaDeListas;
	}

	private void caminosPares(ArbolGeneral<Character> ab, ListaEnlazadaGenerica<Character> lista,
			ListaEnlazadaGenerica<ListaEnlazadaGenerica<Character>> listaDeListas, int k) {

		lista.agregarFinal(ab.getDato());
		k++;

		if (ab.esHoja()) {
			if (k % 2 == 0) {
				lista.comenzar();
				listaDeListas.agregarFinal((ListaEnlazadaGenerica<Character>) lista.clonar());
			}
		}

		if (ab.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Character>> hijos = ab.getHijos();

			while (!hijos.fin()) {
				ArbolGeneral<Character> arbolAux = hijos.proximo();
				caminosPares(arbolAux, lista, listaDeListas, k);
				lista.eliminarEn(lista.tamanio());
			}
		}

	}
}
