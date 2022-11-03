package modelo1_AG;

import recursos.ArbolGeneral;
import recursos.ListaGenerica;
import recursos.ListaEnlazadaGenerica;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArbolGeneral<Character> a = new ArbolGeneral<Character>('a');
		ArbolGeneral<Character> b = new ArbolGeneral<Character>('b');
		ArbolGeneral<Character> c = new ArbolGeneral<Character>('c');
		ArbolGeneral<Character> d = new ArbolGeneral<Character>('d');
		ArbolGeneral<Character> e = new ArbolGeneral<Character>('e');
		ArbolGeneral<Character> f = new ArbolGeneral<Character>('f');
		ArbolGeneral<Character> g = new ArbolGeneral<Character>('g');
		ArbolGeneral<Character> h = new ArbolGeneral<Character>('h');
		ArbolGeneral<Character> i = new ArbolGeneral<Character>('i');
		
		a.agregarHijo(b);
		a.agregarHijo(c);
		a.agregarHijo(d);
		
		b.agregarHijo(e);
		
		c.agregarHijo(f);
		c.agregarHijo(g);
		
		f.agregarHijo(h);
		f.agregarHijo(i);
		
		
		Parcial test = new Parcial();
		ListaGenerica<ListaEnlazadaGenerica<Character>> listaDeListas = new ListaEnlazadaGenerica<ListaEnlazadaGenerica<Character>>(); 
		listaDeListas= test.caminosPares(a);
		
		listaDeListas.comenzar();
		
		while (!listaDeListas.fin()) {
			ListaGenerica<Character> l = listaDeListas.proximo();
				l.comenzar();
				while (!l.fin()) {
					System.out.print(l.proximo() + " ");
				}
				System.out.println(" ");
		}
}

}
