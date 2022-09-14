package acumuladoresPackage;

public class Main {

	public static void main(String[] args) {
		
		//ejer 1
		int [] lista = {11,20,33,33};
		System.out.println(Acumuladores.mayor10(lista));
		//ejer 2 
		int [] elems = {1,2};
		int [] arr = {3,2,1};
		System.out.println(Acumuladores.perteneceTodos(elems, arr));
		//ejer 3
		int [][] mat = {{5,6,-6},{7,4,-2},{8,5,-3}};
		System.out.println(Acumuladores.tieneNegativos(mat));
		//ejer4
//		int [] acendente = {1,2,3,4,5,6,7};
//		System.out.println(Acumuladores.esAcendente(acendente));
		int [][] diversidad = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(Acumuladores.mayorDiversidad(diversidad));
	}

}
