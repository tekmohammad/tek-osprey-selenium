package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8 {
    /*
    In Retail App Click on Sign In Button
    Then Click on Create new Account
    Fill Up the form
    Click on sign up
    Then in your profile
    Print the Name and Email Address.
     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(1000);

        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Create New Account")).click();

        driver.findElement(By.name("name")).sendKeys("Mohammad");
        driver.findElement(By.name("email")).sendKeys("dummy_email2@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456Ab@");
        driver.findElement(By.name("confirmPassword")).sendKeys("123456Ab@");

        driver.findElement(By.id("signupBtn")).click();
        Thread.sleep(2000);
        String nameText =driver.findElement(
                By.xpath("//h1[@class='account__information-username']"))
                .getText();
        System.out.println(nameText);

        String emailText = driver.findElement(By.cssSelector("h1.account__information-email"))
                .getText();

        System.out.println(emailText);
        driver.quit();
    }
}
