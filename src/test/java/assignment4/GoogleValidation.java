package assignment4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleValidation {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().frame("//*[@id=\\\"CXQnmb\"]/iframe");
//        driver.findElement(By.xpath("//*[@id=\"W0wltc")).click();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("W3Schools");
        searchBox.submit();

        // Wait for some time to allow search results to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement firstLink = driver.findElement(By.xpath("//h3[text()='W3Schools Online Web Tutorials']"));
        firstLink.click();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.w3schools.com/";

        Assert.assertEquals(actualUrl, expectedUrl, "Navigated to incorrect URL");
    }
    @AfterClass
    public void close(){
    	driver.quit();
    	
    }
}

