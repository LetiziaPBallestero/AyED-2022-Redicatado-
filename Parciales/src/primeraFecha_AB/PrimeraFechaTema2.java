package primeraFecha_AB;

import recursos.ArbolBinario;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

public class PrimeraFechaTema2 {
	public ListaGenerica<Integer> resolver(ArbolBinario<Integer> ab, int max) {
		
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();		
		boolean seguir = true; 
		
		if ((!ab.esVacio()) && (ab != null)) {
			resolver(ab, max, lista , seguir);
			return lista;
		}
		return lista;
	}

	private boolean resolver(ArbolBinario<Integer> a, int max, ListaEnlazadaGenerica<Integer> lista , boolean seguir) {
		if (seguir)
			lista.agregarFinal(a.getDato());

		if (a.esHoja()) {
			if (a.getDato() >= max) {
				lista.eliminarEn(lista.tamanio());
			} else {
				seguir = false;
			}
		}
		
		if (seguir)
			if (a.tieneHijoIzquierdo()) {
				seguir = resolver(a.getHijoIzquierdo(), max, lista , seguir );
		}

		if (seguir)
			if (a.tieneHijoDerecho()) {
				seguir = resolver(a.getHijoDerecho(), max, lista , seguir );
		}
		
		return seguir;
	}
}
