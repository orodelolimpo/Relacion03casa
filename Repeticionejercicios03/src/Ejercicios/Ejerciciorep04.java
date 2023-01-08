package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep04 {

	public static void main(String[] args) {
		// 4. Algoritmo que escriba los números impares comprendidos entre 
		//dos enteros introducidos por el usuario.
		System.out.println("PROGRAMA NÚMEROS IMPARES\n");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int num1 =teclado.nextInt();
		
		System.out.println("Introduzca otro número");
		int num2 =teclado.nextInt();
		
		int menor, mayor;
		menor =num1;
		mayor = num2;
		if (num1 >num2){
		menor=num2;
		mayor=num1;
		}
		//si el númro es par, se suma uno y consigo el impar)
		//control si es par//
		if (menor%2==0) {
			menor++;
		}
		
		for (int i=menor; i<=mayor;i=i+2) {
			System.out.println(i);
			
		}
		

	}

}
