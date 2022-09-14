package ejercicio2;

public class PilaGenerica<T> {
	ListaEnlazadaGenerica<T> datos;
	public PilaGenerica() {
		// ultimo en llegar, primero en salir
		datos = new ListaEnlazadaGenerica<T>();
		
	}

	public void apilar (T elemento ) {
		datos.agregarFinal(elemento);
	}
	
	public T desapilar() {
		T elemento = datos.elemento(datos.tamanio());
		datos.eliminarEn(datos.tamanio());
		return elemento;
	}
	
	public T tope() {
		return datos.elemento(datos.tamanio());
		
	}
	
	public boolean esVacia() {
		if (datos.esVacia()) 
			return true;
		else 
			return false;
	}
	
	
}
