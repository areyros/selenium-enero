package com.tarea;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio #5
Crea un programa donde te pida un n�mero y muestra si es positivo o negativo y si es par o impar
 */
		
		//tipo de dato para obtener el n�mero
		Scanner reader = new Scanner(System.in);
		//variable n�mero
		Integer num;
		int numero=0;
		//petici�n del n�mero
		System.out.println("Dame el n�mero: ");
		//lectura y asignaci�n del n�mero
		num= reader.nextInt();
		//Impresi�n del n�mero capturado
		System.out.println("El n�mero ingresado es: "+num);
		
		if(num >0) {
			System.out.println("El n�mero es positivo")
			;
		}else {if(num==0) {
			System.out.println("El n�mero es 0");
		}else {
			System.out.println("El n�mero es negativo");
		}
		}
		
		 if (num % 2 == 0) {
		        System.out.println("El numerp es par");
		    } else {
		        System.out.println("El n�mero es impar");
		    }
		}
	}

