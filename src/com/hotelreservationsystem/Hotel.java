package com.hotelreservationsystem;

public class Hotel {

	String hotelName;
	int weekdayRatesForRegulars;
	int weekendRatesForRegulars;
	int ratings;
	
	public Hotel() {}
	
	public Hotel(String hotelName , int weekdayRatesForRegulars , int weekendRatesForRegulars , int ratings) {
		this.hotelName = hotelName;
		this.weekdayRatesForRegulars = weekdayRatesForRegulars;
		this.weekendRatesForRegulars = weekendRatesForRegulars;
		this.ratings = ratings;
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
	
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	public int getRatings() {
		return ratings;
	}
}
