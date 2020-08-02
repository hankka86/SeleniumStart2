package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooggeSteps {
    WebDriver driver;
    @Given("^an open browser with google\\.com$")
    public void anOpenBrowserWithGoogleCom() {
          // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/geckodriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("http://www.google.com");
    }


    @When("^a keyword (.*) is entered in input field$")
    public void aKeywordSeleniumIsEnteredInInputField(String keyword) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("q"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(keyword);
        // Prześlij formularz
        element.submit();}


    @Then("^the first one should contain (.*)$")
    public void theFirstOneShouldContainSelenium(String expectedText) {
        System.out.println(expectedText);}

    @And("^close browser$")
    public void closeBrowser() {
       driver.quit();
    }
}
