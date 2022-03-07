package com.bridgelabz.hotelreservation;

public class HotelInformation {
	String hotelName;
	int hotelRates;
	public String getName() {
		return hotelName;
	}

	public void setName(String name) {
		this.hotelName = name;
	}

	public int getRating() {
		return hotelRates;
	}

	public void setRating(int rates) {
		this.hotelRates = rates;
	}
	@Override
	public String toString() {
		return	"\n Hotel name : " + hotelName + 
				"\n Hotel Rates : " + hotelRates ;
				
	}

}
