package com.ubs.opsit.interviews.helper;

import com.ubs.opsit.interviews.Constants.BerlinClockTime;

public class BerlinTimeParser {
	
	/**
	 * The <code>fiveHourLightIllumination</code> method constructs 
	 * the second row illumination by dividing 5 and lit the light based 
	 * on the quotient from the default i.e, form the off state (OOOO),
	 * else not.
	 * @param hour
	 * @return fiveHourIllumination
	 */
	
	public static String fiveHourLightIllumination(int hour) {
		StringBuilder fiveHourIllumination = new StringBuilder("OOOO");
		
		// If the hour should be greater than 0  and the quotient greater than or equal to 4 then lit the light, else not to lit 
		if( hour > 0 ){
			int quotient = hour / BerlinClockTime.CLOCK_HOUR_LAMP_DIVIDEND.getTime();
				if (quotient <= BerlinClockTime.CLOCK_HOUR_LAMP_COUNT.getTime() ){
					for (int i = 0; i < quotient; i++) {
						fiveHourIllumination.setCharAt(i, 'R');
					}
				}
		}
		return fiveHourIllumination.toString();
	}

	/**
	 * The <code>fiveMinuteLightIllumination</code> method constructs 
	 * the fourth row illumination by dividing 5 and lit the light based 
	 * on the quotient from the default i.e, form the off state (OOOO),
	 * else not.
	 * @param hour
	 * @return fiveMinuteIllumination
	 */
	
	public static String fiveMinuteLightIllumination(int minutes){
		StringBuilder fiveMinuteIllumination = new StringBuilder("OOOOOOOOOOO");
		
		// If the minutes should be greater than 0  and the quotient greater than or equal to 4 then lit the light, else not to lit 
		if (minutes > 0 ) {
			int quotient = minutes / BerlinClockTime.CLOCK_HOUR_LAMP_DIVIDEND.getTime();
				if (quotient <= BerlinClockTime.CLOCK_MIN_LAMP_COUNT.getTime()) {
					for (int i = 0, j = 1; i < quotient; i++, j++) {
						// The below if condition used to lit the Red light by dividing 3
						if( (j % 3) == 0 ){
							fiveMinuteIllumination.setCharAt(i, 'R');
						}else {
							fiveMinuteIllumination.setCharAt(i, 'Y');
						}
					}
				}
		}
		return fiveMinuteIllumination.toString();
	}
	
	/**
	 * The <code>hourOrSecondsLightIllumination</code> method constructs 
	 * the third and last row illumination by modulus 5 and lit the light based 
	 * on the remainder from the default for hours & minutes 
	 * i.e, form the off state (OOOO) else not.
	 * @param time
	 * @param state
	 * @return hoursOrSecondsIllumination
	 */
	public static String hourOrMinutesLightIllumination(int time, char state){
		StringBuilder hourOrMinutesLightIllumination  = new StringBuilder("OOOO");
		
		if (time > 0) {
			int remainder = time % BerlinClockTime.CLOCK_HOUR_LAMP_DIVIDEND.getTime();
				if (remainder <= BerlinClockTime.CLOCK_HOUR_LAMP_COUNT.getTime()) {
					for (int i = 0; i < remainder; i++) {
						hourOrMinutesLightIllumination.setCharAt(i, state);
					}
				}
		}
		return hourOrMinutesLightIllumination.toString();
	}
	
	/**
	 * The <code>secondsLightIllumination</code> method constructs 
	 * the first row illumination based on odd or even. If even lit the light, else not.
	 * @param seconds
	 * @return yellowTopLamp
	 */
	public static String secondsLightIllumination(int seconds) {
		StringBuilder yellowTopLamp = new StringBuilder("O");
		int lightStatus = seconds % BerlinClockTime.CLOCK_SEC_LAMP_COUNT.getTime();
			if (lightStatus == 0) {
				yellowTopLamp.setCharAt(0, 'Y');
			}
		return yellowTopLamp.toString();
	}

}
