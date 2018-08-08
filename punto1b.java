package guia1;
import java.util.*;


public class punto1b {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub

				System.out.println("Ejercicio 1b");
				Scanner entrada=new Scanner(System.in);

				System.out.println("Lado cuadrado superior");		
				double cuaSup = entrada.nextDouble();
				
				System.out.println("Lado cuadrado inferior");		
				double cuaInf = entrada.nextDouble();
				
				System.out.println("Altura del Tronco");		
				double altura = entrada.nextDouble();
			
				double areaCuaInfe = 0, areaCuaSupe = 0, volumen = 0 ;
		        areaCuaInfe = cuaInf*cuaInf ;
		        areaCuaSupe = cuaSup*cuaSup  ;		
				

		        volumen = (altura/3)*(areaCuaInfe + areaCuaSupe + (Math.sqrt(areaCuaInfe*areaCuaSupe))) ;
			
				System.out.println("Volumen del tronco = "+ volumen );	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
