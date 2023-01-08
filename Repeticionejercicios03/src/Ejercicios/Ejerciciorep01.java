package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep01 {

	public static void main(String[] args) {
		// 1. Algoritmo que imprima la tabla de multiplicar correspondiente a un número comprendido 
		//entre uno y diez, introducido por el usuario, usando un esquema for.
		
		System.out.println("CÁLCULO TABLA DE MULTIPLICAR");
		int tabla=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("¿Qué tabla de multiplicar quieres (1-10)?");
			tabla = teclado.nextInt();
		}while(tabla<1 || tabla >10);
		
		
		for (int i = 0; i <=10 ; i++) {
			System.out.printf("%d x %d = %d\n",tabla, i, tabla*i );
		}
		
		
	}

}
