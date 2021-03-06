



import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import com.ubs.opsit.interviews.*;
import com.ubs.opsit.interviews.exceptions.BusinessException;
import com.ubs.opsit.interviews.impl.BerlinTimeConverterImpl;



public class BerlinClockTest {
	
   private BerlinTimeConverter berlinClock;
    @Before
    public void setUp() {
        berlinClock = new BerlinTimeConverterImpl() ;
    }
 
    @Test
    public void testMinValidBerlinClock() {
    	try {
    		berlinClock.convertTime("00:00:00");
        } catch (BusinessException e) {}
    }

    @Test
    public void testMaxValidBerlinClock() {
    	try {
    		berlinClock.convertTime("23:59:59");
        } catch (BusinessException e) {}
    }

    @Test
    public void testPrintClock() {
    	String actual = "";
    	try {
    		 actual = berlinClock.convertTime("12:30:30");
        } catch (BusinessException e) {}
    	
      
        String expected = "Y\n"
        		+ "RROO\n"
        		+ "RROO\n"
        		+ "YYRYYROOOOO\n"
        		+ "OOOO";

        assertEquals(expected, actual);
    }

    @Test
    public void testUpperInvalidHours() {
    	try {
    		berlinClock.convertTime("24:00:00");
        } catch (BusinessException e) {}
    }

    @Test
    public void testUpperInvalidMinutes() {
    	try {
    		berlinClock.convertTime("00:60:00");
        } catch (BusinessException e) {}
    }

    @Test
    public void testUpperInvalidSeconds() {
    	try {
    		berlinClock.convertTime("00:00:60");
        } catch (BusinessException e) {}
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLowerInvalidHours() {
    	try {
    		berlinClock.convertTime("-01:00:00");
        } catch (BusinessException e) {}
    }

     @Test(expected = IllegalArgumentException.class)
    public void testLowerInvalidMinutes() {
    	try {
    		berlinClock.convertTime("00:-01:00");
        } catch (BusinessException e) {}
    }

     @Test(expected = IllegalArgumentException.class)
    public void testLowerInvalidSeconds() {
    	try {
    		berlinClock.convertTime("00:00:-01");
        } catch (BusinessException e) {}
    }

    @Test
    public void testInvalidString() {
    	try {
    		berlinClock.convertTime("00:00");
        } catch (BusinessException e) {
	  assertEquals("Please pass the Time, Hours, and Seconds inputs properly ", e.getMessage());
	}
    }

    @Test(expected = NullPointerException.class)
    public void testNullString() {
    	try {
    		berlinClock.convertTime(null);
        } catch (BusinessException e) {}
    }

    @Test
    public void testEmptyString() {
    	try {
    		berlinClock.convertTime("");
        } catch (BusinessException e) {
	  assertEquals("Please check the input time whether it has character in it", e.getMessage());
	}
    }

    @After
    public void cleanUp() {
         berlinClock = null;
    }

}
