package assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleLogo() {
        driver.get("https://www.google.com/");
        WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
        Assert.assertTrue(googleLogo.isDisplayed(), "Google logo is not present.");
    }

    @Test
    public void testSearchTextBox() {
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        Assert.assertTrue(searchBox.isDisplayed(), "Search text box is not present.");
    }

    @Test
    public void testButtons() {
        driver.get("https://www.google.com/");
        WebElement googleSearchButton = driver.findElement(By.name("btnK"));
        WebElement feelingLuckyButton = driver.findElement(By.name("btnI"));

        Assert.assertEquals(googleSearchButton.getAttribute("value"), "Google Search",
                "Google Search button text is incorrect.");
        Assert.assertEquals(feelingLuckyButton.getAttribute("value"), "I'm Feeling Lucky",
                "I'm Feeling Lucky button text is incorrect.");
    }
    
    @AfterClass
    public void close(){
    	driver.quit();
    	
    }
}
