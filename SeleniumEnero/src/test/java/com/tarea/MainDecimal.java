package com.tarea;

import java.util.Scanner;

public class MainDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner (System.in);
		Decimal validador = new Decimal();
		
		System.out.println("Dame el primer valor double: ");
		double a = reader.nextDouble();
		System.out.println("Dame el segundo valor double: ");
		double b = reader.nextDouble();
		
		System.out.println("los decimales son iguales?: "+validador.areEqualByThreeDecimalPlaces(a, b));
	}

}
