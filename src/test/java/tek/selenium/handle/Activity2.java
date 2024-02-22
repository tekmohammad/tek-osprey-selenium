package tek.selenium.handle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity2 {
    /*
    Login to Retail app with your Credentials
    Then navigate to Account and update phone number
    Click update and make toast is displayed.
    your output should be true.

    //mohammad_osprey@tekschool.us
    //12345678Ab@
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions
                .elementToBeClickable(By.linkText("Sign in")))
                .click();
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.name("email")))
                .sendKeys("mohammad_osprey@tekschool.us");
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.name("password")))
                .sendKeys("12345678Ab@");
        wait.until(ExpectedConditions
                .elementToBeClickable(By.id("loginBtn")))
                .click();

        wait.until(ExpectedConditions
                .elementToBeClickable(By.linkText("Account")))
                .click();

        By phoneNumberLocator = By.name("phoneNumber");

        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberLocator))
                .clear();

        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberLocator))
                .sendKeys("2123211234");

        wait.until(ExpectedConditions
                .elementToBeClickable(By.id("personalUpdateBtn")))
                .click();

        boolean toastDisplayed = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//div[@class='Toastify']/div")))
                .isDisplayed();
        System.out.println(toastDisplayed);

        driver.quit();

    }
}
