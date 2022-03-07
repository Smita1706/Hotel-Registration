package com.bridgelabz.hotelreservation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {
	
	HotelReservation hotel = null;
	@Before
	public void initialization() {
		hotel = new HotelReservation();
	}
	@Test
	public void givenHotelInfo_shouldAddHotelInList(){
       boolean result = hotel.addHotel();
       Assert.assertTrue(result);
	}
}
