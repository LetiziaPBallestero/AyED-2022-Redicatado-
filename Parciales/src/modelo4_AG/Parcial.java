package modelo4_AG;

import recursos.ArbolGeneral;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

/*
 * Devolver el camino a la hoja más alejada, 
 * si hay más de uno devolver el primero
 */
public class Parcial {
	
	public ListaEnlazadaGenerica<Integer> resolver (ArbolGeneral<Integer> ab ) { 
		
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		int contador = 0;
		int max = -1;
		if (!ab.esVacio() && ab != null) { 
			resolver(ab , lista, contador , max ); 
		}
		return lista;
	}
	
	private void resolver (ArbolGeneral<Integer> ab , ListaEnlazadaGenerica<Integer> lista, int k , int max) {
		lista.agregarFinal(ab.getDato());
		k++;
		
		if (ab.esHoja()) {
			if (k > max) { 
				max = k;
				
			}
			
		}
		
		if (ab.tieneHijos()) { 
			ListaGenerica<ArbolGeneral<Integer>> hijos = ab.getHijos();
			while (!hijos.fin()) { 
				ArbolGeneral<Integer> aux = hijos.proximo();
				resolver (aux , lista, k , max);
				lista.eliminar(lista.tamanio());
			}
		}
		
		
	}

}
