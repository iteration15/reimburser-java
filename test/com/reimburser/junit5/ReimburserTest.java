package com.reimburser.junit5;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import main.java.Reimburser;

class ReimburserTest {
	
	Reimburser r = new Reimburser();	

	@Test
	void getDateRange_happypath() {
		LocalDate startDate = LocalDate.parse("2015-09-01");
		LocalDate endDate = LocalDate.parse("2015-09-03");
		int result = r.getDateRange(startDate, endDate);
		assertEquals(3, result);		
	}
	
	@Test
	void getFullDays_happypath() {
		int total = 3;
		int result = r.getFullDays(total);
		assertEquals(1, result);
	}
	
	@Test
	void areDatesEqual_happypath() {
		LocalDate startDate = LocalDate.parse("2015-09-01");
		LocalDate endDate = LocalDate.parse("2015-09-01");
		boolean result = r.areDatesEqual(startDate, endDate);
		assertEquals(true, result);
	}
}