package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    /*
    Navigate to Retail App https://retail.tekschool-students.com/
    click on Sign In
    Fill up the Login form with invalid credentials
     and Click on Login and print the error message.
     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("email")).sendKeys("wrong@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12341234");

        driver.findElement(By.id("loginBtn")).click();

        Thread.sleep(1000);

        String errorMessage =driver.findElement(By.className("error")).getText();
        System.out.println(errorMessage);
        driver.quit();
    }
}
