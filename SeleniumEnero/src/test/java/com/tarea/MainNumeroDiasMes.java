package com.tarea;

import java.util.Scanner;

public class MainNumeroDiasMes {

	public static void main(String[] args) {
		int mes, año;
		Scanner reader = new Scanner (System.in);
		NumeroDiasMes ano = new NumeroDiasMes();
		
		System.out.println("Dame el año:");
		año= reader.nextInt();
		System.out.println("El año es bisiesto??:" + ano.isLeapYear(año));
		
		System.out.println("Dame el mes:");
		mes = reader.nextInt();
		System.out.println("Días del mes dependiendo al año??:"+ano.getDaysInMonth(mes, año));
	}

}
