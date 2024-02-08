package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsePartialLinkText {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("your 2024 media diet")).click();

        Thread.sleep(3000);


    }
}
