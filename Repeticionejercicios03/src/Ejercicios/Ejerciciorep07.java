package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep07 {

	public static void main(String[] args) {
		//7. Algoritmo que cuente cuántos múltiplos de 7
		//hay entre dos enteros dados por el usuario.

		System.out.println("PROGRAMA MÚLTIPLE DE 7\n");
		Scanner teclado = new Scanner(System.in);
		long num1,num2;
		System.out.println("Introduzca un número entero");
		num1=teclado.nextLong();
		System.out.println("Introduzca otro número entero");
		num2=teclado.nextLong();
		
		long mayor,menor;
		menor= num1;
		mayor=num2;
		
		if (num1>num2) {
			menor=num2;
			mayor=num1;
		}
		
		long contador=0;
		
		while (menor<=mayor) {
			
			if (menor % 7 == 0) {
				contador++;
			}
			menor++;
			
		}
		System.out.printf("Hay %d múltiplos de 7", contador);
	}

}
