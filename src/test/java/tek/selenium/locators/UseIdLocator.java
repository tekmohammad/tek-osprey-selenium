package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseIdLocator {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/inputs");

        By inputLocator = By.id("textInput");
        WebElement element = driver.findElement(inputLocator);
        element.sendKeys("Mohammad");
    }
}
