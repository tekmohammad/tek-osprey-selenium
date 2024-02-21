package tek.selenium.waits;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecapForWaits {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/radio");

        //Apply Implicitly wait for selenium
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Explicitly Wait.
        // Step 1) Create an Object of WebDriverWait.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        By radioButtonLink = By.linkText("Radio Button");
        WebElement radioButtonElement = wait.until(
                ExpectedConditions.elementToBeClickable(radioButtonLink));
        radioButtonElement.click();


        By cssRadio = By.id("css");
        wait.until(ExpectedConditions.elementToBeClickable(cssRadio))
                .click();



    }

}
