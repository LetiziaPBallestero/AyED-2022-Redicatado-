package parciales;

import recursos.ArbolBinario;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

public class primeraFechaTema2 {
	public ListaGenerica<Integer> resolver(ArbolBinario<Integer> ab, int max) {
		
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		ListaEnlazadaGenerica<Integer> aux = new ListaEnlazadaGenerica<Integer>();
		
		boolean seguir = true; 
		
		if ((!ab.esVacio()) && (ab != null)) {
			if (!resolver(ab, max, lista , aux , seguir));
		}
		return lista;
	}

	private boolean resolver(ArbolBinario<Integer> a, int max, ListaEnlazadaGenerica<Integer> lista , ListaEnlazadaGenerica<Integer> aux , boolean seguir) {
		if (seguir)
			System.out.println ("Se va a agregar el dato " + a.getDato());
			aux.agregarFinal(a.getDato());

		if (a.esHoja()) {
			if (a.getDato() >= max) {
				System.out.println ("Se va a eliminar " + a.getDato());
				aux.eliminarEn(lista.tamanio());
			} else {
				System.out.println (a.getDato() + " Es una hoja y es menor, se corta?");
				seguir = false;
				return false;
			}
		}
		
		if (seguir)
			// entra inclusive cuando seguir es false
			System.out.println("Seguir es TRUE");
		if (!seguir)
			System.out.println("Seguir es FALSE");

		if (seguir)
			if (a.tieneHijoIzquierdo()) {
				resolver(a.getHijoIzquierdo(), max, lista , aux , seguir );
		}

		if (seguir)
			if (a.tieneHijoDerecho()) {
				resolver(a.getHijoDerecho(), max, lista , aux , seguir );
		}
		
		return seguir;
	}
}
