package com.bridgelabz.hotelreservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.time.DayOfWeek;


public class HotelReservation {
	private final static DateTimeFormatter DATE_RANGE_FORMAT = DateTimeFormatter.ofPattern("ddMMMyyyy");
	ArrayList<HotelInformation> hotels = new ArrayList<>();
	static Scanner s = new Scanner(System.in);
	public boolean addHotel() {
		HotelInformation hotel = new HotelInformation();
		System.out.println("Enter hotel name: ");
		hotel.setName(s.next());
		System.out.println("Enter hotel weekday rate: ");
		hotel.setWeekdayRate(s.nextInt());
		System.out.println("Enter hotel weekend rate: ");
		hotel.setWeekendRate(s.nextInt());
		System.out.println("Enter hotel rating: ");
		hotel.setRating(s.nextInt());
		if(hotels.add(hotel)) {
			System.out.println("Hotel Added");
			System.out.println("\n");
			return true;
		}
		else 
			return false;
	}
	public ArrayList<Hotel> findCheapestRatedHotel(String initialDateRange, String endDateRange) {
        LocalDate initialDate = LocalDate.parse(initialDateRange, DATE_RANGE_FORMAT);
        LocalDate endDate = LocalDate.parse(endDateRange, DATE_RANGE_FORMAT);

        ArrayList<Hotel> results = (ArrayList<Hotel>) hotels.stream()
                .map(hotel -> {
                	Hotel Obj = new Hotel();
                	Obj.setHotelName(hotel.getName());
                	Obj.setTotalRate(hotel.getTotalRate(initialDate, endDate));
                   Obj.setRating(hotel.getRating());
                    return Obj;
                })
                .sorted(Comparator.comparing(Hotel::getTotalRate).thenComparing(Hotel::getRating,
                        Comparator.reverseOrder()))
                .collect(Collectors.toList());

        return (ArrayList<Hotel>) results.stream()
                .filter(result ->
                        result.getTotalRate() == results.get(0).getTotalRate()
                                && result.getRating() == results.get(0).getRating())
                .collect(Collectors.toList());
    }
	public  ArrayList<Hotel> findCheapestHotel(String initialDateRange, String endDateRange) {
		LocalDate initialDate = LocalDate.parse(initialDateRange, DATE_RANGE_FORMAT);
		LocalDate endDate = LocalDate.parse(endDateRange, DATE_RANGE_FORMAT);
		ArrayList<Hotel> results = (ArrayList<Hotel>) hotels.stream()
				.map(hotel -> {
					Hotel Obj = new Hotel();
					Obj.setHotelName(hotel.getName());
					Obj.setTotalRate(hotel.getTotalRate(initialDate, endDate));
					return Obj;
				})
				.sorted((type1, type2) -> (int)(type1.getTotalRate() - type2.getTotalRate()))
				.collect(Collectors.toList());
		return (ArrayList<Hotel>) results.stream().filter(result -> result.getTotalRate() == results.get(0).getTotalRate())
				.collect(Collectors.toList());


	}
	public ArrayList<Hotel> findBestRatedHotel(String initialDateRange, String endDateRange) {
        LocalDate initialDate = LocalDate.parse(initialDateRange, DATE_RANGE_FORMAT);
        LocalDate endDate = LocalDate.parse(endDateRange, DATE_RANGE_FORMAT);

        ArrayList<Hotel> results = (ArrayList<Hotel>) hotels.stream()
                .map(hotel -> {
                	Hotel Obj = new Hotel();
                	Obj.setHotelName(hotel.getName());
                	Obj.setTotalRate(hotel.getTotalRate(initialDate, endDate));
                   Obj.setRating(hotel.getRating());
                    return Obj;
                })
                .sorted(Comparator.comparing(Hotel::getRating, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        return (ArrayList<Hotel>) results.stream()
                .filter(result -> result.getRating() == results.get(0).getRating())
                .collect(Collectors.toList());
    }
	public void displayHotel() {
		System.out.println("\nHotels Present in Hotel Reservation System:");
		for(int i=0;i<hotels.size();i++) {
			System.out.println(hotels.get(i));
		}
	}
	public static void main(String[] args) {
		HotelReservation hotelObj = new HotelReservation();
		int ans, ch;
		do {
			System.out.println("Enter the your choice : ");
			System.out.println("1.Add hotel ");
			System.out.println("2.Display hotels");
			System.out.println("3.Show cheapest hotel");
			System.out.println("4.Show cheapest hotel with ratings");
			System.out.println("5.Best Rating Hotel");
			System.out.println("6.Exit");
			ch = s.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("How many hotels you want to add");
				int number = s.nextInt();
				for(int i=0;i<number;i++)
					hotelObj.addHotel();
				break;
			case 2:
				hotelObj.displayHotel();
				break;
			case 3:
				System.out.println("Hotel with cheapest rates are : ");
				System.out.println(hotelObj.findCheapestHotel("11Sep2021", "12Sep2021"));
				break;
			case 4:
				System.out.println("\n Hotel with cheapest ratings: ");
                System.out.println(hotelObj.findCheapestRatedHotel("11Sep2020", "12Sep2020"));
                break;
			case 5:
				System.out.println("\n Hotel with Best ratings: ");
                System.out.println(hotelObj.findBestRatedHotel("11Sep2020", "12Sep2020"));
                break;
			case 6:
                break;
			}
			System.out.println("Do you want to continue? if yes press '1' ");
			ans = s.nextInt();
		}while(ans == 1);
		s.close();
	}
}
