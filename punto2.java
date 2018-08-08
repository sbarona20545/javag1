package guia1;
import java.util.*;

public class punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ejercicio 2 - Modelado de camion empresa de transporte");
		Scanner entrada=new Scanner(System.in);
				
		System.out.println("# Kilos / Viaje");		
		double x = entrada.nextDouble();
		
		System.out.println("# Galones");		
		double g = entrada.nextDouble();

		System.out.println("# Carga / kg");		
		double c = entrada.nextDouble();
		
 		double numeroDeViajes = 0, galonesTotales = 0 ; 		

 		numeroDeViajes = c / x ;

 		galonesTotales = numeroDeViajes * 80 * g ;
 		
		System.out.println( "Numero de viajes = " + numeroDeViajes );		
		System.out.println( "Galones totales  = " + galonesTotales );		
	
	}

}
