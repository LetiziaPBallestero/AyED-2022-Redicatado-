package punto_3;

import ejercicio1.ArbolGeneral;
import ejercicio2.ListaGenerica;
import tp02.ejercicio2.*;

public class RecorridosAG_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaGenerica<Integer> lista;

		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(15);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(18);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(21);

		a.agregarHijo(b);
		a.agregarHijo(c);
		
		b.agregarHijo(d);
		b.agregarHijo(e);
		
		c.agregarHijo(f);
		c.agregarHijo(g);
		c.agregarHijo(h);

		RecorridosAG test = new RecorridosAG();

		lista = test.numerosImparesMayoresQuePreOrden(a,3);
		System.out.println("preOrden: " + lista);
		lista = test.numerosImparesMayoresQueInOrden(a,3);
		System.out.println("inOrden: " + lista);
		lista = test.numerosImparesMayoresQuePostOrden(a,3);
		System.out.println("postOrden: " + lista);
		lista = test.numerosImparesMayoresQuePorNiveles(a,3);
		System.out.println("por nivel: " + lista);

	}
}
