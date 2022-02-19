package com.tarea;

public class OPPSimpleCalculator{

	protected double fistNumber;
	protected double seconNumber;

	
	public double getFistNumber() {
		return fistNumber;
	}

	public void setFistNumber(double fistNumber) {
		this.fistNumber = fistNumber;
	}

	public double getSeconNumber() {
		return seconNumber;
	}

	public void setSeconNumber(double seconNumber) {
		this.seconNumber = seconNumber;
	}

	public double getAdditionResult() {
		return getFistNumber() + getSeconNumber();
	}
	
	public double getSubtractionResult() {
		return getFistNumber()- getSeconNumber();
	}
	
	public double getMultiplicationResult() {
		return getFistNumber() * getSeconNumber() ;
	}
	
	public double getDivisionResult() {
		if( getSeconNumber()==0)
			return 0;
		else
		return getFistNumber() / getSeconNumber();
	}
}
