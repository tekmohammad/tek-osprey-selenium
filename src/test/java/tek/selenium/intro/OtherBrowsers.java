package tek.selenium.intro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OtherBrowsers {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //Using firefox.
        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get("https://google.com");


        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");

//        SafariDriver safariDriver = new SafariDriver();
//        safariDriver.get("https://google.com");
    }
}
