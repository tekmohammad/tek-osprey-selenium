package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {
    /*
    In Retail App Find Shop By Category with xpath
    and Print that in console.
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By titleLocator = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/h1");
        String titleText = driver.findElement(titleLocator).getText();
        System.out.println(titleText);

        driver.quit();
    }
}
