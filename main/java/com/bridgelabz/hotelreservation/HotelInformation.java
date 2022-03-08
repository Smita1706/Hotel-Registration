package com.bridgelabz.hotelreservation;

public class HotelInformation {
	private String hotelName;
	private int hotelRates;
	private int totalRate;
	public String getName() {
		return hotelName;
	}

	public void setName(String name) {
		this.hotelName = name;
	}

	public int getRates() {
		return hotelRates;
	}

	public void setRates(int rates) {
		this.hotelRates = rates;
	}

	public int getTotalRate(int daysBetween) {
		totalRate = hotelRates * (daysBetween+1);
		return totalRate;
	}

	public void setTotalRate(int totalRate) {
		this.totalRate = totalRate;
	}

	@Override
	public String toString() {
		return	"\n Hotel name : " + hotelName + 
				"\n Hotel Rates : " + hotelRates ;

	}

}
