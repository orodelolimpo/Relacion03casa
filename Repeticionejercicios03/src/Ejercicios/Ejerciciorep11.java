package Ejercicios;

public class Ejerciciorep11 {

	public static void main(String[] args) {
		// 11. Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas 
		//do while.

		System.out.println("Tablas de multiplicar");
		int tabla= 1;
		do {
			System.out.printf("Tabla del %d\n",tabla);
			int i=0;
			do {
				System.out.printf("%d x %d = %d\n", tabla,i,tabla*i);
				i++;
			} while ( i <= 10);
			tabla++;
		}while (tabla <= 10 );

	}

}
