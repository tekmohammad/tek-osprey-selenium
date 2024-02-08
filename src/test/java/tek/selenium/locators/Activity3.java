package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(2000);

        By searchInputLocator = By.id("searchInput");
        WebElement searchInputElement =driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("TV");

        Thread.sleep(2000);

        By searchBtnLocator = By.id("searchBtn");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
