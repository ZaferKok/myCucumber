package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TelerikPage;
import utilities.AllPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TestSteps {

    AllPages allPages = new AllPages();
    // Bir projede bir çok sayfa vardır. Sayfaya ait elementler ilgili sayfada depolanır.
    // Allpages class içinde her sayfanın objesi oluşturulur.
    // Bu sayede bir obje oluşturarak bir çok sayfanın objesine ulaşmış oluruz.

    String actualCount;
    String expectedCount = "0";

    @Given("kullanici {string} web sayfasina gider")
    public void kullaniciWebSayfasinaGider(String url) {
        Driver.getDriver().get(url); // Bu Url Configurations.properties dosyasından gelmiyor!!!
    }

    @When("kullanici cookiesi kabul eder")
    public void kullanici_cookiesi_kabul_eder() {
        // allPages.telerikPage.cookiesAcceptButton();
    }

    @And("kullanici Pricing linkine tiklar")
    public void kullaniciPricingLinkineTiklar() {
        allPages.telerikPage.pricing.click();
    }

    @And("kullanici BuyNow butonu ile sepete bir urun ekler")
    public void kullaniciBuyNowButonuIleSepeteBirUrunEkler() {
        allPages.telerikPage.buyNow.click();
    }

    @And("kullanici ana sayfaya geri doner")
    public void kullaniciAnaSayfayaGeriDoner() {
        allPages.telerikPage.goToHomepage.click();
    }

    @And("kullanici sepete uzerindeki mevcut sayiyi alir")
    public void kullaniciSepeteUzerindekiMevcutSayiyiAlir() {
        actualCount = allPages.telerikPage.shoppingCart1.getText();
    }

    @And("kullanici sepete tekrar gider")
    public void kullaniciSepeteTekrarGider() {
        allPages.telerikPage.shoppingCart1.click();
    }

    @And("kullanici sepetteki urunu Delete linki ile siler")
    public void kullaniciSepettekiUrunuDeleteLinkiIleSiler() {
        allPages.telerikPage.deleteItem.click();
    }

    @Then("kullanici sepet simgesi uzerindeki sayinin sifir oldugunu kontrol eder")
    public void kullaniciSepetSimgesiUzerindekiSayininSifirOldugunuKontrolEder() {
        Assert.assertEquals(actualCount, expectedCount);
    }

    @And("kullanici Pricing sayfasina geri doner")
    public void kullaniciPricingSayfasinaGeriDoner() {

    }

    @And("kullanici Buynow butonu ile bir urun daha ekler")
    public void kullaniciBuynowButonuIleBirUrunDahaEkler() {
    }

    @And("kullanici sepetteki urunlerden bir tanesini Delete linki ile siler")
    public void kullaniciSepettekiUrunlerdenBirTanesiniDeleteLinkiIleSiler() {
    }

    @Then("kullanici sepet simgesi uzerindeki sayinin bir eksildigini kontrol eder")
    public void kullaniciSepetSimgesiUzerindekiSayininBirEksildiginiKontrolEder() {
    }
}
