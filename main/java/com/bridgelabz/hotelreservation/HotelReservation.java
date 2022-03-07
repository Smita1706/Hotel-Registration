package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
	int added = 0;
	ArrayList<HotelInformation> hotels = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	public boolean addHotel() {
		HotelInformation hotel = new HotelInformation();
		System.out.println("Enter hotel name: ");
		hotel.setName(scanner.next());
		System.out.println("Enter hotel rate: ");
		hotel.setRating(scanner.nextInt());
		hotels.add(hotel);
		System.out.println("Hotel Added");
		added++;
		if(hotels.add(hotel))
			return true;
		else 
			return false;
		

	}
	public void DisplayHotel() {
		System.out.println("\nHotels Present in Hotel Reservation System:");
		for(int i=0;i<hotels.size();i++) {
			System.out.println(hotels.get(i));
		}
	}
	public static void main(String[] args) {
		HotelReservation hotelObj = new HotelReservation();
		hotelObj.addHotel();
		hotelObj.DisplayHotel();
	}
}
