package parciales;

import recursos.ArbolBinario;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

public class TESTprimeraFechaTema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArbolBinario<Integer> siete = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> cincuentaYseis = new ArbolBinario<Integer>(56);
		ArbolBinario<Integer> veintiYcinco = new ArbolBinario<Integer>(25);

		ArbolBinario<Integer> treintaYocho = new ArbolBinario<Integer>(38);
		ArbolBinario<Integer> treintaYuno = new ArbolBinario<Integer>(31);

		ArbolBinario<Integer> cinco = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> seis = new ArbolBinario<Integer>(6);

		ArbolBinario<Integer> ochentaYsiete = new ArbolBinario<Integer>(87);
		ArbolBinario<Integer> setentaYsiete = new ArbolBinario<Integer>(77);

		ArbolBinario<Integer> noventaYcuatro = new ArbolBinario<Integer>(94);

		ArbolBinario<Integer> dieciseis = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> dos = new ArbolBinario<Integer>(2);

		ArbolBinario<Integer> cuarentaYtres = new ArbolBinario<Integer>(43);
		ArbolBinario<Integer> uno = new ArbolBinario<Integer>(1);

		ArbolBinario<Integer> nueve = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> diez = new ArbolBinario<Integer>(10);

		// rama comppletamente izquierda

		siete.agregarHijoIzquierdo(cincuentaYseis);
		// rama del 38

		cincuentaYseis.agregarHijoIzquierdo(treintaYocho);
		treintaYocho.agregarHijoIzquierdo(ochentaYsiete);
		treintaYocho.agregarHijoDerecho(setentaYsiete);
		setentaYsiete.agregarHijoIzquierdo(dieciseis);
		dieciseis.agregarHijoDerecho(cuarentaYtres);
		cuarentaYtres.agregarHijoIzquierdo(nueve);
		cuarentaYtres.agregarHijoDerecho(diez);

		// rama del 31

		cincuentaYseis.agregarHijoDerecho(treintaYuno);
		treintaYuno.agregarHijoDerecho(noventaYcuatro);
		noventaYcuatro.agregarHijoDerecho(dos);
		dos.agregarHijoIzquierdo(uno);

		// rama completamente derecha

		siete.agregarHijoDerecho(veintiYcinco);
		veintiYcinco.agregarHijoIzquierdo(cinco);
		veintiYcinco.agregarHijoDerecho(seis);

		primeraFechaTema2 test = new primeraFechaTema2();
		ListaGenerica<Integer> lista = test.resolver(siete, 87);

		lista.comenzar();
		System.out.print("Lista: ");
		while (!lista.fin()) {
			System.out.print(lista.proximo() + " ");
		}
	}

}
