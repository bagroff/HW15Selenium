package tests.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.sauce_login.SauceLoginPage;
import pages.sauce_main.SauceMainPage;
import tests.base.BasePageTest;

import static constants.Constant.Urls.MAIN_URL;

public class LoginPageTest extends BasePageTest {
    @Test
    @DisplayName("Verify Login")
    public void verifyLogin() {
        driver.get(MAIN_URL);

        SauceMainPage mainPage = new SauceLoginPage(driver)
                .inputUserName("standard_user")
                .inputUserPassword("secret_sauce")
                .loginButtonClick();
        Assertions.assertTrue(mainPage.nameOfProductsMainPage());
    }
}
