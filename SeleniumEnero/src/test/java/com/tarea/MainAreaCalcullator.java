package com.tarea;

import java.util.Scanner;

/*
 * Escribe un m�todo llamado �rea con un par�metro doble llamado radio.
El m�todo necesita devolver un valor doble que represente el �rea de un c�rculo.
Si el radio del par�metro es negativo, devuelva -1.0 para representar un valor no v�lido.
Escriba otro m�todo sobrecargado con 2 par�metros x e y (ambos dobles), donde x e y representan los lados de un rect�ngulo.
El m�todo necesita devolver un �rea de un rect�ngulo.
Si uno o ambos par�metros son negativos, devuelva -1.0 para indicar un valor no v�lido.
Para las f�rmulas y el valor de PI, consulte los consejos a continuaci�n.
 */


public class MainAreaCalcullator {

	public static void main(String[] args) {
		double ejeX,ejeY;
		Scanner reader = new Scanner(System.in);
		AreaCalcullator circulo = new AreaCalcullator();
		AreaCalcullator rectangulo = new AreaCalcullator();
		
		System.out.println("Dame el radio:");
		System.out.println("El �rea del circulo es:"+circulo.area(reader.nextDouble()));

		System.out.println("Dame el ejeX:");
		ejeX=reader.nextDouble();
		System.out.println("Dame el ejeY:");
		ejeY=reader.nextDouble();
		System.out.println("El �rea del rect�ngulo es:"+rectangulo.area(ejeX, ejeY));
	}

}
