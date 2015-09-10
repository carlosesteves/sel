package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by carlosesteves on 07/09/15.
 */


public class Browser {
    public enum BrowserName {
        FIREFOX
// TODO: Implement browser support
//        , CHROME, IE, SAFARI
    }

    private WebDriver webDriver;

    public Browser(BrowserName type) {
        this.webDriver = setBrowserType(type);
    }

    public WebDriver setBrowserType(BrowserName type) {
        switch (type) {
            case FIREFOX: return setFirefoxDriver();

// TODO: Implement browser support
//            case CHROME: this.webDriver = new ChromeDriver(); break;

            default:
                return setFirefoxDriver();
        }
    }

    public WebDriver setFirefoxDriver() {
        FirefoxProfile profile = new FirefoxProfile() {{
            setPreference("browser.cache.disk.enable", false);
            setPreference("browser.cache.memory.enable", false);
            setPreference("browser.cache.offline.enable", false);
            setPreference("network.http.use-cache", false);
        }};

        return new FirefoxDriver(profile) {{
            manage().deleteAllCookies();
        }};
    }

    public void open(String url) {
        webDriver.get(url);
    }

    public void close() {
        webDriver.close();
    }


    public List<WebElement> findElementsBy(By by) {
        return webDriver.findElements(by);
    }

    public void click(By by) {
        webDriver.findElement(by).click();
    }

    public void waitUntilVisible(By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(by));
    }
}
