package guia1;

import java.util.Scanner;

public class punto6 {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 6 - Ejercicio Un hexágono regular");
		Scanner entrada=new Scanner(System.in);			
		
		System.out.println("Ingrese el lado en Centimetros");		
		double lado = entrada.nextDouble();
		
		double area  ;		

		area = ((6*lado)/2) * ( (3*lado)/(2*(Math.sqrt(3))) ) * (  ((9/(2*(Math.sqrt(3)))))  ) * lado;
		System.out.println("Area del hexágono regular = " + area );	
			   

		
	}
}
