package com.pradeep.test.class1;

public class Flight {
	
	int seats = 100;
	int totalCheckedBags;
	Passenger passengers;

	public void addPassenger(Passenger... list) {
		
		if(hasSeating(list.length)) {
		
			for(Passenger passenger : list)
				totalCheckedBags += passenger.getCheckedBags();
	
			
		}
		
	}

	private boolean hasSeating(int count) {
		
		return count<seats;
	}
	
	public void printPassengers() {
		System.out.println("Total Seats on the flight" + seats + " and Checked bags" + totalCheckedBags );
		
		
	}
	
	public static void main(String[] args) {
		
		Flight f = new Flight();
		Passenger pradeep = new Passenger("Pradeep", 2);
		Passenger pavithra = new Passenger("Pavithra", 3);
		Passenger[] arraySample = {pradeep, pavithra};
		System.out.println(arraySample);
		f.addPassenger(pradeep, pavithra);
		f.printPassengers();
		
	}
	
}
