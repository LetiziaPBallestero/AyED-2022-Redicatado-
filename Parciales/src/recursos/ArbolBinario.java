package recursos;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;
	private ArbolBinario<T> hijoDerecho;

	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * 
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo != null;
	}

	public boolean tieneHijoDerecho() {
		return this.hijoDerecho != null;
	}

	public int contarHojas() {
		// Devuelve la cantidad de árbol/subárbol hojas del árbol receptor.
		int i = 0;
		int suma = 0;
		if (!this.esVacio()) {
			i++;
			if (this.tieneHijoIzquierdo()) {
				suma += hijoIzquierdo.contarHojas();
			}

			if (this.tieneHijoDerecho()) {
				suma += hijoDerecho.contarHojas();
			}

			i += suma;
		}

		return i;
	}

	public ArbolBinario<T> espejo() {
		// Devuelve el árbol binario espejo del árbol receptor
		// los que son hijos derechos vuelven como hijos izquierdos
		// y asi
		ArbolBinario<T> nuevoArbol = new ArbolBinario<T>();

		if (this.tieneHijoIzquierdo())
			nuevoArbol.agregarHijoDerecho(this.getHijoIzquierdo().espejo());

		if (this.tieneHijoDerecho())
			nuevoArbol.agregarHijoIzquierdo(this.getHijoDerecho().espejo());

		return nuevoArbol;
	}

	public void entreNiveles(int n, int m) {
		/*
		 * Imprime el recorrido por niveles de los elementos del árbol receptor entre
		 * los niveles n y m (ambos inclusive). (0≤n<m≤altura del árbol)
		 * ASUMO QUE NO ME VAN A MANDAR UN ARBOL VACIO NI VALORES RANCIOS
		 * preguntar
		 */
		int nivel = 0;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		ArbolBinario<T> arbolAux;
		cola.encolar(this); // encolo el arbol 
		cola.encolar(null); // encolo la primer marca de nivel 
		
		while ((!cola.esVacia()) && (nivel <= m)) {
			// mientras tenga elementos para procesar 
			// y no llegue al nivel que me piden ... 
			arbolAux = cola.desencolar(); // armo un arbol con lo que desencolo
			if (arbolAux != null) { // si no desencolo un null NO cambie de nivel
				if (nivel >= n )
					System.out.print (arbolAux.getDato() + " - ");
				if (arbolAux.tieneHijoIzquierdo())
					cola.encolar(arbolAux.getHijoIzquierdo());
				if (arbolAux.tieneHijoDerecho())
					cola.encolar(arbolAux.getHijoDerecho());
			} else if (!cola.esVacia()) { 
				//si lo que desencole fue un null pero la cola no quedo vacia 
				cola.encolar(null);
				nivel++;
			}
			
		}
	}

}
