package pages.sauce_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;
import pages.sauce_main.SauceMainPage;

public class SauceLoginPage extends BasePage {
    public SauceLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement userNameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement userPasswordField;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    private WebElement loginButton;

    @FindBy(css = ".login_logo")
    private WebElement logoType;

    public SauceLoginPage inputUserName(String userName) {
        userNameField.sendKeys(userName);
        return this;
    }

    public SauceLoginPage inputUserPassword(String userPassword) {
        userPasswordField.sendKeys(userPassword);
        return this;
    }

    public SauceMainPage loginButtonClick() {
        loginButton.click();
        return new SauceMainPage(driver);
    }

    public boolean logoIsVisible() {
        return logoType.isDisplayed();
    }
}
