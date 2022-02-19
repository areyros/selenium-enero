package com.tarea;

public class OPPPerson {
	protected String firstName;
	protected String lastName;
	protected int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int edad) {
		if(edad<0 || edad>100)
			edad=0;
		else
			this.age = edad;
	}
	
	/*
	public boolean isTeen() {
		Teen val = new Teen();
		if(val.isTeen(getAge())==true)
			return true;
		else
			return false;
	}
	*/
	
	public boolean isTeen() {
		if (getAge()>=13 && getAge()<=19)
			return true;
		else
			return false;
	}
	
	public String getFullName() {
		if (getFirstName().isEmpty()==true && getLastName().isEmpty()==true)
			return "";
		else
			if (getFirstName().isEmpty()==true)
				return getLastName();
			else
				if ( getLastName().isEmpty()==true)
					return getFirstName();
				else
					return getFirstName() + " " + getLastName();
	}
}
