package main.java;

import java.time.LocalDate;

/**
 *
 *
 */
public class ReimburserApp {

	public static void main(String[] args) {
				
		LocalDate startDate1 = LocalDate.parse("2015-09-01");
		LocalDate endDate1 = LocalDate.parse("2015-09-03");
		
		LocalDate startDate2 = LocalDate.parse("2015-09-02");
		LocalDate endDate2 = LocalDate.parse("2015-09-06");
		
		LocalDate startDate3 = LocalDate.parse("2015-09-06");
		LocalDate endDate3 = LocalDate.parse("2015-09-08");		
		
		Reimburser r = new Reimburser();
		
		int totalDays2 = r.getDateRange(startDate2, endDate2);
		int totalDays3 = r.getDateRange(startDate3, endDate3);
		
		int fullDays2 = r.getFullDays(totalDays2);
		int fullDays3 = r.getFullDays(totalDays3);		
		
		boolean areDatesEqual = r.areDatesEqual(endDate2, startDate3);
		
		if (areDatesEqual == true) {
			System.out.println("dates are equal!");
		}
		else {
			System.out.println("dates are NOT equal!");
		}
		
		
		
		
		
		System.out.println("total days of project 2: " + totalDays2);
		System.out.println("total \"full days\": " + fullDays2);
		
		System.out.println("total days of project 3: " + totalDays3);
		System.out.println("total \"full days\": " + fullDays3);
		
	}

}
