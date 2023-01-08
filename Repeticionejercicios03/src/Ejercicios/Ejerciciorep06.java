package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep06 {

	public static void main(String[] args) {
		// 6. Algoritmo que calcule el factorial de un número 
		//entero introducido por el usuario.
		
		System.out.println("PROGRAMA FACTORIAL\n");
		Scanner teclado = new Scanner(System.in);
		//si quisiera controlar que fuera entero, aquí do/while o while. 
		System.out.println("Introduzca un número entero");
		int num= teclado.nextInt();
		long factorial=1;
		if (num<0) {
			System.err.println("No se puede calcular");
			System.exit(0);
		}
		for (int i=num; i>1;i--) {
			factorial=factorial*i;
			
			}
		
		System.out.println("El factorial es:" +factorial);
		

		
	}

}
