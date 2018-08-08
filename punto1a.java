package guia1;
import java.util.*;

public class punto1a {

	public static void main(String[] args) {
		
		// Area = areaBase + areaTapa + 4x(Cara lateral del tronco)
		
		System.out.println("Ejercicio 1a - Area de un Tronco de piramide");
		Scanner entrada=new Scanner(System.in);
		
		

		System.out.println("Lado cuadrado Base");		
		double ladoBase = entrada.nextDouble();
 		double areaBase = ladoBase * ladoBase ;				
		
		System.out.println("Lado cuadrado Tapa");		
		double ladoTapa = entrada.nextDouble();		
		double areaTapa = ladoTapa * ladoTapa ;		
		
		System.out.println("Altura de la Piramide");		
		double alturaPiramide = entrada.nextDouble();		
			
		// Area trapecio  ((B+b)/2) * h		
		double caraLateral = 0, area = 0, areaTrapecio = 0, alturaTrapecio = 0 ;
		double trianguloLado1, trianguloLado2,trianguloLado3 ;
		
		trianguloLado1 = alturaPiramide ;
		trianguloLado2 = (ladoBase/2)-(ladoTapa/2) ;
		//  Teorema de pitagoras		
		trianguloLado3 = Math.sqrt((trianguloLado1 * trianguloLado1) + (trianguloLado2*trianguloLado2)) ;
		
		areaTrapecio = 4*((ladoBase + ladoTapa)/ 2 )* trianguloLado3;

		area = areaBase + areaTapa + areaTrapecio ;
	
		System.out.println( "Area del tronco de piramide = " + area );
		
		
	}
		
		
	
	

}
