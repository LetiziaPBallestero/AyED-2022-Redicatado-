package test;

import ejercicio1.ArbolBinario;

public class Test {
	ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(); 

	public static void main(String[] args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(); 
		ArbolBinario<Integer> sub1 = new ArbolBinario<Integer>(); 
		ArbolBinario<Integer> sub2 = new ArbolBinario<Integer>(); 
		ArbolBinario<Integer> sub3 = new ArbolBinario<Integer>(); 
		ArbolBinario<Integer> sub4 = new ArbolBinario<Integer>(); 
		ArbolBinario<Integer> sub5 = new ArbolBinario<Integer>(); 
		ArbolBinario<Integer> sub6 = new ArbolBinario<Integer>(); 
		ArbolBinario<Integer> sub7 = new ArbolBinario<Integer>(); 
		
		arbol.setDato(1);
		sub1.setDato(2);
		sub2.setDato(3);
		sub3.setDato(4);
		sub4.setDato(5);
		sub5.setDato(5);
		sub6.setDato(7);
		sub7.setDato(8);
		
		arbol.agregarHijoIzquierdo(sub1);
		arbol.agregarHijoDerecho(sub2);
		sub1.agregarHijoIzquierdo(sub3);
		sub1.agregarHijoDerecho(sub4);
		sub2.agregarHijoIzquierdo(sub5);
		sub2.agregarHijoDerecho(sub6);
		sub3.agregarHijoIzquierdo(sub7);
		
		// tiene que devolver 8 
		System.out.println(arbol.contarHojas());

	}

}
