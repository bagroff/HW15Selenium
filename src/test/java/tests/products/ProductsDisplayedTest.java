package tests.products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.sauce_login.SauceLoginPage;
import pages.sauce_main.SauceMainPage;
import tests.base.BasePageTest;

import java.util.List;

import static constants.Constant.Urls.MAIN_URL;

public class ProductsDisplayedTest extends BasePageTest {
    @Test
    @DisplayName("Products are displayed")
    public void verifyProductsAreDisplayed() {
        driver.get(MAIN_URL);

        new SauceLoginPage(driver)
                .inputUserName("standard_user")
                .inputUserPassword("secret_sauce")
                .loginButtonClick();

        SauceMainPage mainPage = new SauceMainPage(driver);
        List<WebElement> webElements = mainPage.showList();

        for (WebElement w : webElements) {
            Assertions.assertTrue(w.isDisplayed());
        }
    }
}
