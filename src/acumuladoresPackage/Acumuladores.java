package acumuladoresPackage;

public class Acumuladores {
	
	/**1
	 * que recibe una arreglo de numero, que sea verdadera si todos los numeros son mayores a 10
	 */
	public static boolean mayor10(int[] lista) {
		boolean esMayor = true;
		for(int i = 0; i < lista.length; i++) {
			esMayor = esMayor && lista[i] > 10;
		}
		return esMayor;
	}
	/**2
	 * arreglo es subconjunto de otro
	 * si elems esta vacio devuelve verdadero
	 * si arreglo esta vacio devuelve falso
	 */
	public static boolean perteneceTodos(int [] elems, int[] arreglo) {
		boolean esSubconjunto = true;
		for(int i = 0; i < elems.length; i++) {
			esSubconjunto = esSubconjunto && elemPertenece(elems[i], arreglo);
		}
		return esSubconjunto;
	}
	private static boolean elemPertenece (int elem, int[] arreglo) {
		boolean algunIgual = false;
		for(int i = 0; i < arreglo.length; i++ ) {
			algunIgual = algunIgual || elem == arreglo[i];
		}
		return algunIgual;
	}
	/**3
	 * implementar una funcion que reciba una matriz de enteros, y devuelva verdadero <=> en cada una
	 * de las filas, existe al menos un nuemro negativo.
	 */
	public static boolean tieneNegativos(int[][] mat) {
		boolean filasconNegativo = true;
		for(int fila = 0; fila < mat.length; fila++) {
			filasconNegativo = filasconNegativo && negativoEnFila(mat[fila]);
		}
		return filasconNegativo;
	}
	private static boolean negativoEnFila(int[] matFila) {
		boolean algunNegativo = false;
		for(int i = 0; i < matFila.length; i++) {
			algunNegativo = algunNegativo || matFila[i] < 0;
		}
		return algunNegativo;	
	}
	/**4
	 * implementar una funcion que, dada una matriz de enteros, verifique que:
	 * a) todas las filas estan en orden estrictamente ascendente
	 * b) todas las columnas tienen al menos un elemento impar, y otro par
	 *///faltan pre condiciones
	public static boolean mayorDiversidad(int[][] mtx) {
		boolean filasAcendentes = true;
		boolean columnasParImpar = true;
		for(int fila = 0 ; fila < mtx.length; fila++) {
			filasAcendentes = filasAcendentes && esAcendente(mtx[fila]);
		}
		for(int col = 0; col < mtx[0].length; col++) {
			columnasParImpar = columnasParImpar && columnaParYImpar(mtx[col]);
		}
		return filasAcendentes && columnasParImpar;
	}
	public static boolean esAcendente(int[] matfila) {
		boolean acendente = true;
		int elemento = matfila[0];
		for(int i = 1; i < matfila.length; i++) {
			acendente = acendente && matfila[i] > elemento;
			elemento = matfila[i];
		}
		return acendente;
	}
	public static boolean columnaParYImpar(int[] matCol) {
		boolean algunPar = false;
		boolean algunImpar = false;
		for(int i = 0; i < matCol.length; i++) {
			algunPar = algunPar || esPar(matCol[i]);
			algunImpar = algunImpar || esImpar(matCol[i]);
		}
		return algunPar && algunImpar;
	}
	private static boolean esPar(int elem) {
		return elem % 2 == 0;
	}
	private static boolean esImpar(int elem) {
		return elem % 2 != 0;
	}
	//5 implementar funciones con potencias de 2 y logaritmos en base 2
	
	/**a
	 * implementar un funcion que dado un vector de enteros devuelva verdadero <=> todos sus elementos son potencia de 2
	 */
	public static boolean todosPotenciaDos (int [] vector) {
		return false;
	}
	public static boolean esPotenciaDos(int n) {
		
	}

}
