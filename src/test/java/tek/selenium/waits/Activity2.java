package tek.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity2 {
    /*
    In Retail App Click on Video Games, and then Click on PS5 Console.
    and then print the "PlayStation 5 Console"
    Apply Implicitly and Explicitly Waits
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        //Implicitly wait for global driver wait before Selenium throws exception.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Explicitly Wait.

//        FluentWait<WebDriver> wait = new FluentWait(driver)
//                .pollingEvery(Duration.ofMillis(1000))
//                .withTimeout(Duration.ofSeconds(20))
//                .ignoring(NoSuchElementException.class);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By videoGameSection = By.xpath("//img[@alt='Video Games']");
        wait.until(ExpectedConditions.elementToBeClickable(videoGameSection))
                .click();

        By ps5Console = By.xpath("//img[@alt='PlayStation 5 Console']");
        wait.until(ExpectedConditions.elementToBeClickable(ps5Console))
                .click();

        By productName = By.cssSelector("h1.product__name");
       WebElement productNameElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(productName));

       String productText =productNameElement.getText();
        System.out.println(productText);

        driver.quit();

    }
}
