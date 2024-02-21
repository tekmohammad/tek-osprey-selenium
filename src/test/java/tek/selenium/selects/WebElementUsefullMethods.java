package tek.selenium.selects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementUsefullMethods {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(By.linkText("Sign in")).click();

         WebElement loginBtnElement = driver.findElement(By.id("loginBtn"));
        //isEnabled() will return true if the element is enabled
        //and false if the element id disabled.

        boolean isEnabled = loginBtnElement.isEnabled();
        System.out.println(isEnabled);

        driver.findElement(By.name("email")).sendKeys("some@gmail.com");
        driver.findElement(By.name("password")).sendKeys("password");

       boolean isLoginEnabled = driver.findElement(By.id("loginBtn")).isEnabled();
        System.out.println(isLoginEnabled);

        //isDisplayed() will return true if the element is visible and false if
        //element is not visible.
        boolean isDisplayed =driver.findElement(By.id("loginBtn")).isDisplayed();
        System.out.println("Button Displayed " + isDisplayed);

    }
}
