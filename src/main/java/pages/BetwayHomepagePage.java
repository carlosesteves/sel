package pages;

import org.openqa.selenium.By;

import static webdriver.Browser.BrowserName.FIREFOX;


/**
 * Created by carlosesteves on 09/09/15.
 */
public class BetwayHomepagePage extends BasePage {
    private static String PAGE_URL = "https://sports.betway.com/";

    // Selectors
    private static By S_INPLAY_BUTTON = By.id("inplaylinkbutton");

    public BetwayHomepagePage() {
        super(FIREFOX);
    }

    public void open() {
        open(PAGE_URL);
    }

    public BetwayInPlayPage goToInPlay() {
        browser.click(S_INPLAY_BUTTON);
        return new BetwayInPlayPage(browser);
    }

}
