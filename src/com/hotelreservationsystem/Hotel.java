package com.hotelreservationsystem;


public class Hotel {

	String hotelName;
	int weekdayRatesForRegulars;
	int weekendRatesForRegulars;
	int weekdayRatesForRewards;
	int weekendRatesForRewards;
	int ratings;
	
	public Hotel() {}
	
	public Hotel(String hotelName , int weekdayRatesForRegulars , int weekendRatesForRewards , int weekdayRatesForRewards , int weekendRatesForRegulars , int ratings) {
		this.hotelName = hotelName;
		this.weekdayRatesForRegulars = weekdayRatesForRegulars;
		this.weekendRatesForRegulars = weekendRatesForRegulars;
		this.weekdayRatesForRewards = weekdayRatesForRewards;
		this.weekendRatesForRewards = weekendRatesForRewards;
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
	
	public void setWeekdayRatesForRewards(int weekdayRatesForRewards) {
		this.weekdayRatesForRewards = weekdayRatesForRewards;
	}
	
	public int getWeekdayRatesForRewards() {
		return weekdayRatesForRewards;
	}
	
	public void setWeekendRatesForRewards(int weekendRatesForRewards) {
		this.weekendRatesForRewards = weekendRatesForRewards;
	}
	
	public int getWeekendRatesForRewards() {
		return weekendRatesForRewards;
	}
	
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	public int getRatings() {
		return ratings;
	}
}
