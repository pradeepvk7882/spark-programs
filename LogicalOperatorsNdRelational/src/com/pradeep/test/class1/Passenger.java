package com.pradeep.test.class1;

public class Passenger {

	
	String name;
	int checkedBags;
	
	public Passenger() {}
	
	public Passenger(String name, int checkedBags) {
		this.name = name;
		this.checkedBags = checkedBags;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCheckedBags() {
		return checkedBags;
	}

	public void setCheckedBags(int checkedBags) {
		this.checkedBags = checkedBags;
	}

	
	
}
