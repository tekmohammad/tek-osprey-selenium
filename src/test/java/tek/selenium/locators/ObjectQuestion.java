package tek.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectQuestion {
    public static void main(String[] args) {
        ChromeDriver obj1 = new ChromeDriver();
        obj1.get("https://www.bbc.com/");

        ChromeDriver obj2 = new ChromeDriver();
        obj2.get("https://www.bbc.com/sport");

        obj1.quit();

        obj2.quit();
    }
}
