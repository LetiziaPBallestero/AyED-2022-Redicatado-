package punto3;

import ejercicio1.ArbolBinario;
import ejercicio2.ListaEnlazadaGenerica;
import ejercicio2.ListaGenerica;

public class ContadorArbol {

	private ArbolBinario<Integer> arbol;

	public ContadorArbol(ArbolBinario<Integer> a) {
		this.arbol = a;
	}

	public ListaGenerica<Integer> numerosPares() {
		// devuelve todos los elementos pares
		ListaEnlazadaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();

		//System.out.println("Contar en InOrden: ");
		//contarParesInOrden(l,this.arbol);

		System.out.println("Contar en PreOrden: ");
		contarParesPreOrden(l, this.arbol);

		return l;
	}

	public void contarParesInOrden(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> arbol) {
		if (arbol.tieneHijoIzquierdo())
			contarParesInOrden(l, arbol.getHijoIzquierdo());
		if (arbol.getDato() % 2 == 0)
			l.agregarFinal(arbol.getDato());
		if (arbol.tieneHijoDerecho())
			contarParesInOrden(l, arbol.getHijoDerecho());

	}

	public void contarParesPreOrden(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> arbol) {
		if (arbol.getDato() % 2 == 0)
			l.agregarFinal(arbol.getDato());
		if (arbol.tieneHijoIzquierdo())
			contarParesInOrden(l, arbol.getHijoIzquierdo());
		if (arbol.tieneHijoDerecho())
			contarParesInOrden(l, arbol.getHijoDerecho());

	}
}
