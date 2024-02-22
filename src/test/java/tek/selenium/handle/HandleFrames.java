package tek.selenium.handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrames {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/iframe");
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//This element in Main Page
       String titleText = driver.findElement(By.id("title")).getText();
        System.out.println(titleText);

        //Ask driver to Switch to Frame
        WebElement frameElement = driver.findElement(
                By.xpath("//iframe[@title='Iframe Example']"));
        driver.switchTo().frame(frameElement);

//This Element is Inside a Frame.
        String text2 = driver.findElement(By.xpath("//h1[@class='font-bold text-2xl']"))
                .getText();

        System.out.println(text2);

        //Switch Back to main html page.
        driver.switchTo().defaultContent();
        //This element in Main Page
        String titleText1 = driver.findElement(By.id("title")).getText();
        System.out.println(titleText1);


    }
}
