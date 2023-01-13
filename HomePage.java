package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
    super(driver);
    }

    By productsTitleBy = By.xpath("//*[@id='header_container']/div[2]/span");
    By BrojItemaBy = By.className("inventory_item");
    By MenyBy = By.id("react-burger-menu-btn");
    By LogoutBy = By.id("logout_sidebar_link");
    By TShirtBy = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By JacketBy = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By ShoppingCartBadgeBy = By.className("shopping_cart_badge");
    By ShoppingCartLinkBy = By.className("shopping_cart_link");

    public HomePage verifySuccesfulLogin(String expectedText){
        String actualText = readText(productsTitleBy);
        assertStringEquals(actualText, expectedText);
        return this;
    }

    public HomePage numberOfProducts(int expectedNumberOfProducts){
        int actualNumberOfProducts = brojacItema(BrojItemaBy);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }

    public HomePage clickMeny(){
        click(MenyBy);
        return this;
    }

    public HomePage logout(){
        click(LogoutBy);
        return this;        
        
    }

    

    public HomePage verifyProductsAddedToCart(){
        click(TShirtBy);
        click(JacketBy);
        waitVisability(ShoppingCartBadgeBy);
        return this;
    }

    public HomePage shoppingCart(){
        click(ShoppingCartLinkBy);
        return this;
    }
}
