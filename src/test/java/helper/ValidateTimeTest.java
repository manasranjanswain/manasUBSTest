package helper;

import org.junit.Assert;

import com.ubs.opsit.interviews.helper.ValidateTime;

import junit.framework.TestCase;

public class ValidateTimeTest extends TestCase {
	
	/**
	 * The <code>testValidateTime</code> method used to test
	 * given time format
	 * @param hour
	 * @param minutes
	 * @param seconds
	 * @return isValidTime
	 */
	public void testValidateTime(){
		Assert.assertEquals(true, ValidateTime.validateTime(12, 30, 23));
		Assert.assertNotEquals(true, ValidateTime.validateTime(32, 30, 23));
		
	}

}
