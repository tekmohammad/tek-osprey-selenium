package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        driver.get("https://google.com");

        //Steps to Find element with Selenium
        //Step 1) Locate the Element using 1 of 8 locators.
        By searchLocator = By.name("q");

        //Step 2) Find the element with Driver and Locator
        WebElement searchElement = driver.findElement(searchLocator);

        //Step 3 Perform Actions to Element.
        searchElement.sendKeys("TekSchool");


    }
}
