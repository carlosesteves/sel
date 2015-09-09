package steps;

import org.jbehave.core.annotations.AfterScenario;
import pages.BasePage;

/**
 * Created by carlosesteves on 09/09/15.
 */
public class BaseSteps {
    protected BasePage page;

    public BaseSteps() {

    }

    @AfterScenario
    public void closeBrowser() {
        page.close();
    }
}
