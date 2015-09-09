package sel.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import pages.GoogleNewsPage;
import steps.BaseSteps;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by carlosesteves on 09/09/15.
 */
public class GoogleNewsSteps extends BaseSteps {
    GoogleNewsPage page;

    public GoogleNewsSteps() {
        super();
    }

    @Given("I open the google news website")
    public void givenIOpenTheGoogleNewsWebsite() {
        page = new GoogleNewsPage() {{
            open();
        }};
    }

    @Then("all the headlines are displayed on the page")
    public void thenAllTheHeadlinesAreDisplayedOnThePage() {
        Stream<String> headlines = page.getHeadlines();
        page.printHeadlines();
        assertThat(headlines, notNullValue());
    }

    @AfterScenario
    public void closeBrowser() {
        page.close();
    }
}


