package sel.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import pages.GoogleNewsPage;
import steps.BaseSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;


/**
 * Created by carlosesteves on 09/09/15.
 */
public class GoogleNewsSteps extends BaseSteps {
    private GoogleNewsPage page;

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
        page.printHeadlines();
        assertThat(page.headlinesCount(), greaterThan(0));
    }

}


