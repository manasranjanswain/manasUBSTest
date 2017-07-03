package com.ubs.opsit.interviews.Constants;

/**
 * The <code>BerlinClockTime</code> represents to get the time format of
 * Berlin clock standard.
 * 
 *
 */

public enum BerlinClockTime {
	
	CLOCK_HOUR_LAMP_DIVIDEND(5),
	CLOCK_HOUR_LAMP_COUNT(4),
	CLOCK_MIN_LAMP_COUNT(11),
	CLOCK_SEC_LAMP_COUNT(2),
	HOUR_FORMAT(24),
	MIN_SECONDS_FORMAT(60);
	
	/**
	 * Time attribute used to get the time format
	 */
	
	private int time;
	
	/**
	 * Construct instance of <code>Time</code>
	 * @param time
	 */
	private BerlinClockTime(int time) {
		this.time = time;
	}

	/**
	 * The <code>getTime</code> returns time from the enum to display message.
	 * @return the time
	 */
	public int getTime() {
		return time;
	}


}
