package com.ubs.opsit.interviews.helper;

import com.ubs.opsit.interviews.Constants.BerlinClockTime;

/**
 * The <code>ValidateTime</code> class represents as utility class
 * where in validate the time in <code>validateTime</code> method.
 * 
 */

public class ValidateTime {
	
	/**
	 * The <code>validateTime</code> method used to validate
	 * the given time in the story file.
	 * @param hour
	 * @param minutes
	 * @param seconds
	 * @return isValidTime
	 */
	public static boolean validateTime(int hour, int minutes, int seconds){
		
		boolean isValidTime = false;
		
		if( hour <= BerlinClockTime.HOUR_FORMAT.getTime() && minutes <= BerlinClockTime.MIN_SECONDS_FORMAT.getTime() 
				&& seconds <= BerlinClockTime.MIN_SECONDS_FORMAT.getTime()){
			isValidTime = true;
		}
		return isValidTime;
	}

}
