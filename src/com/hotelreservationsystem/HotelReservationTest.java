package com.hotelreservationsystem;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class HotelReservationTest {
	
	@Test
	public void findCheapestHotelForGivenDateRange_ConsideringOnlyWeekdayRates() {
		HotelReservationSystem hotelReservationsystem = new HotelReservationSystem();
		String hotel = hotelReservationsystem.findCheapestHotelForGivenDateRangeConsideringWeekdayRatesOnly("10Sep2020","11Sep2020");
		Assert.assertEquals("Lakewood", hotel);
	}
	
	@Test
	public void findCheapestHotelForGivenDateRange_ConsideringBothWeekdayAndWeekendRates() {
		HotelReservationSystem hotelReservationsystem = new HotelReservationSystem();
		List<String> actualList = hotelReservationsystem.findCheapestHotelForGivenDateRangeConsideringWeekdayAndWeekendRatesBoth("11Sep2020", "12Sep2020");
		List<String> expectedList = new ArrayList<>(Arrays.asList("Lakewood","Bridgewood"));
		Assert.assertEquals(expectedList, actualList);
	}
	
	@Test
	public void findCheapestBestRatedHotelForRewardsCustomer() {
		HotelReservationSystem hotelReservationsystem = new HotelReservationSystem();
		String hotel = hotelReservationsystem.findCheapestBestRatedHotelForRegulars("11Sep2020", "12Sep2020");
		Assert.assertEquals("Bridgewood",hotel);
	}
	
	@Test
	public void findBestRatedHotelForRegulars() {
		HotelReservationSystem hotelReservationsystem = new HotelReservationSystem();
		String hotel = hotelReservationsystem.findBestRatedHotelForRegulars("11Sep2020", "12Sep2020");
		Assert.assertEquals("Ridgewood",hotel);
	}

}