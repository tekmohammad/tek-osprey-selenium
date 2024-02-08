package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextActivity {
    /*
    Navigate to https://retail.tekschool-students.com/selenium/
    Click on Input Link
    and print page title ("Inputs")
     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/");
        Thread.sleep(2000);

//        By inputsLinkLocator = By.linkText("Inputs");
//        WebElement inputLinkElement = driver.findElement(inputsLinkLocator);
//        inputLinkElement.click();

        driver.findElement(By.linkText("Inputs")).click();


        Thread.sleep(2000);
//        By titleLocator = By.id("title");
//        WebElement titleElement = driver.findElement(titleLocator);
//        String titleText = titleElement.getText();

        String titleText = driver.findElement(By.id("title")).getText();
        System.out.println(titleText);

        Thread.sleep(2000);
        driver.quit();
    }
}
