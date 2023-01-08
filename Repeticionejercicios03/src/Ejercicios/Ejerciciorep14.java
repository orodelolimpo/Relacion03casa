package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep14 {

	public static void main(String[] args) {
		// 14. Hazlo igual que el anterior, pero en este caso debe mostrar el rectángulo de la siguiente manera:
		//*******
		//*     *
		//*     *
		//*******
		System.out.println("PROGRAMA RECTÁNGULO CON *");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el ancho:");
		int ancho = teclado.nextInt();
		System.out.println("Introduce el alto:");
		int alto = teclado.nextInt();
		
			
		for (int i=1; i<=alto; i++) {
			for (int j = 1; j <= ancho; j++) {
					
				if (i==1 || i==alto || j==1 || j== ancho) {
					System.out.print("*");
				} else {
					System.out.print(" ");
						}
					}
					System.out.println();
		}

		
	}

}
