package com.hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservationSystem {

	final Hotel LAKEWOOD = new Hotel("Lakewood", 110, 90, 3);
	final Hotel BRIDGEWOOD = new Hotel("Bridgewood", 150, 50, 4);
	final Hotel RIDGEWOOD = new Hotel("Ridgewood", 220, 150, 5);

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
		List<Integer> price = hotelList.stream().map(hotel -> hotel.getWeekdayRatesForRegulars() * days)
				.collect(Collectors.toList());
		int minPrice = Collections.min(price);
		Hotel cheapestHotel = hotelList.stream().filter(hotel -> hotel.getWeekdayRatesForRegulars() * days == minPrice)
				.findFirst().orElse(null);
		System.out.println("Cheapest hotel: " + cheapestHotel.getHotelName() + " cost: " + minPrice);
		return cheapestHotel.getHotelName();
	}

	public List<String> findCheapestHotelForGivenDateRangeConsideringWeekdayAndWeekendRatesBoth(String startDate,
			String endDate) {
		int days = getTotalDays(startDate, endDate);
		int weekends = getWeekends(startDate, endDate);
		int weekdays = days - weekends;
		List<Integer> price = hotelList.stream().map(hotel -> totalPrice(hotel, weekends, weekdays))
				.collect(Collectors.toList());
		int minPrice = Collections.min(price);
		List<String> cheapestHotelList = hotelList.stream()
				.filter(hotel -> totalPrice(hotel, weekends, weekdays) == minPrice).map(hotel -> hotel.getHotelName())
				.collect(Collectors.toList());
		for (String hotel : cheapestHotelList)
			System.out.println("Cheapest hotel: " + hotel + " cost: " + minPrice);
		return cheapestHotelList;
	}

	public String findCheapestBestRatedHotelForRegulars(String startDate, String endDate) {
		int days = getTotalDays(startDate, endDate);
		int weekends = getWeekends(startDate, endDate);
		int weekdays = days - weekends;
		List<Integer> price = hotelList.stream().map(hotel -> totalPrice(hotel, weekends, weekdays))
				.collect(Collectors.toList());
		int minPrice = Collections.min(price);
		List<Hotel> cheapestHotelList = hotelList.stream()
				.filter(hotel -> totalPrice(hotel, weekends, weekdays) == minPrice).collect(Collectors.toList());
		Hotel hotel = cheapestHotelList.stream().max(Comparator.comparing(Hotel::getRatings))
				.orElseThrow(NoSuchElementException::new);
			System.out.println("Cheapest hotel: " + hotel.getHotelName() + " ratings: " + hotel.getRatings() + " cost: "
					+ minPrice);
		return hotel.getHotelName();
	}

	public String findBestRatedHotelForRegulars(String startDate, String endDate) {
		int days = getTotalDays(startDate, endDate);
		int weekends = getWeekends(startDate, endDate);
		int weekdays = days - weekends;
		Hotel hotel = hotelList.stream()
				.max(Comparator.comparing(Hotel::getRatings))
				.orElseThrow(NoSuchElementException::new);
		int price = totalPrice(hotel, weekends, weekdays);
		System.out.println("Hotel: "+hotel.getHotelName()+" ratings: "+hotel.getRatings()+" cost: "+price);
		return hotel.getHotelName();
	}
	public int totalPrice(Hotel hotel, int weekends, int weekdays) {
		return hotel.getWeekdayRatesForRegulars() * weekdays + hotel.getWeekendRatesForRegulars() * weekends;
	}

	public int getWeekends(String checkInDate, String checkOutDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate date1 = LocalDate.parse(checkInDate, dtf);
		LocalDate date2 = LocalDate.parse(checkOutDate, dtf);
		int difference = (int) ChronoUnit.DAYS.between(date1, date2);
		int totalDays = difference + 1;
		int weekends = 0;
		for (int i = 0; i < totalDays; i++) {
			LocalDate dateIn = LocalDate.parse(checkInDate, dtf);
			LocalDate date = dateIn.plusDays(i);
			DayOfWeek day = date.getDayOfWeek();
			if (day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY) {
				weekends++;
			}
		}
		return weekends;
	}
}