package com.tarea;

import java.util.Scanner;

public class MainNumeroDiasMes {

	public static void main(String[] args) {
		int mes, a�o;
		Scanner reader = new Scanner (System.in);
		NumeroDiasMes ano = new NumeroDiasMes();
		
		System.out.println("Dame el a�o:");
		a�o= reader.nextInt();
		System.out.println("El a�o es bisiesto??:" + ano.isLeapYear(a�o));
		
		System.out.println("Dame el mes:");
		mes = reader.nextInt();
		System.out.println("D�as del mes dependiendo al a�o??:"+ano.getDaysInMonth(mes, a�o));
	}

}
