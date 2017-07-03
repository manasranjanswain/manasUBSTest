



import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import com.ubs.opsit.interviews.*;
import com.ubs.opsit.interviews.exceptions.BusinessException;
import com.ubs.opsit.interviews.impl.BerlinTimeConverterImpl;



public class BerlinClockTest {
	
	private BerlinTimeConverter berlinClock = new BerlinTimeConverterImpl() ;
	
	
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
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

    @Test
    public void testLowerInvalidHours() {
    	try {
    		berlinClock.convertTime("-01:00:00");
        } catch (BusinessException e) {}
    }

    @Test
    public void testLowerInvalidMinutes() {
    	try {
    		berlinClock.convertTime("00:-01:00");
        } catch (BusinessException e) {}
    }

    @Test
    public void testLowerInvalidSeconds() {
    	try {
    		berlinClock.convertTime("00:00:-01");
        } catch (BusinessException e) {}
    }

    @Test
    public void testInvalidString() {
    	try {
    		berlinClock.convertTime("00:00");
        } catch (BusinessException e) {}
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
        } catch (BusinessException e) {}
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

}