package tests.logout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.sauce_login.SauceLoginPage;
import tests.base.BasePageTest;

import static constants.Constant.Urls.MAIN_URL;

public class LogoutPageTest extends BasePageTest {
    @Test
    @DisplayName("Verify logout")
    public void verifyLogout() {
        driver.get(MAIN_URL);

        new SauceLoginPage(driver)
                .inputUserName("standard_user")
                .inputUserPassword("secret_sauce")
                .loginButtonClick()
                .menuButtonClick();
        Assertions.assertTrue(new SauceLoginPage(driver).logoIsVisible());
    }
}
