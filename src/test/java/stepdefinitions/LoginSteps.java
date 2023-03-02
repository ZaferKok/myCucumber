package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @When("kullanici adi girilir {string}")
    public void kullaniciAdiGirilir(String kullaniciAdi) {
       // kullaniciBox.sendKeys(kullaniciAdi);

    }

    @And("kulllanici sifresi girilir {string}")
    public void kulllaniciSifresiGirilir(String password) {
       // passwordBox.sendKeys(password);
    }

    @Then("login buton tiklanir")
    public void loginButonTiklanir() {
    }
}
