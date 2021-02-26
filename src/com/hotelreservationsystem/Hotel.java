package com.hotelreservationsystem;

public class Hotel {

	String hotelName;
	int weekdayRatesForRegulars;
	
	public Hotel() {}
	
	public Hotel(String hotelName , int weekdayRatesForRegulars) {
		this.hotelName = hotelName;
		this.weekdayRatesForRegulars = weekdayRatesForRegulars;
	}
	
	public void setHotelName(String hotelName) {
	    this.hotelName = hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public void setWeekdayRatesForRegulars(int weekdayRatesForRegulars) {
		this.weekdayRatesForRegulars = weekdayRatesForRegulars;
	}
	
	public int getWeekdayRatesForRegulars() {
		return weekdayRatesForRegulars;
	}
}
