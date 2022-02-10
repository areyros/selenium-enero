package com.tarea;

public class SumOdd {
	
	//Primer metodo de prueba separado para validar si es mayor a 0 devuelve true
	public static boolean mayor (int a) {
		if (a>0)
			return true;
		else
			return false;
	}
	
	// primer metodo de prueba para saber si un numero es impar o no
	public static boolean impar(int a) {
		if (a % 2 == 0)
			return false;
		else
			return true;
	}
	
	// metodo que junta que sea mayor que 0 y que sea impar devuelve true ESTE ES EL QUE USA EL MAIN Y ES LLAMADO POR EL METODO sumaImpar
	public static boolean mayoEimpar (int a) {
		if (a<0)
			return false;
		else if (a%2 ==0)
			return false;
		else
			return true;
	}
	
	// metodo que usa el metodo mayoEimpar y que valida que el inicio sea menor al final y suma los impares dentro del rango dado
	public static int sumaImpar (int x, int y) {
		SumOdd sum = new SumOdd();
		if (y>=x && (x>0 && y>0)) {	
		int sumatoria=0;
		for (int i = x; i<=y; i++) {
			//System.out.println("Contador: "+ i);
			//System.out.println("Sumatoria: "+sumatoria);
			if (sum.mayoEimpar(i))
				sumatoria+=i;
		}return sumatoria;
		}return -1;
	}
}