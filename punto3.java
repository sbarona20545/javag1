package guia1;
import java.util.*;

public class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ejercicio 3 - Ejercicio Volumen del tronco del cono");
		Scanner entrada=new Scanner(System.in);
				
		System.out.println("Radio Mayor");		
		double radioMayor = entrada.nextDouble();
		
		System.out.println("Radio Menor");		
		double radioMenor = entrada.nextDouble();
		
		System.out.println("Altura");		
		double altura = entrada.nextDouble();
	
		double pi = 3.1416 ;
		double v = (altura * pi) / 3 ;
		v = v * (radioMayor*radioMayor)+(radioMenor*radioMenor)+(radioMayor*radioMenor) ;
		
		System.out.println("Ejercicio 3 - Ejercicio Volumen del tronco del cono= "+ v );				
		
	}

}
