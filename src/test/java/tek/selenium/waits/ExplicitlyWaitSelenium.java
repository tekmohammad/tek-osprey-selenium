package tek.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitlyWaitSelenium {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Apply Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        By singInLink = By.linkText("Sign in");
        WebElement signInElement = wait.until(
                ExpectedConditions.elementToBeClickable(singInLink));
        signInElement.click();

        By loginTitleLocator = By.className("login__title");
        WebElement loginTitleElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(loginTitleLocator));
        String loginTitleText = loginTitleElement.getText();
        System.out.println(loginTitleText);

        By emailLocator = By.name("email");
       WebElement emailElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(emailLocator));
        emailElement.sendKeys("wrongEmail@gmail.com");

        By passwordLocator = By.name("password");
        WebElement passwordElement =wait.until(
                ExpectedConditions.presenceOfElementLocated(passwordLocator));
        passwordElement.sendKeys("123456789");


        By loginButton = By.id("loginBtn");
        WebElement loginButtonElement = wait.until(
                ExpectedConditions.elementToBeClickable(loginButton));
        loginButtonElement.click();



      String text= wait.until(
              ExpectedConditions.presenceOfElementLocated(By.className("error")))
                      .getText();
        System.out.println(text);
        driver.quit();
    }

}
