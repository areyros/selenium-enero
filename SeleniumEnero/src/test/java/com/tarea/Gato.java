package com.tarea;

import java.util.Scanner;
/*Los gatos pasan la mayor parte del día jugando. En particular, juegan si la temperatura está entre 25 y 35 grados (inclusive). A menos que sea verano, 
 * el límite superior es 45 grados (inclusive) en lugar de 35.
Escriba un método isCatPlaying que tenga 2 parámetros. El método debe devolver verdadero si el gato está jugando; de lo contrario, devolver falso
El primer parámetro debe ser de tipo booleano y debe llamarse "verano" que representa si es verano.
El segundo parámetro representa la temperatura y es de tipo int con el nombre "temperatura".
*/

public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperatura;
		boolean verano;
		Scanner reader = new Scanner(System.in);
		Gato bicholeta = new Gato();
		
		System.out.println("Es verano (true/false)?:");
		verano= reader.nextBoolean();
		System.out.println("Cual es la temperatura?: ");
		temperatura= reader.nextInt();
		System.out.println("Esta jugando el gato: "+ bicholeta.isCatPlaying(verano, temperatura));
	}

	public static boolean isCatPlaying ( boolean verano, int temperatura) {
		if (verano==true)
			if (temperatura>=25 && temperatura<=45 )
				return true;
			else return false;
		else if (temperatura>=25 && temperatura<=35 )
				return true;
			else return false;
	}
}
