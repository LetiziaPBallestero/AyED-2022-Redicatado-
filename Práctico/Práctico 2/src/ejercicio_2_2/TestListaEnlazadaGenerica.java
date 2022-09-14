package ejercicio_2_2;
import tp02.ejercicio2.ListaEnlazadaGenerica;

public class TestListaEnlazadaGenerica {
	public static void main(String[] args) {
		/*
		 * Escriba una clase llamada TestListaEnlazadaGenerica que cree 4 objetos de
		 * tipo Estudiante (implementado en el TP01B) y los agregue a un objeto de tipo
		 * ListaEnlazadaGenerica usando los diferentes m�todos de la lista y luego,
		 * imprima los elementos de dicha lista usando el m�todo tusDatos().
		 * 
		 */
		ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<>();

		Estudiante Leti = new Estudiante();
		Estudiante Fausto = new Estudiante();
		Estudiante Margo = new Estudiante();
		Estudiante Lisa = new Estudiante();

		Fausto.setApellido("Ballestero");
		Fausto.setNombre("Fausto");
		Fausto.setComision("1A");
		Fausto.setDireccion("77 bis");
		Fausto.setEmail("Faustino@gmail.com");

		Leti.setApellido("Ballestero");
		Leti.setNombre("Letizia");
		Leti.setComision("1B");
		Leti.setDireccion("77 bis");
		Leti.setEmail("Letizia@gmail.com");

		Margo.setApellido("Smith");
		Margo.setNombre("Margo");
		Margo.setComision("1A");
		Margo.setDireccion("77 bis");
		Margo.setEmail("Margaret@gmail.com");

		Lisa.setApellido("Smith");
		Lisa.setNombre("Lisa");
		Lisa.setComision("1A");
		Lisa.setDireccion("77 bis");
		Lisa.setEmail("Lisa@gmail.com");

		lista.agregarFinal(Lisa);
		lista.agregarFinal(Fausto);
		lista.agregarFinal(Margo);
		lista.agregarFinal(Leti);

		lista.comenzar();
		while (!lista.fin()) {
			System.out.print(lista.proximo().tusDatos());
			System.out.println("");
		}

	}
}
