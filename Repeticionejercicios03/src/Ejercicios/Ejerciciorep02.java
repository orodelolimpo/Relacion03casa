package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep02 {

	public static void main(String[] args) {
		// 2. Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
		//comprendido entre uno y diez, introducido por el usuario, usando un esquema while.
		
		System.out.println("CÁLCULO TABLA DE MULTIPLICAR");
		int tabla=0;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("¿Qué tabla de multiplicar quieres (1-10)?");
			tabla = teclado.nextInt();
		}while (tabla<1 || tabla>10);
			
		int i = 0;
		while (i<=10) {
			System.out.printf("%d x %d = %d\n",tabla, i, tabla*i );
			i++;
		}
		
	}
}
