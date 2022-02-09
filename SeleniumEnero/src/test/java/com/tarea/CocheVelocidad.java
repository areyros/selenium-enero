package com.tarea;

import java.util.Scanner;

public class CocheVelocidad {

	public static void main(String[] args) {
		/*
		 * * Crear un programa que valide el limite de velocidad de un coche cuando vaya en una carretera, 
		 * zona escolar o calle normal utilizandoestructuras condicionales con IF
********* Nota: Tomar como ejemplo el ejercicio realizado en clase. ***************
*/
		Scanner reader = new Scanner(System.in);
		int  limite;
		int velocidad;
		boolean carretera=true;
		boolean zona=false;
		boolean normal=true;
		System.out.println("Dame el límite de velocidad: ");
		limite= reader.nextInt();
		System.out.println("Dame la velocidad: ");
		velocidad= reader.nextInt();
		
		if(zona==true) {
			System.out.println("Estas en una zona escolar, no puedes ir así");
		} else if (normal == true) {
			if(carretera==true) {
				if (velocidad>=limite) {
					System.out.println("Excediste el límite de velocidad");
				}else {
					System.out.println("Vas por debajo del límite");
				}
			
			} else {
				System.out.println("Estas en calle, vas bien");
			}
		}
	}

}
