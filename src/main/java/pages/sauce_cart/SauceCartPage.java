package pages.sauce_cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;

public class SauceCartPage extends BasePage {
    public SauceCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    private WebElement productCartList;

    public boolean cartList() {
        return productCartList.isDisplayed();
    }
}
