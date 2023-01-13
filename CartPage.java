package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    By cartProduct1By = By.id("item_1_title_link");
    By cartProduct2By = By.id("item_5_title_link");
    By checkoutButtonBy = By.id("checkout");
    By verifyCheckoutInfoBy = By.id("checkout_info_container");

    public CartPage verifyCheckout() {
        click(checkoutButtonBy);
        readText(verifyCheckoutInfoBy);
        return this;
    }

    
}
