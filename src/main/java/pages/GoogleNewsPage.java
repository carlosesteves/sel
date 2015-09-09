package pages;

import org.openqa.selenium.By;

import java.util.stream.Stream;

import static webdriver.Browser.BrowserName.FIREFOX;


/**
 * Created by carlosesteves on 09/09/15.
 */
public class GoogleNewsPage extends BasePage {
    private static String PAGE_URL = "http://news.google.com";

    // Selectors
    private static By S_HEADLINE = By.cssSelector("h2 span.titletext");

    public GoogleNewsPage() {
        super(FIREFOX);
    }

    public void open() {
        open(PAGE_URL);
    }

    public Stream<String> getHeadlines() {
        return browser.findElementsBy(S_HEADLINE)
                .filter(e -> e.getText() != null)
                .map(e -> e.getText());
    }

    public void printHeadlines() {
        getHeadlines().forEach((headline) -> System.out.println("News headline: " + headline));
    }
}
