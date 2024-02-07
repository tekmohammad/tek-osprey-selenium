package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocatorPractice {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("something@gmail.com");

        By passLocator = By.name("pass");
        WebElement passElement = driver.findElement(passLocator);
        passElement.sendKeys("SomePassword");

        By loginLocator = By.name("login");
        WebElement loginElement = driver.findElement(loginLocator);
        loginElement.click();
    }
}
