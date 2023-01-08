package Ejercicios;

public class Ejerciciorep12 {

	public static void main(String[] args) {
		// 12. Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas 
		//while.
		
		System.out.println("TABLAS DE MULTIPLICACIÓN\n");
		
		int tabla =1;
		while (tabla <=10) {
			System.out.printf("La tabla del %d\n", tabla);
			//---
			int i=0;
			while (i<=10) {
				System.out.printf(" %d x %d = %d \n", tabla,i,tabla*i);
				i++;
			}
			tabla++;
		}

	}

}
