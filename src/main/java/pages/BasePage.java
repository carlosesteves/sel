package pages;

import webdriver.Browser;
import webdriver.Browser.BrowserName;
/**
 * Created by carlosesteves on 09/09/15.
 */
public class BasePage {
    protected Browser browser;

    public BasePage() {}

    public BasePage(Browser browser) {
        this.browser = browser;
    }

    public BasePage(BrowserName name) {
        browser = new Browser(name);
    }

    public void open(String url) {
        browser.open(url);
    }

    public void close() {
        browser.close();
    }

}
