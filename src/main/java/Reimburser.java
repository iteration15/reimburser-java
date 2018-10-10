package main.java;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 *
 */
public class Reimburser {	
	
	/**
	 * This method calculates the number of days between
	 * two dates.
	 * @param beginDate
	 * @param endDate
	 * @return number of days
	 */
	public int getDateRange(LocalDate beginDate, LocalDate endDate) {		
		return (int)(ChronoUnit.DAYS.between(beginDate, endDate) + 1);
	}
		
	public int getFullDays(int totalDays) {
		return totalDays - 2;		
	}
	
	public boolean areDatesEqual(LocalDate dateOne, LocalDate dateTwo) {
		if (dateOne.compareTo(dateTwo) == 0) {
			return true;
		}
		return false;
	}
}
