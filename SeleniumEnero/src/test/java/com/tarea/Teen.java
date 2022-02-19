package com.tarea;

public class Teen {

	public static boolean isTeen (int a) {
		if (a>=13 && a<=19)
			return true;
		else
			return false;
	}
		
	public static boolean hasTeen (int x, int y, int z) {
		Teen var = new Teen();
		if (var.isTeen(x)==true || var.isTeen(y)==true || var.isTeen(z)==true)
			return true;
		else
			return false;
	}
}

