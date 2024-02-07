package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    /*
    Navigate to https://retail.tekschool-students.com/
    Click on Sign in
    Enter username: wrong@gmail.com
    enter password: 12341234
    Click on Login
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLinkLocator = By.id("signinLink");
        WebElement singInLinkElement = driver.findElement(signInLinkLocator);
        singInLinkElement.click();

        By emailInputLocator = By.id("email");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("wrong@gmail.com");

        By passwordInputLocator = By.id("password");
        WebElement passwordInputElement = driver.findElement(passwordInputLocator);
        passwordInputElement.sendKeys("12341234");

        By loginBtnLocator = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(loginBtnLocator);
        loginBtnElement.click();
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);
        String errorText = errorElement.getText();

        System.out.println(errorText);

        driver.quit();
    }
}
