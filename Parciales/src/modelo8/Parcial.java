package modelo8;

import recursos.ArbolGeneral;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

/*
 * Sea un �rbol en donde cada nodo tiene un valor num�rico. Usted
 * debe devolver el camino determinado por el valor que posee cada nodo.
 * Es decir: el camino comienza en el nodo ra�z, luego debe seguir x el hijo que 
 * se encuentra en la pos indicada por el  calor en el nodo raiz. Y as� debe seguir hasta llegar a una hoja
 * NOTA: Para funcionar este codigo deberia tener en su nodo 2 datos: una letra y un n�mero
 * 	pero eso implicar�a cambiar toda la estructura del �rbol y estoy a un d�a del recuperatorio 
 * 	y del colapso mental, as� que 
 * 		thank you, next next 
 * 
 */

public class Parcial {

	public ListaGenerica<Integer> resolver(ArbolGeneral<Integer> ab) {
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if (!ab.esVacio() && ab != null) {
			resolver(ab, lista);
		}
		return lista;
	}

	public void resolver(ArbolGeneral<Integer> ab, ListaGenerica<Integer> lista) {
		int hijoNum = 0;
		lista.agregarFinal(ab.getDato());
		
		if (ab.tieneHijos() ) {
			
			ListaGenerica<ArbolGeneral<Integer>> hijos = ab.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				hijoNum++;
				ArbolGeneral<Integer> aux = hijos.proximo();
				if (hijoNum == ab.getDato())
					resolver(aux,lista);
				
			}
			
			
		}
		
	}

}
