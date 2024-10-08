package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    
    public LoginPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "UserName")
    public WebElement username;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(xpath = "//input[@name='Message']")
    public WebElement Message;
}
