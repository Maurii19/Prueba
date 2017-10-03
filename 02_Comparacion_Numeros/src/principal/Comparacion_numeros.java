package principal;
import java.util.Scanner;

public class Comparacion_numeros {

	/*
	 El programa pide dos numeros y los compara, donde nos indica
	 cual es mayor, menor o igual.
	 */
	public static void main(String[] args) {
		Scanner lector1 = new Scanner(System.in);
		
		System.out.println("Introduce numero A");
		int numA = lector1.nextInt();

		System.out.println("Introduce numero B");
		int numB = lector1.nextInt();
		
		if (numA > numB){
			System.out.println("A es mayor que B");
		}
		else if (numA < numB){
			System.out.println("A es menor que B");
		}
		
		else{
			System.out.println("A es igual que B");
		}
		
	
	}
	

}
