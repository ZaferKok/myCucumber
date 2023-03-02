package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikPage {

    public TelerikPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//  @FindBy () public WebElement cookiesAcceptButton;
    @FindBy(xpath="//a[@class='TK-Menu-Item-Link'][normalize-space()='Pricing']") public WebElement pricing;
    @FindBy(xpath="//th[@class='Complete']//a[@class='Btn Btn--prim4 u-db'][normalize-space()='Buy now']") public WebElement buyNow;
    @FindBy(xpath="//a[@aria-label='Go to Homepage']//*[name()='svg']") public WebElement goToHomepage;
    @FindBy(xpath="//a[@title='Shopping cart']") public WebElement shoppingCart1;
    @FindBy(xpath="//a[@class='e2e-delete-item btn-delete-item ng-star-inserted']") public WebElement deleteItem;

}
