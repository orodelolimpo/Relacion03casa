package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep13 {

	public static void main(String[] args) {
		//13. Algoritmo que pida el alto y el ancho de un rectángulo (número entero)
		//e imprima un rectángulo de asteriscos. Por ejemplo, si introducen 7 de ancho 
		// y cuatro de alto el resultado será:
		//*******
		//*******
		//*******
		System.out.println("PROGRAMA RECTÁNGULO CON *");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el ancho:");
		int ancho = teclado.nextInt();
		System.out.println("Introduce el alto:");
		int alto = teclado.nextInt();
		
		for (int i=0; i<alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			}
				System.out.println("");
		}
		

	}

}
