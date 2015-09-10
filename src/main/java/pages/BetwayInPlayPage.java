package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by carlosesteves on 10/09/15.
 */
public class BetwayInPlayPage extends BasePage {
    private static By S_ALL_EVENTS_CONTAINER = By.id("all_events_nav");
    private static By S_EVENT_HEADER = By.cssSelector(".all_events_eventTitle_container .all_events_eventTitle");

    public BetwayInPlayPage(Browser browser) {
        super(browser);

        browser.waitUntilVisible(S_ALL_EVENTS_CONTAINER);
    }

    public List<WebElement> getAllEvents() {
        return browser.findElementsBy(S_EVENT_HEADER);
    }

    public Stream<String> getAllEventsTitles() {
        return getAllEvents()
                .stream()
                .filter(e -> e.getText() != null)
                .map(e -> e.getText());
    }

    public int eventsCount() {
        return getAllEvents().size();
    }


    public void printGames() {
        getAllEventsTitles()
                .forEach((headline) -> System.out.println("Game: " + headline));
    }






}
