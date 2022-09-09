package ejercicio_5;

/*
 *  Dado un arreglo de valores tipo int se desea calcular el valor máximo, mínimo, y
promedio en un único método.
 */

public class Ejercicio_5 {

	private static int max;
	private static int min;
	private static double promedio;

	public static void main(String[] args) {
		int[] numeros = { 1 , 13 , 14 , 22 , 6 , -1 , 25 , 36 };
		System.out.println(funcionV1(numeros));

		Datos datos = new Datos();
		funcionV2(numeros, datos);
		System.out.println(datos);

		funcionV3(numeros);
	}

	/*
	 * a. Devuelva lo pedido por el mecanismo de retorno de un método en Java
	 * ("return").
	 */

	public static Datos funcionV1(int[] numeros) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double promedio = 0;

		for (int n : numeros) {
			promedio += n;
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}

		return new Datos(max, min, promedio / numeros.length);
	}

	/*
	 * b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no
	 * puede ser de tipo arreglo).
	 */
	public static void funcionV2(int[] numeros, Datos datos) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double promedio = 0;

		for (int n : numeros) {
			promedio += n;
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}

		datos.setMax(max);
		datos.setMin(min);
		datos.setPromedio(promedio / numeros.length);
		System.out.println(datos.toString());
	}

	/*
	 * c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".
	 */
	public static void funcionV3(int[] numeros) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double promedio = 0;

		for (int n : numeros) {
			promedio += n;
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}
		Ejercicio_5.min = min;
		Ejercicio_5.max = max;
		Ejercicio_5.promedio = promedio / numeros.length;
	}
}
