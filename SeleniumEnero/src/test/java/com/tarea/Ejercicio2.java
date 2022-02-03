package com.tarea;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ejercicio #2
Crear una clase (public static void main) con 4 variables tipo String con los siguientes valores:
Var 1 = “Cool”
Var 2 = “Selenium con Java”
Var 3 = “Curso de”
Var 4 = “Testers”
El programa debe imprimir el siguiente mensaje Eutilizando la concatenación de Java:
“Curso de Selenium con Java CoolTesters”.
 
 * */
		
		
		String var1 = new String ("Cool");
		String var2 = new String ("Selenium con Java");
		String var3 = new String ("Curso de");
		String var4 = new String ("Testers");
		
		System.out.println('"'+var3+" "+var2+" "+var1+var4+'"'+".");
	}

}
