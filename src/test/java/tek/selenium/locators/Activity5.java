package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity5 {
    /*
   navigate to  https://retail.tekschool-students.com/selenium
   Print All the links Text and count of them
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium");

        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("Count of Links " + links.size());

        for(WebElement element : links) {
            System.out.println(element.getText());
        }

        driver.quit();
    }
}
