package stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class ŚrodaTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
    @Test
    public void testBingSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName= driver.findElement(By.id("last-name"));
        List<WebElement> genderSelect = driver.findElements(By.name("gender"));
        WebElement date= driver.findElement(By.id("dob"));
        WebElement address= driver.findElement(By.id("address"));
        WebElement email= driver.findElement(By.id("email"));
        WebElement password= driver.findElement(By.id("password"));
        WebElement company= driver.findElement(By.id("company"));
        WebElement comment= driver.findElement(By.id("comment"));

        // Wyczyść teskst zapisany w elemencie
        firstName.clear();
        lastName.clear();
        //element3.clear();
        date.clear();
        address.clear();
        email.clear();
        password.clear();
        company.clear();
        comment.clear();
        // Wpisz informacje do wyszukania
        firstName.sendKeys("Kowalski");
        lastName.sendKeys("Kowalski");
        WebElement gender=genderSelect.get(0);
        gender.click();
        date.sendKeys("05/22/2010");
        address.sendKeys("Prosta 51");
        email.sendKeys("karol.kowalski@mailinator.com");
        password.sendKeys("pass123");
        company.sendKeys("Coders Lab");
        comment.sendKeys("To jest mój pierwszy automat\n" +
                "testowy");

        // Prześlij formularz
        firstName.submit();
    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
         driver.quit();
    }
}
