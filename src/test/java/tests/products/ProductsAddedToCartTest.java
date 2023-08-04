package tests.products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.sauce_cart.SauceCartPage;
import pages.sauce_login.SauceLoginPage;
import tests.base.BasePageTest;

import static constants.Constant.Urls.MAIN_URL;

public class ProductsAddedToCartTest extends BasePageTest {
    @Test
    @DisplayName("Products added to cart")
    public void verifyAddedToCart() {
        driver.get(MAIN_URL);

        new SauceLoginPage(driver)
                .inputUserName("standard_user")
                .inputUserPassword("secret_sauce")
                .loginButtonClick()
                .sortByPriceLowToHigh()
                .addToCart()
                .cartButtonClick();
        Assertions.assertTrue(new SauceCartPage(driver).cartList());

    }
}
