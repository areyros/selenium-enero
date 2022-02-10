package com.tarea;

import java.util.Scanner;

public class MainBarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		BarkingDog dog = new BarkingDog();
		
		System.out.println("Esta el perro ladrando (true/false)?:");
		boolean barking=reader.nextBoolean();
		System.out.println("Que hora es?:");
		int hour=reader.nextInt();
		
		System.out.println("Se Despierta la persona?: "+dog.shouldWakeUp(barking, hour));
	}

}
