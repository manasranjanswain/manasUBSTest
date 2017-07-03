package com.ubs.opsit.interviews.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.interviews.BerlinTimeConverter;
import com.ubs.opsit.interviews.exceptions.BusinessException;
import com.ubs.opsit.interviews.helper.BerlinTimeParser;
import com.ubs.opsit.interviews.helper.ValidateTime;
import com.ubs.opsit.interviews.model.Clock;

public class BerlinTimeConverterImpl implements BerlinTimeConverter{
	
	private static final Logger LOG = LoggerFactory.getLogger(BerlinTimeConverterImpl.class);

		@Override
	    public String convertTime(String aTime) throws BusinessException {
	    	LOG.info("Start------>convertTime()");
	    	Clock clock = null;
	    	try {
	    		LOG.info("The Given time is: "+aTime);
	    		String spiltTime [] = aTime.split(":");
				int hour = Integer.valueOf(spiltTime[0]);
				int minutes = Integer.valueOf(spiltTime[1]);
				int seconds = Integer.valueOf(spiltTime[2]);
				
				boolean isValided  = ValidateTime.validateTime(hour, minutes, seconds);
			
				if(isValided){
					LOG.info("The Time validation is success");
					synchronized (this) {
						clock = new Clock(BerlinTimeParser.secondsLightIllumination(seconds)
												, BerlinTimeParser.fiveHourLightIllumination(hour)
												, BerlinTimeParser.hourOrMinutesLightIllumination(hour,'R')
												, BerlinTimeParser.fiveMinuteLightIllumination(minutes)
												, BerlinTimeParser.hourOrMinutesLightIllumination(minutes,'Y'));
						LOG.info("After convert into Berlin Clock time is: "+System.lineSeparator()+clock.toString());
					}
				}else{
					LOG.info("The Time is not valid format, Please cross verify in the .story file.");
					throw new BusinessException("The Time is not valid format, Please  verify time in the .story file.");
				}
				
			} catch (NumberFormatException e) {
				LOG.info("Characters cannot parsed into Int value, Please  verify the Input time in .story file.");
				throw new BusinessException("Please check the input time whether it has character in it", e);
			} catch (ArrayIndexOutOfBoundsException ae){
				LOG.info("Time, Hours, and Seconds are not passed in the .story file, Please pass those three input in proper format");
				throw new BusinessException("Please pass the Time, Hours, and Seconds inputs properly ", ae);
			}
	    	LOG.info("End ---> convertTime()");
	    	return clock != null ? clock.toString() : "";
	    }
		
	

}
