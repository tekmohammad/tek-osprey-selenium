package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7XpathAndCss {
    /*
    In Retail App Click on Computer section, then click
    on First Keyboard and print that title.
     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//img[@alt='Accessories']"))
                .click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div.products > div:nth-child(2) > img"))
                .click();
        Thread.sleep(1000);
       String productTitle = driver.findElement(By.cssSelector("h1.product__name"))
               .getText();
        System.out.println(productTitle);

        driver.quit();
    }
}
