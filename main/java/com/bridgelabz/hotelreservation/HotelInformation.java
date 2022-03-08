package com.bridgelabz.hotelreservation;

public class HotelInformation {
	private String hotelName;
	private int hotelRates;
	private int totalRate;
	private int weekendRate;
	private int weekdayRate;
	public String getName() {
		return hotelName;
	}

	public int getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}

	public int getWeekdayRate() {
		return weekdayRate;
	}

	public void setWeekdayRate(int weekdayRate) {
		this.weekdayRate = weekdayRate;
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
