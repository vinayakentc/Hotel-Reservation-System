package com.hotelreservationsystem;


import org.junit.*;

public class HotelReservationTest {
	
	@Test
	public void findCheapestHotelForGivenDateRange_ConsideringOnlyWeekdayRates() {
		HotelReservationSystem hotelReservationsystem = new HotelReservationSystem();
		String hotel = hotelReservationsystem.findCheapestHotelForGivenDateRangeConsideringWeekdayRatesOnly("10Sep2020","11Sep2020");
		Assert.assertEquals("Lakewood", hotel);
	}
}
