package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    /*
    Navigate to https://retail.tekschool-students.com/selenium/inputs
    and fill up form (except range)
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/inputs");

       By textLocator = By.name("text");
       WebElement textElement =driver.findElement(textLocator);
       textElement.sendKeys("Mohammad");

      By emailLocator = By.name("email");
      WebElement emailElement= driver.findElement(emailLocator);
      emailElement.sendKeys("mohammad@tekschool.us");

      By passwordLocator = By.name("password");
      WebElement passwordElement = driver.findElement(passwordLocator);
      passwordElement.sendKeys("12341234");

      By dateLocator = By.name("date");
      WebElement dateElement = driver.findElement(dateLocator);
      dateElement.sendKeys("02/06/2024");

      By numberLocator = By.name("number");
      WebElement numberElement = driver.findElement(numberLocator);
      numberElement.sendKeys("123456");

      //driver.quit();
    }
}
