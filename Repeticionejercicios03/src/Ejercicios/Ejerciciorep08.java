package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejerciciorep08 {

	public static void main(String[] args) {
		// 8. Programa que pide un número del 1 al 10 hasta que el
		//usuario acierte el número definido en el programa
	
		Random generador = new Random();
		int acierto = generador.nextInt(1, 10);
		
		System.out.println("PROGRAMA ACIERTA EL NÚMERO\n");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=teclado.nextInt();
		//final int ACIERTO = 6;
				
			while (num!=acierto) {
				System.err.println("Has fallado, vuelve a intentarlo");
				System.out.println("Introduce tu número (1-10)");
				num = teclado.nextInt();
			}
			System.out.println("Has acertado");
				
	}

}
