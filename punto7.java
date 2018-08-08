package guia1;
import java.util.Scanner;

public class punto7 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 7 - Ejercicio del triangulo");
		Scanner entrada=new Scanner(System.in);			
		
		System.out.println("Ingrese el lado A");		
		double ladoA = entrada.nextDouble();
		
		System.out.println("Ingrese el lado B");		
		double ladoB = entrada.nextDouble();
		
		System.out.println("Ingrese el lado C");		
		double ladoC = entrada.nextDouble();
		
		double semiPerimetro, area, circumRadius   ;
		double pi = 3.1416 ;		
		
		semiPerimetro = (ladoA + ladoB + ladoC) / 2 ;
		
		area = Math.sqrt(
				semiPerimetro*(semiPerimetro-ladoA)*(semiPerimetro-ladoB)*(semiPerimetro-ladoC)
				);
		
		circumRadius = (ladoA*ladoB*ladoC) / ( (4* pi) * area );
		
		System.out.println("Perimetro = " + semiPerimetro );
		System.out.println("Area del Triangulo = " + area );		
		System.out.println("circumRadius del Triangulo = " + circumRadius  );		
		
	}

}
