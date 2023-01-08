package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep03 {

	public static void main(String[] args) {
		// 3. Algoritmo que imprima la tabla de multiplicar correspondiente 
		//introducido por el usuario, usando un esquema do while.
		System.out.println("CÁLCULO TABLA DE MULTIPLICAR");
		int tabla=0;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("¿Qué tabla de multiplicar quieres (1-10)?");
			tabla = teclado.nextInt();
		}while (tabla<1 || tabla>10);
		
		int i = 0;
		do {
			System.out.printf("%d x %d = %d\n",tabla, i, tabla*i );
			i++;
		}while (i<=10);
			
		
	}

}
