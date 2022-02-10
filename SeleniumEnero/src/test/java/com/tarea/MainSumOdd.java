package com.tarea;

import java.util.Scanner;

public class MainSumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int numero;
		int x,y;
		SumOdd validador = new SumOdd();
		
		System.out.println("Dame el valor del numero: ");
		numero=reader.nextInt();
		System.out.println("Es mayor a 0?: "+validador.mayor(numero));
		System.out.println("Es impar?: "+validador.impar(numero));
		System.out.println("Con nuevo metodo junto, es mayor que cero y es impar?: "+validador.mayoEimpar(numero));
		
		System.out.println("Del rango de 2 números, vamos a sumar impares, dame el inicio: ");
		x=reader.nextInt();
		System.out.println("Dame el final: ");
		y=reader.nextInt();
		System.out.println("La suma de los números impares del rango de "+x +" y "+y+" es: "+validador.sumaImpar(x, y));
	}

}
