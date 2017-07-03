package com.ubs.opsit.interviews.model;

import org.apache.commons.lang.text.StrBuilder;

import com.google.common.base.Objects;

public class Clock {

	/**
	 * secondsLight attribute has top yellow lamp of the Berlin clock
	 * represents seconds.
	 */
	private String secondsLight;
	
	/**
	 * fiveHourLight attribute has red lamp of the Berlin clock's second row
	 * and indicates 5 hours each lamp.
	 */
	
	private String fiveHourLight;
	
	/**
	 * oneHourLight attribute has red lamp of the Berlin clock's third row
	 * and indicates 1 hours each lamp.
	 */
	
	private String oneHourLight;
	
	/**
	 * fiveMinuteLight attribute has both red and yellow lamp of the Berlin clock's
	 * fourth row, indicates 1 hour each yellow lamp, and 5 hours each red lamp.
	 */
	
	private String fiveMinuteLight;
	
	/**
	 * oneMinuteLight attribute has the bottom yellow lamp of the Berlin clock
	 * represents one minute.
	 */
	
	private String oneMinuteLight;
	
	public Clock(String secondsLight, String fiveHourLight, String oneHourLight, 
			String fiveMinuteLight,String oneMinuteLight) {
		this.secondsLight = secondsLight;
		this.fiveHourLight = fiveHourLight;
		this.oneHourLight = oneHourLight;
		this.fiveMinuteLight = fiveMinuteLight;
		this.oneMinuteLight = oneMinuteLight;
	}
	
	public String getSecondsLight() {
		return secondsLight;
	}
	public void setSecondsLight(String secondsLight) {
		this.secondsLight = secondsLight;
	}
	
	public String getFiveHourLight() {
		return fiveHourLight;
	}
	
	public void setFiveHourLight(String fiveHourLight) {
		this.fiveHourLight = fiveHourLight;
	}
	
	
	public String getOneHourLight() {
		return oneHourLight;
	}
		
	public void setOneHourLight(String oneHourLight) {
		this.oneHourLight = oneHourLight;
	}
	
	
	public String getFiveMinuteLight() {
		return fiveMinuteLight;
	}
	
	
	public void setFiveMinuteLight(String fiveMinuteLight) {
		this.fiveMinuteLight = fiveMinuteLight;
	}
	
	public String getOneMinuteLight() {
		return oneMinuteLight;
	}
	
	public void setOneMinuteLight(String oneMinuteLight) {
		this.oneMinuteLight = oneMinuteLight;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		Clock that = (Clock) obj;
		return  Objects.equal(this.secondsLight, that.secondsLight) &&
				Objects.equal(this.fiveHourLight, that.fiveHourLight) &&
				Objects.equal(this.oneHourLight, that.oneHourLight) &&
				Objects.equal(this.fiveMinuteLight, that.fiveMinuteLight) &&
				Objects.equal(this.oneMinuteLight, that.oneMinuteLight) ;
	}
	
	@Override
	public int hashCode(){
		return Objects.hashCode(secondsLight,fiveHourLight,oneHourLight,fiveMinuteLight,oneMinuteLight);
	}
	
	@Override
	public String toString(){
		return new StrBuilder().appendWithSeparators(new String[]{ secondsLight, fiveHourLight, oneHourLight, 
	    				fiveMinuteLight, oneMinuteLight },System.lineSeparator()).toString();
	}
	
}
