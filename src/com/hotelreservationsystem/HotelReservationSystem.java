package com.hotelreservationsystem;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservationSystem {

	final Hotel LAKEWOOD = new Hotel("Lakewood", 110);
	final Hotel BRIDGEWOOD = new Hotel("Bridgewood", 160);
	final Hotel RIDGEWOOD = new Hotel("Ridgewood", 220);

	static String checkInDate;
	static String checkOutDate;

	List<Hotel> hotelList = new ArrayList<>();
	
	public HotelReservationSystem() {
		hotelList.add(LAKEWOOD);
		hotelList.add(BRIDGEWOOD);
		hotelList.add(RIDGEWOOD);
	}

	public int getTotalDays(String checkInDate, String checkOutDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate date1 = LocalDate.parse(checkInDate, dtf);
		LocalDate date2 = LocalDate.parse(checkOutDate, dtf);
		int difference = (int) ChronoUnit.DAYS.between(date1, date2);
		int totalDays = difference + 1;
		return totalDays;
	}

	public String findCheapestHotelForGivenDateRangeConsideringWeekdayRatesOnly(String startDate, String endDate) {
		int days = getTotalDays(startDate, endDate);
		List<Integer> price = hotelList.parallelStream().map(hotel -> hotel.getWeekdayRatesForRegulars() * days)
				.collect(Collectors.toList());
		int minPrice = Collections.min(price);
		Hotel cheapestHotel = hotelList.stream().filter(hotel -> hotel.getWeekdayRatesForRegulars() * days == minPrice)
				.findFirst().orElse(null);
		System.out.println("Cheapest hotel: " + cheapestHotel.getHotelName() + " cost: " + minPrice);
		return cheapestHotel.getHotelName();
	}
}