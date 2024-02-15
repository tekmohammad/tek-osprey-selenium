package tek.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Activity1WithImplicitlyWait {
    /*
    Login to Retail app with your account.
    Then In Accessories section add First keyboard to Cart
    and Go to Cart and make sure there 1 Item there
    And Delete it Then print the text "Your Shopping Cart is Empty"
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        //Apply Implicitly Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.linkText("Sign in")).click();

        driver.findElement(By.name("email"))
                .sendKeys("mohammad_osprey@tekschool.us");
        driver.findElement(By.name("password"))
                .sendKeys("12345678Ab@");
        driver.findElement(By.id("loginBtn")).click();

        driver.findElement(By.xpath("//img[@alt='Accessories']"))
                .click();

        driver.findElement(By.cssSelector("div.products > div:nth-child(2) > img"))
                .click();

        driver.findElement(By.id("addToCartBtn"))
                .click();
        driver.findElement(By.id("cartBtn")).click();

       String cartItemName = driver.findElement(By.cssSelector("a.cart__item-product-name"))
                .getText();
        System.out.println(cartItemName);

        driver.findElement(By.xpath("//span[@class='cart__item-delete']"))
                .click();

        String cartEmptyText =driver.findElement(By.cssSelector("h1.cart__empty-title"))
                .getText();
        System.out.println(cartEmptyText);

        driver.quit();
    }
}