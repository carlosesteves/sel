package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
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

    public List<WebElement> getHeadlines() {
        return browser.findElementsBy(S_HEADLINE);
    }

    public Stream<String> getHeadlinesTitles() {
        return  getHeadlines()
                .stream()
                .filter(e -> e.getText() != null)
                .map(e -> e.getText());
    }

    public int headlinesCount() {
        return getHeadlines().size();
    }

    public void printHeadlines() {
        getHeadlinesTitles().forEach((headline) -> System.out.println("News headline: " + headline));
    }
}
