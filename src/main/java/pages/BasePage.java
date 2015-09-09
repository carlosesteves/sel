package pages;

import webdriver.Browser;
import webdriver.Browser.BrowserName;
/**
 * Created by carlosesteves on 09/09/15.
 */
public class BasePage {
    private Browser browser;

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
