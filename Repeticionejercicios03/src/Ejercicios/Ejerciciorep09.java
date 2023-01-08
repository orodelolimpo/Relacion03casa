package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep09 {

	public static void main(String[] args) {
		// 9. Algoritmo que pida 10 números por teclado, después de pedirlos deberá indicar 
		//cuantos eran positivos,cuantos eran negativos y cuantos eran cero.
		System.out.println("PROGRAMA POSITIVOS, NEGATIVOS Y CERO");
		Scanner teclado = new Scanner(System.in);
		int positivos =0, negativos = 0, ceros =0;
		int num;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Introduce el numero %d\n", i);
			num = teclado.nextInt();
			
			if (num == 0 ) {
				ceros++;
 			} else if (num<0 ) {
 				negativos++;
 			} else {
 				positivos++;
 			}
		}
		
		System.out.printf("Hay %d ceros, %d números positivos y %d "
				+ "números negativos", ceros, positivos, negativos);
		
		

	}

}
