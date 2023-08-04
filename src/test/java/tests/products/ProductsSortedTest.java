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

public class ProductsSortedTest extends BasePageTest {
    @Test
    @DisplayName("Products are sorted from low to high")
    public void verifyProductsAreSorted() {
        driver.get(MAIN_URL);

        SauceMainPage mainPage = new SauceLoginPage(driver)
                .inputUserName("standard_user")
                .inputUserPassword("secret_sauce")
                .loginButtonClick()
                .sortByPriceLowToHigh();

        List<WebElement> webElements = mainPage.showList();
        double currentPrice = 0;
        for (WebElement w : webElements) {
            double price = Double.parseDouble(w.getText().substring(1));
            Assertions.assertTrue(price >= currentPrice);
            currentPrice = price;

        }

    }
}
