package tek.selenium.selects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Recap {
    //mohammad_osprey@tekschool.us
    //12345678Ab@
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions
                .elementToBeClickable(By.linkText("Sign in")))
                .click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.name("email")))
                .sendKeys("mohammad_osprey@tekschool.us");

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.name("password")))
                .sendKeys("12345678Ab@");
        wait.until(ExpectedConditions
                .elementToBeClickable(By.id("loginBtn")))
                .click();

        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//img[@alt='Video Games']")))
                .click();
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//img[@alt='Xbox Series X']")))
                .click();

        WebElement quantityElement =wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("select.product__select")));

        Select quantitySelect = new Select(quantityElement);
        quantitySelect.selectByVisibleText("5");

        wait.until(ExpectedConditions
                .elementToBeClickable(By.id("addToCartBtn")))
                .click();

        wait.until(ExpectedConditions
                .elementToBeClickable(By.id("cartBtn")))
                .click();

        WebElement cartItemQty = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("cart__item-quantity")));

       String itemQuantity = cartItemQty.getAttribute("value");

        System.out.println(itemQuantity);
        driver.quit();
    }
}
