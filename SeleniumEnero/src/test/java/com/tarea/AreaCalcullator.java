package com.tarea;

public class AreaCalcullator {

	public static double area(double radius) {
		double areaCirculo;
		if (radius<0)
			return -1;
		else {
			areaCirculo=(Math.PI)*(radius*radius);
		return areaCirculo;
		}
	}
	
	public static double area(double ejeX, double ejeY) {
		double areaRectangulo;
		if (ejeX<0 || ejeY<0)
			return -1;
		else { 
			areaRectangulo=ejeX*ejeY;
		return areaRectangulo;
		}
	}
}

