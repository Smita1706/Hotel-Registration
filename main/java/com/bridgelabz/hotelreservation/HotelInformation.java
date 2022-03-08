package com.bridgelabz.hotelreservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.Stream;

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
/*
	public int getTotalRate(int daysBetween) {
		totalRate = hotelRates * (daysBetween+1);
		return totalRate;
	}
*/
	public int getTotalRate(LocalDate initialDate, LocalDate endDate) {
		int day1Rate = Stream.iterate(initialDate, date -> date.plusDays(1))
                .limit(endDate.getDayOfMonth() - initialDate.getDayOfMonth() + 1)
                .map(date -> {
                    if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                        return getWeekendRate();
                    }
                    return getWeekdayRate();
                })
                .reduce((total, next) -> total).get();
		
		int day2Rate = Stream.iterate(endDate, date -> date.plusDays(1))
                .limit(endDate.getDayOfMonth() - initialDate.getDayOfMonth() + 1)
                .map(date -> {
                    if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                        return getWeekendRate();
                    }
                    return getWeekdayRate();
                })
                .reduce((total, next) -> total).get();
		
		return day1Rate+day2Rate;
	}
	
	public void setTotalRate(int totalRate) {
		this.totalRate = totalRate;
	}

	@Override
	public String toString() {
		return	"\n Hotel name : " + hotelName + 
				//"\n Hotel Rates : " + hotelRates ;
				"\n Hotel weekend Rates : " + weekendRate +
				"\n Hotel weekday Rates : " + weekdayRate ;

	}

}
