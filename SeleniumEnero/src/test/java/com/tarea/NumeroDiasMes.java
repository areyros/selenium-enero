package com.tarea;

public class NumeroDiasMes {

	public static boolean isLeapYear (int year) {
		if(year>=1 && year <=9999) {
			if(year %4 ==0 &&(year%400 !=0)) {
				return true;
			}else if (year%400==0)
				return true;
			else return false;
		}
		else return false;
	}
	
	public static int getDaysInMonth (int mes, int año) {
		if((mes<1 || mes>12 ) || (año<1 || año>9999))
			return -1;
		else {
			NumeroDiasMes validador = new NumeroDiasMes();
			switch (mes) {
				case 1:
					return 31;
				case 2:
					if (validador.isLeapYear(año)==true)
						return 29;
					else
						return 28;
			}
		} return 300;
	}
}