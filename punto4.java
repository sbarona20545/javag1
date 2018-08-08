package guia1;
import java.util.*;
public class punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ejercicio 4 - Paseo de estudiantes a Melgar");
		Scanner entrada=new Scanner(System.in);		
		
		System.out.println("Pasajeros gordos");		
		double pasajerosGordos = entrada.nextDouble();
		
		System.out.println("Pasajeros flacos ");		
		double pasajerosFlacos = entrada.nextDouble();
		
		System.out.println("Sillas del Bus");		
		double sillasDelBus = entrada.nextDouble();
		
		System.out.println("Valor comida");		
		double valorComida = entrada.nextDouble();
		
		System.out.println("Personas de habitacion");		
		double personasHabitacion = entrada.nextDouble();
		
		System.out.println("Valor alquiler del Bus");		
		double valorAlquilerBus = entrada.nextDouble();
		
		System.out.println("Numero de dias del Paseo");		
		double diasDelPaseo = entrada.nextDouble();
		
		double numeroBuses, alquilerDeBuses, comida, numeroDeHabitaciones, valorTotal ;

		numeroBuses = ((pasajerosGordos*2)+pasajerosFlacos)/30 ;
		System.out.println("Numero de buses = "+ numeroBuses );
		
		alquilerDeBuses = 2 * numeroBuses * valorAlquilerBus ;
		System.out.println("Valor alquiles de buses = "+ alquilerDeBuses );		
		
		comida = (5*pasajerosGordos)+(3*pasajerosFlacos)*diasDelPaseo*valorComida ;
		System.out.println("Valor comida = "+ comida  );		
		
		
		
	}

}
