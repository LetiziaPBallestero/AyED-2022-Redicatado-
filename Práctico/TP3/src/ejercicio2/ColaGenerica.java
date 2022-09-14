package ejercicio2;

public class ColaGenerica<T> {
	// primero en llgar, primer en salir
	ListaEnlazadaGenerica<T> datos;

	public ColaGenerica() {
		datos = new ListaEnlazadaGenerica<T>();
	}

	public void encolar(T elemento) {
		datos.agregarFinal(elemento);

	}

	public T desencolar() {
		T elemento = datos.elemento(1);
		datos.eliminarEn(1);
		return elemento;

	}

	public T tope() {
		return datos.elemento(1);

	}

	public boolean esVacia() {
		if (datos.esVacia())
			return true;
		else
			return false;
	}

}
