package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
	ArrayList<HotelInformation> hotels = new ArrayList<>();
	static Scanner s = new Scanner(System.in);
	public boolean addHotel() {
		HotelInformation hotel = new HotelInformation();
		System.out.println("Enter hotel name: ");
		hotel.setName(s.next());
		System.out.println("Enter hotel rate: ");
		hotel.setRating(s.nextInt());
		hotels.add(hotel);
		System.out.println("Hotel Added");
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
		int ans, ch;
		do {
			System.out.println("Enter the choice : ");
			System.out.println("1.Add ");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			ch = s.nextInt();
			switch(ch) {
			case 1: 
				hotelObj.addHotel();
				break;
			case 2:
				hotelObj.DisplayHotel();
				break;
			case 3:
				break;

			}System.out.println("Do you want to continue? if yes press '1' ");
			ans = s.nextInt();
		}while(ans == 1);
		s.close();
	}
}
