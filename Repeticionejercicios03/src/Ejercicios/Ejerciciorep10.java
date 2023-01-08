package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep10 {

	public static void main(String[] args) {
		// 10. Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas for.

		//System.out.println("Tablas de multiplicar");
		//int tabla=0;
		//int num=1;
		//for (int i = 0; i < 100; i++) {
			//if ( i%10==0) {
				//tabla++;
				//System.out.println("TAbla del "+tabla);
				//num=1;
			//}
			//System.out.printf("%d x %d = %d\n", tabla,num, tabla*num);
			//num++;
		//}
		
		
		System.out.println("Tablas de multiplicar");
		
		for (int tabla = 1; tabla <= 10; tabla++) {
			System.out.printf("Tabla del %d\n",tabla);
			for (int i= 0; i <= 10; i++) {
				System.out.printf("%d x %d = %d\n", tabla,i,tabla*i);
			}
		}
	}

}
