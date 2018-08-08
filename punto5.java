package guia1;
import java.util.*;

public class punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ejercicio 5 - Programa para avion ");
		Scanner entrada=new Scanner(System.in);				

		System.out.println("Numero de pasajeros Clase 1");		
		double n1 = entrada.nextDouble();
				
		System.out.println("Numero de pasajeros Clase 2");		
		double n2 = entrada.nextDouble();

		System.out.println("Numero de pasajeros Clase 3");		
		double n3 = entrada.nextDouble();

		double v1,v2,v3, totalRecaudo ;
		
		v1 = 500 * n1 ;
		v2 = 200 * n2 ;
		v3 = 125 * n3 ;		
		totalRecaudo = (500*n1)+(200*n2)+(125*n3) ;
		
		System.out.println("Ventas clase 1 =" + v1 );				
		System.out.println("Ventas clase 2 =" + v2 );		
		System.out.println("Ventas clase 3 =" + v3 );
		System.out.println("Total Recaudo  =" + totalRecaudo );		
	
		
	}

}
