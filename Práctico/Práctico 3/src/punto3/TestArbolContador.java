package punto3;

import ejercicio1.ArbolBinario;
import ejercicio2.ListaGenerica;

public class TestArbolContador {
	public static void main(String[] args) {
		ArbolBinario<Integer> a1 = new ArbolBinario<Integer>(1); 
		ArbolBinario<Integer> a2 = new ArbolBinario<Integer>(2); 
		ArbolBinario<Integer> a3 = new ArbolBinario<Integer>(3); 
		ArbolBinario<Integer> a4 = new ArbolBinario<Integer>(4); 
		ArbolBinario<Integer> a5 = new ArbolBinario<Integer>(5);
		
		a1.setDato(1);
		a1.agregarHijoIzquierdo(a2);
		a1.agregarHijoDerecho(a3);
		a2.agregarHijoIzquierdo(a4);
		a2.agregarHijoDerecho(a5);
		
		ContadorArbol contador = new ContadorArbol(a1);
		
		ListaGenerica<Integer> l = contador.numerosPares();
		
		
		System.out.println(l.toString()); // 2 - 4 
	}

}
