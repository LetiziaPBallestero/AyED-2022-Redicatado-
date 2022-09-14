package ejercicio4;

// CONSULTAR PORQUE DAN AMBOS FALSE 

import pilaycola.PilaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;

//usaría una pila, porque puedo ir sacando desde arriba y buscando en los que sigue 
public class TestBalanceo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestBalanceo  balanceado = new TestBalanceo ();

		System.out.println(balanceado.estaBalanceado("{()[()]}")); // true 
		System.out.println(balanceado.estaBalanceado("( [ ) ]")); // false 
	}
// ------------------------------------------------------------------------------------------// 
	public boolean esApertura(char caracter) {
		return (caracter == '(') || (caracter == '{') || (caracter == '[');
	}

	public boolean sonIguales(char apertura, char cierre) {
		return (apertura == '(' && cierre == ')')
				|| (apertura == '{' && cierre == '}') 
				|| (apertura == '[' && cierre == ']');
	}

	public boolean estaBalanceado(String string) {
		PilaGenerica<Character> pila = new PilaGenerica<>();
	        	
		for (int i=0 ; i < string.length(); i++) {
				char caracter;
				caracter = string.charAt(i);
				if (esApertura(caracter)) {
					pila.apilar(caracter);
	        	} else {
	        		char ultimo;
	        		ultimo = pila.desapilar();
	        		if (!sonIguales(ultimo , caracter)) {
	        			return false;
	        		}
	        	}
	        }
		return pila.esVacia();
	}

}
