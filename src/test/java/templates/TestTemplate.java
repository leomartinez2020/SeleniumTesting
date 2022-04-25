package templates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public abstract class TestTemplate {
    WebDriver driver;

    public abstract void setup();

    public final void verifyNumberOfShoes() {
        // Define some basic variables
        //driver = new ChromeDriver();
        String baseUrl = "https://www.ebay.com/";
        String expectedBrand = "adidas";
        int expectedMinNumber = 2000;
        int numberOfShoes;

        driver.get(baseUrl);
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("shoes");
        WebElement submitButton = driver.findElement(By.id("gh-btn"));
        submitButton.click();
        driver.findElement(By.cssSelector("[aria-label='adidas']")).click();
        String url = driver.getCurrentUrl();

        // Assert name adidas is in the new url
        Assert.assertTrue(url.contains(expectedBrand));
        // Get complete text with number of shoes
        String textInfo = driver.findElement(By.cssSelector("h1.srp-controls__count-heading")).getText();
        // Extract numbers as text
        String numberOnly = textInfo.replaceAll("[^0-9]", "");
        // Cast numbers to integers
        numberOfShoes = Integer.parseInt(numberOnly);
        // Make final assertion
        Assert.assertTrue(numberOfShoes > expectedMinNumber);
    }

    public final void teardown() {
        // Close chrome
        driver.close();
    }
}
