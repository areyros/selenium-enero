package com.tarea;

public class MainSimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OPPSimpleCalculator calculator = new OPPSimpleCalculator();
		calculator.setFistNumber(5.0);
		calculator.setSeconNumber(4);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFistNumber(5.25);
		calculator.setSeconNumber(0);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());
	}

}
