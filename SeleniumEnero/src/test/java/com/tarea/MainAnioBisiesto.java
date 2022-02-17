package com.tarea;

import java.util.Scanner;

public class MainAnioBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		AnioBisiesto anio = new AnioBisiesto();
		
		System.out.println("Dame el anio:");
		System.out.println("El anio es bisiesto??: "+anio.isLeapYear(reader.nextInt()));
	}

}
