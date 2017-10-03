import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		//creamos un objeto para leer del teclado
		Scanner lector = new Scanner(System.in);
		
		
		//leemos del teclado
		System.out.println("Escribir nombre:");
		String nombre = lector.nextLine();
		
		System.out.println("Escribir primer apellido:");
		String apellido = lector.nextLine();
		
		System.out.println("Escribir segundo apellido:");
		String apellido2 = lector.nextLine();
		
		
		//concanetacion de strings
		System.out.println("Hola "+ apellido + " " + apellido2 + " " + nombre);
		
		
		//si es mayor o menor de edad
		System.out.println("Introduce tu edad");
		int edad = lector.nextInt();
		
		if(edad >=18){
			System.out.println(nombre+ " es mayor de edad.");
		}
		else{
			System.out.println(nombre+ " es menor de edad");
		}
		

		

	}

}
