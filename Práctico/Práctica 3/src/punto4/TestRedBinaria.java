package punto4;

import ejercicio1.ArbolBinario;

public class TestRedBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario<Integer> raiz = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> HI1 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> HD1 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> HI2 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> HI3 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> HD2 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> HD3 = new ArbolBinario<Integer>(7);

		raiz.agregarHijoIzquierdo(HI1);
		raiz.agregarHijoDerecho(HD1);
		HI1.agregarHijoIzquierdo(HI2);
		HI1.agregarHijoDerecho(HI3);
		HD1.agregarHijoIzquierdo(HD2);
		HD1.agregarHijoDerecho(HD3);
		
		
		/* 						1
		 * 				2				3	
		 * 			4		5		6		7	
		 * 
		 * Mayor retardo: 11 segs
		 */

		RedBinariaLlena test = new RedBinariaLlena(raiz);

		System.out.println(test.retardoReenvio() + " segundos");
	}

}
