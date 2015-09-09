package pages;

import static webdriver.Browser.BrowserName.FIREFOX;


/**
 * Created by carlosesteves on 09/09/15.
 */
public class GoogleNewsPage extends BasePage {
    private static String PAGE_URL = "http://news.google.com";

    public GoogleNewsPage() {
        super(FIREFOX);
    }

    public void open() {
        this.open(PAGE_URL);
    }
}
