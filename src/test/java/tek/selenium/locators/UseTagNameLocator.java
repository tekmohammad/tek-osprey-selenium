package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UseTagNameLocator {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        Thread.sleep(2000);

        //Looking for all <a></a> in HTML which Links
//        By linkLocator = By.tagName("a");
//        List<WebElement> linkElements = driver.findElements(linkLocator);

        //Short way
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

        System.out.println(linkElements.size());

        for(WebElement element : linkElements) {
          String text =  element.getText();
            System.out.println(text);
        }
        driver.quit();
    }
}
