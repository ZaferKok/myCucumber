package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
       driver.get("https://example.com/login");
    }    
    
    @When("the user enters valid username {string}")
    public void theUserEntersValidUsername(String username) {
       loginPage.usernameBox.sendKeys(username);
    }

    @And("the user enters valid password {string}")
    public void theUserEntersValidPassword(String password) {
       loginPage.passwordBox.sendKeys(password);
    }

    @Then("the user is redirected to the homepage {string}")
    public void theUserIsRedirectedToTheHomepage(String username) {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Welcome {username}";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
}
