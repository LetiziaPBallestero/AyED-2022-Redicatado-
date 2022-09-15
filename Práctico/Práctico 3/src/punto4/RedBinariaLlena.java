package punto4;

import ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	/*
	 * Su tarea es calcular el mayor retardo posible, en el camino que realiza un
	 * mensaje desde la raíz hasta llegar a las hojas en una red binaria llena.
	 * 
	 */
	/* 
	 * La mejor solución es hacer un recorrido en pre-orden y quedarse con el mayor camino 
	 */
	private ArbolBinario<Integer> arbol;
	
	public RedBinariaLlena (ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	 public int retardoReenvio() {
		 return retardoReenvio(arbol);
	 }
	 
	 public int retardoReenvio(ArbolBinario <Integer> arbol) {
		 // Si el árbol está vacío, devolverá -1
		 // Sino va a ir metiéndose hasta llegar a la hoja, una vez llega a la hoja vuelve trayéndose el valor
		 // del dato y comparándolo con el retardo, si es máximo se lo guarda y después lo suma 
		 int retardo = 0;
		 
		 if (arbol.esVacio()) 
			 return -1;
		 
		 if (arbol.esHoja())
			 return arbol.getDato();
		 else {
			 if (arbol.tieneHijoIzquierdo())
				 retardo = Math.max(retardo, retardoReenvio(arbol.getHijoIzquierdo())); 
			 	// comparo el retardo sumado con lo que viene llegando y me quedo con el max
			 if (arbol.tieneHijoDerecho())
				 retardo = Math.max(retardo, retardoReenvio(arbol.getHijoDerecho()));
			 
		 }
		 return retardo + arbol.getDato();
		 //aca lo sumo
		 
	 }

}
