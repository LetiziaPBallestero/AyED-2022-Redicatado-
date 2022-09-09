package ejercicio_3;
/*Escriba una clase llamada Test con el método main, el cual cree un arreglo
con 2 objetos Estudiante, otro arreglo con 3 objetos Profesor, y luego
recorra ambos arreglos imprimiendo los valores obtenidos mediante el
método tusDatos(). Recuerde asignar los valores de los atributos de los
objetos Estudiante y Profesor invocando los respectivos métodos setters.
*/

public class Test {

	public static void main(String[] args) {

		Estudiante[] estudiantes = new Estudiante[2];
		Profesor[] profesores = new Profesor[3];

		Estudiante Fausto = new Estudiante();
		Fausto.setApellido("Ballestero");
		Fausto.setNombre("Fausto");
		Fausto.setComision("1A");
		Fausto.setDireccion("77 bis");
		Fausto.setEmail("Faustino@gmail.com");

		Estudiante Leti = new Estudiante();
		Leti.setApellido("Ballestero");
		Leti.setNombre("Letizia");
		Leti.setComision("1B");
		Leti.setDireccion("77 bis");
		Leti.setEmail("Letizia@gmail.com");

		Profesor Marcos = new Profesor();
		Marcos.setApellido("Cantero");
		Marcos.setNombre("Marcos");
		Marcos.setCatedra("Biologia");
		Marcos.setComision("1C");
		Marcos.setFacultad("Varela");

		Profesor Luna = new Profesor();
		Luna.setApellido("Calderon");
		Luna.setNombre("Lunita");
		Luna.setCatedra("Ilustracion de la nostalgia");
		Luna.setComision("1D");
		Luna.setFacultad("La Pampa");

		Profesor Milanesa = new Profesor();
		Milanesa.setApellido("Ballestero");
		Milanesa.setNombre("Mila");
		Milanesa.setCatedra("MICHIMICHIMIAU");
		Milanesa.setComision("1E");
		Milanesa.setFacultad("La Plata");

		estudiantes[0] = Leti;
		estudiantes[1] = Fausto;

		profesores[0] = Marcos;
		profesores[1] = Luna;
		profesores[2] = Milanesa;

		for (Estudiante e : estudiantes) {
			System.out.println(e.tusDatos() + " , ");
		}

		for (Profesor p : profesores) {
			System.out.println(p.tusDatos()+ " , ");
		}
	}

}
