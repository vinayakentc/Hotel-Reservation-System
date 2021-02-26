package com.hotelreservationsystem;

public class Hotel {

	String hotelName;
	int weekdayRatesForRegulars;
	int weekendRatesForRegulars;
	
	public Hotel() {}
	
	public Hotel(String hotelName , int weekdayRatesForRegulars , int weekendRatesForRegulars) {
		this.hotelName = hotelName;
		this.weekdayRatesForRegulars = weekdayRatesForRegulars;
		this.weekendRatesForRegulars = weekendRatesForRegulars;
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
	
	public void setWeekendRatesForRegulars(int weekendRatesForRegulars) {
		this.weekendRatesForRegulars = weekendRatesForRegulars;
	}
	
	public int getWeekendRatesForRegulars() {
		return weekendRatesForRegulars;
	}
}
