package com.tarea;

import java.util.Scanner;

public class MainImprimirVerificador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		int a,b,c;
		System.out.println("Dame el valor de a: ");
		a=reader.nextInt();
		System.out.println("Dame el valor de b: ");
		b=reader.nextInt();
		System.out.println("Dame el valor de c: ");
		c=reader.nextInt();
		
		ImprimirVerificador metodo = new ImprimirVerificador();
		metodo.imprimirVerificadorNumeros(a, b, c);
	}

}
