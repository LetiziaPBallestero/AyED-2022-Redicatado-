package modelo8;

import recursos.ArbolGeneral;
import recursos.ListaEnlazadaGenerica;
import recursos.ListaGenerica;

public class Test {
	public static void main(String[] args) {
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer> (1);
		
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer> (3);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer> (2);
		ArbolGeneral<Integer> j = new ArbolGeneral<Integer> (5);
		
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer> (7);
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer> (9);
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer> (6);
		
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer> (10);
		
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer> (6);
		ArbolGeneral<Integer> i = new ArbolGeneral<Integer> (10);
		
		g.agregarHijo(e);
		g.agregarHijo(f);
		g.agregarHijo(j);
		
		e.agregarHijo(a);
		e.agregarHijo(b);
		e.agregarHijo(c);
		
		f.agregarHijo(d);
		
		j.agregarHijo(h);
		j.agregarHijo(i);
		
		Parcial test = new Parcial ();
		
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		lista = test.resolver(g);
		
		System.out.print ("Lista: "); 
		lista.comenzar();
		while (!lista.fin())
			System.out.print(lista.proximo() + " ");
	
	}
}
