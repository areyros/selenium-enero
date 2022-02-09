package com.tarea;

public class EjercicioArreglos {
	public static void main(String[] args) {
		// Arreglo Bidimensional impres
		String[][] nombres = new String[3][3];
		
		nombres[0][0]= "Cero Cero";
		nombres[0][1]= "Cero Uno";
		nombres[0][2]= "Cero Dos";
		nombres[1][0]= "Uno Cero";
		nombres[1][1]= "Uno Uno";
		nombres[1][2]= "Uno Dos";
		nombres[2][0]= "Dos Cero";
		nombres[2][1]= "Dos Uno";
		nombres[2][2]= "Dos Dos";
		
		System.out.println("Este es el arreglo impreso con for");
		for (int i=0; i<=2; i++) {
			for (int e=0; e<=2; e++) {
				System.out.println("El eje X "+i +e +nombres[i][e]);
			}
		}
		
		
		String[][] nombres2 = new String[2][2];
		
		nombres2[0][0]= "X00";
		nombres2[0][1]= "X01";
		nombres2[1][0]= "Y10";
		nombres2[1][1]= "Y11";
		int a=0;
		int b=0;
		System.out.println("Este es el arreglo impreso con while");
		while (a<=1) {			
			while (b<=1) {
				System.out.println("El eje X "+a +b +nombres2[a][b]);
				b++;
			}
			b=0;
			a++;
		}
				
			}

}
