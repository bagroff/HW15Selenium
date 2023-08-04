package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pages.sauce_main.SauceMainPage;

import static common.Config.HOLD_BROWSER_OPEN;

public class BasePageTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected SauceMainPage sauceMainPage = new SauceMainPage(driver);

    @BeforeEach
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }

    @AfterEach
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
