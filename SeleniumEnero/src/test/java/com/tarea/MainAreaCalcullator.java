package com.tarea;

import java.util.Scanner;

/*
 * Escribe un método llamado área con un parámetro doble llamado radio.
El método necesita devolver un valor doble que represente el área de un círculo.
Si el radio del parámetro es negativo, devuelva -1.0 para representar un valor no válido.
Escriba otro método sobrecargado con 2 parámetros x e y (ambos dobles), donde x e y representan los lados de un rectángulo.
El método necesita devolver un área de un rectángulo.
Si uno o ambos parámetros son negativos, devuelva -1.0 para indicar un valor no válido.
Para las fórmulas y el valor de PI, consulte los consejos a continuación.
 */


public class MainAreaCalcullator {

	public static void main(String[] args) {
		double ejeX,ejeY;
		Scanner reader = new Scanner(System.in);
		AreaCalcullator circulo = new AreaCalcullator();
		AreaCalcullator rectangulo = new AreaCalcullator();
		
		System.out.println("Dame el radio:");
		System.out.println("El área del circulo es:"+circulo.area(reader.nextDouble()));

		System.out.println("Dame el ejeX:");
		ejeX=reader.nextDouble();
		System.out.println("Dame el ejeY:");
		ejeY=reader.nextDouble();
		System.out.println("El área del rectángulo es:"+rectangulo.area(ejeX, ejeY));
	}

}
