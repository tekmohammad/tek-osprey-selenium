package tek.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingExplicitWaitExample {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        //Applying Implicitly Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        By networkingLocator = By.xpath("//img[@alt='Networking']");
        wait.until(ExpectedConditions.elementToBeClickable(networkingLocator))
                .click();

        By firstProduct = By.cssSelector("div.products > div:nth-child(1) > img");
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct))
                .click();

        By productName = By.cssSelector("h1.product__name");
        WebElement productNameElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(productName));

        String productText = productNameElement.getText();
        System.out.println(productText);
        driver.quit();
    }

}
