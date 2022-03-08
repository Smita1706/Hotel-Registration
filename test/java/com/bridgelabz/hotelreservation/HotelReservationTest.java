package com.bridgelabz.hotelreservation;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {
	
	HotelReservation hotel = null;
	@Before
	public void initialization() {
		hotel = new HotelReservation();
	}
//	@Test
//	public void givenHotelInfo_shouldAddHotelInList(){
//       boolean result = hotel.addHotel();
//       Assert.assertTrue(result);
//	}
	@Test
	public void givenHotelInfo_shouldReturnChepestHotel(){
		for(int i=0;i<3;i++)
			 hotel.addHotel();
       ArrayList<Hotel> arr= hotel.findCheapestHotel("10Sep2021", "11Sep2021");
       int expected = arr.get(0).getTotalRate();
      System.out.println( hotel.hotels.get(0));;
       Assert.assertEquals(220, expected);
	}
	
	
}
