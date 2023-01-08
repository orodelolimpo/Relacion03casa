package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep05 {

	public static void main(String[] args) {
		// 	5. Algoritmo que sume los n primeros números enteros,
		//siendo n un número introducido por el usuario.
		System.out.println("PROGRAMA SUMA DE N NUMEROS\n");
		Scanner teclado = new Scanner(System.in);
		
		int num=0;
		
		do {
			System.out.println("Introduzca un número positivo");
			num=teclado.nextInt();
		}while (num <0);
			
			int suma=0;
			for (int i = 1; i <= num; i++) {
				suma = suma+i;
			}
			System.out.println("La suma es "+suma);
			
			
			
		
	}

}
