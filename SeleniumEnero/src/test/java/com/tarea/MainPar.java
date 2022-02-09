package com.tarea;

import java.util.Scanner;

public class MainPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int numero;
		System.out.println("Dame el valor del numero: ");
		numero=reader.nextInt();

		SumOdd validador = new SumOdd();
		System.out.println(validador.par(numero));
	}

}
