package com.tarea;

import java.util.Scanner;

public class MainTeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader= new Scanner (System.in);
		Teen val = new Teen();
		int z;
		
		System.out.println("Dame el número:");
		z=reader.nextInt();
		
		System.out.println("El número es Teen??: "+val.isTeen(z));
		
		System.out.println("Dame el valor de a, b, c:");
		int a,b,c;
		a=reader.nextInt();
		b=reader.nextInt();
		c=reader.nextInt();
		
		System.out.println("Alguno de los parametros tiene Teen??: "+val.hasTeen(a, b, c));
		
	}

}
