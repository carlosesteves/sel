package steps;

import org.jbehave.core.annotations.AfterScenario;
import webdriver.Browser;

/**
 * Created by carlosesteves on 09/09/15.
 */
public class BaseSteps {

    public BaseSteps() {
    }

    @AfterScenario
    public void closeBrowser() {
        Browser.webDriver.close();
    }
}
