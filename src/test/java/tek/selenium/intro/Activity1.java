package tek.selenium.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.get("https://google.com");
        //Quit is method to close entire browser
       // driver.quit();

        //Close is the method to close current tab
        driver.close();
    }

}
