package com.tarea;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio #5
Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar
 */
		
		//tipo de dato para obtener el número
		Scanner reader = new Scanner(System.in);
		//variable número
		Integer num;
		int numero=0;
		//petición del número
		System.out.println("Dame el número: ");
		//lectura y asignación del número
		num= reader.nextInt();
		//Impresión del número capturado
		System.out.println("El número ingresado es: "+num);
		
		if(num >0) {
			System.out.println("El número es positivo")
			;
		}else {if(num==0) {
			System.out.println("El número es 0");
		}else {
			System.out.println("El número es negativo");
		}
		}
		
		 if (num % 2 == 0) {
		        System.out.println("El numerp es par");
		    } else {
		        System.out.println("El número es impar");
		    }
		}
	}

