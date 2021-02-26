package com.hotelreservationsystem;


import java.util.*;

public class HotelReservationSystem {

	static final Hotel LAKEWOOD = new Hotel("Lakewood",110);
	static final Hotel BRIDGEWOOD = new Hotel("Bridgewood",160);
	static final Hotel RIDGEWOOD = new Hotel("Ridgewood",220);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program");
		List<Hotel> hotelList = new ArrayList<>();
		
		hotelList.add(LAKEWOOD);
		hotelList.add(BRIDGEWOOD);
		hotelList.add(RIDGEWOOD);	
	}
}