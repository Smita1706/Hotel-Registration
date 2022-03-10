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
	/*@Test
	public void givenHotelInfo_shouldReturnChepestHotel(){
		for(int i=0;i<3;i++)
			 hotel.addHotel();
       ArrayList<Hotel> arr= hotel.findCheapestHotel("10Sep2021", "11Sep2021");
       int expected = arr.get(0).getTotalRate();
       Assert.assertEquals(220, expected);
	}*/

	/*@Test
	public void givenHotelInfo_shouldReturnWeekdaysWeekendsRates() {
		for(int i=1;i<=3;i++)
			hotel.addHotel();
      ArrayList<Hotel> arr = hotel.findCheapestHotel("10Sep2021", "11Sep2021");
      String expected = arr.get(0).getHotelName();
      Assert.assertEquals("Lakewood", "Bridgewood" , expected);
		
	}*/
	@Test
	public void givenHotelInfo_shouldReturnCheapestRatingHotel() {
		for(int i=1;i<=3;i++)
			hotel.addHotel();
		ArrayList<Hotel> arr = hotel.findCheapestRatedHotel("11Sep2021", "12Sep2021");
		String expected = arr.get(0).getHotelName();
		Assert.assertEquals("Bridgewood" , expected);
	}
	
	@Test
	public void givenHotelInfo_shouldReturnBestRatingHotel() {
		for(int i=1;i<=3;i++)
			hotel.addHotel();
		ArrayList<Hotel> arr = hotel.findBestRatedHotel("11Sep2021", "12Sep2021");
		String expected = arr.get(0).getHotelName();
		Assert.assertEquals("Ridgewood" , expected);
	}
}
