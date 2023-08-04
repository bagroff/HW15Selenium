package pages.sauce_main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;

import java.util.List;

public class SauceMainPage extends BasePage {
    public SauceMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<WebElement> productList;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    private WebElement mainProductsName;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartIcon;

    @FindBy(xpath = "//*[@id=\"menu_button_container\"]/div/div[1]/div")
    private WebElement menuButton;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")
    private WebElement sortButton;

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    private WebElement addButton;

    public boolean nameOfProductsMainPage() {
        return mainProductsName.isDisplayed();
    }

    public List<WebElement> showList() {
        return productList;
    }

    public SauceMainPage menuButtonClick() {
        menuButton.click();
        WebElement logout = waitElementIsVisible(driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")));
        logout.click();
        return this;
    }

    public SauceMainPage sortByPriceLowToHigh() {
        sortButton.click();
        WebElement sortLowToHigh = waitElementIsVisible(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")));
        sortLowToHigh.click();
        return this;
    }

    public SauceMainPage cartButtonClick() {
        cartIcon.click();
        return this;
    }

    public SauceMainPage addToCart() {
        addButton.click();
        addButton.click();
        return this;
    }
}
