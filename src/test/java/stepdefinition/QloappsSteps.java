package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;

public class QloappsSteps {
    WebDriver driver;
    @Given("^an open browser with https://qloapps\\.coderslab\\.pl/pl/logowanie\\?back=my-account$")
    public void anOpenBrowserWithHttpsQloappsCoderslabPlPlLogowanieBackMyAccount() {
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/geckodriver");
        //Uruchom Firefoxa, maksymalizuj okno i przejdz na stronę
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/pl/logowanie?back=my-account");
    }

    @When("^enter email$")
    public void enterEmailTesterTesterCom() {
        //Szukam elementu na podstawie id
        WebElement email=driver.findElement(By.id("email_create"));
        email.clear();
        //Tworzę losowy e-mail
        Random random = new Random();
        int randomInteger =random.nextInt(1000);
        String keyword="tester"+randomInteger+"@tester.com";
        email.sendKeys(keyword);
        email.submit();


    }

    @Then("^click on button SubmitCreate$")
    public void clickOnButtonSubmitCreate() {

    }

    @When("^enter required personal information$")
    public void enterRequiredPersonalInformation() {

    }

    @Then("^click on button submitAccount$")
    public void clickOnButtonSubmitAccount() {
    }
    @And("^close browser$")
    public void closeBrowser() {
       // driver.quit();
    }
}
