package com.bridgelabz.hotelreservation;

public class Hotel {
	 private String hotelName;
	    private int totalRate;

	    public String getHotelName() {
	        return hotelName;
	    }

	    public void setHotelName(String hotelName) {
	        this.hotelName = hotelName;
	    }

	    public int getTotalRate() {
	        return totalRate;
	    }

	    public void setTotalRate(int totalRate) {
	        this.totalRate = totalRate;
	    }

	    @Override
		public String toString() {
	    	System.out.println("Hotel with cheapest rates are : ");
			return	" Hotel name : " + hotelName + "  "+
					" Hotel total rates : " + totalRate ;

		}
}
