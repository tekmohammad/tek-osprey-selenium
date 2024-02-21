package tek.selenium.selects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity1 {
    /*
    from https://retail.tekschool-students.com/selenium/dropdown
    Select your country drop down we select United States.
     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By countryLocator = By.name("country");
        WebElement countryElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(countryLocator));

        Thread.sleep(2000);
        Select countrySelect = new Select(countryElement);
        //countrySelect.selectByVisibleText("United States");
        //Select first Value in Drop Down
        countrySelect.selectByValue("India");
        Thread.sleep(2000);
        //Select Last Value in Drop Down
         List<WebElement> options =  countrySelect.getOptions();
         countrySelect.selectByIndex(options.size() - 1);

         for(WebElement option : options) {
            String text = option.getText();
             System.out.println(text);
         }

        Thread.sleep(2000);
        driver.quit();
    }
}
