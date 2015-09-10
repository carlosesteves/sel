package sel.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pages.BetwayHomepagePage;
import pages.BetwayInPlayPage;
import steps.BaseSteps;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;


/**
 * Created by carlosesteves on 10/09/15.
 */
public class BetwayLiveGamesSteps extends BaseSteps {
    private BetwayHomepagePage homePage;
    private BetwayInPlayPage inPlayPage;

    @Given("I open the betway website")
    public void givenIOpenTheBetwayWebsite() {
        homePage = new BetwayHomepagePage() {{
            open();
        }};
    }

    @When("I go to live-betting")
    public void whenIGoToLivebetting() {
        inPlayPage = homePage.goToInPlay();
    }

    @Then("I see the live games displayed")
    public void thenISeeTheLiveGamesDisplayed() {
        Stream<String> allEvents = inPlayPage.getAllEventsTitles();
        inPlayPage.printGames();
        assertThat(inPlayPage.eventsCount(), greaterThan(0));
    }

}
