package tek.selenium.selects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleSelectDropDrown {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       By languageLocator = By.name("language");
       WebElement languageDDElement = wait.until(
               ExpectedConditions.visibilityOfElementLocated(languageLocator));

       Thread.sleep(2000);
        Select languageSelect = new Select(languageDDElement);
//        languageSelect.selectByVisibleText("Java");
//        languageSelect.selectByValue("cSharp");
        languageSelect.selectByIndex(4);


    }
}
