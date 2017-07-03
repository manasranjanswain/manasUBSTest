
import static support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.assertj.core.api.Assertions.assertThat;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import com.ubs.opsit.interviews.BerlinTimeConverter;
import com.ubs.opsit.interviews.exceptions.BusinessException;
import com.ubs.opsit.interviews.impl.BerlinTimeConverterImpl;

/**
 * Acceptance test class for Berlin clock
 */
public class BerlinClockStories {

    private BerlinTimeConverter berlinClock = new BerlinTimeConverterImpl() ;
    private String theTime;

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }

    @When("the time is $time")
    public void whenTheTimeIs(String time) {
        theTime = time;
    }

    @Then("the clock should look like $")
    public void thenTheClockShouldLookLike(String theExpectedBerlinClockOutput) throws BusinessException  {
        assertThat(berlinClock.convertTime(theTime)).isEqualTo(theExpectedBerlinClockOutput);
    }
}
