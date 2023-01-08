package Ejercicios;

public class Ejerciciorep18 {

	public static void main(String[] args) throws InterruptedException// throws InterruptedException 
	{
	
		// 18. Programa que muestra un reloj durante 24 horas en formato 00:00:00 a 23:59:59
		do {
			for (int horas=0;horas<24; horas++ ) {
				for (int min=0;min<60; min++) {
					for (int seg=0; seg<60;seg++) {
						System.out.printf("%02d : %02d : %02d", horas, min,seg);
						Thread.sleep(100);
						System.out.print("\b\b\b\b\b\b\b\b\b");
					
					}
				}
			}
		}while(true);


	}

}
