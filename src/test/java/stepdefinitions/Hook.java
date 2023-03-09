package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.AllPages;
import utilities.Driver;

public class Hook {

    static int stepCount;

//    @Before
//    public void setup() {
//        Driver.getDriver();
//    }
//
//    @After
//    public void teardown(Scenario scenario) {
//
//        byte[] picture;
//        if (scenario.isFailed()) { // Burada eğer bir testimiz fail ederse Screenshot alabiliyoruz.
//            picture = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(picture, "image/png", "failed" + scenario.getName());
//        }
//        else { // Burada eğer testimiz fail etmese bile Screenshot alabiliyoruz. Onun için aşağıdaki else kodu içeriğinin yorum olarak kalmasında fayda var.
//            picture = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(picture, "image/png", "passed" + scenario.getName());
//        }
//        Driver.closeDriver();
//    }
//
//    @AfterStep
//    public void makeSlowRunning() throws InterruptedException {
//        Driver.wait(1);
//        this.stepCount = stepCount + 1;
//        System.out.println((stepCount) + ". STEP");
//    }
}
