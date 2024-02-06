package tek.selenium.intro;


import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {

    public static void main(String[] args) {

        //Opening Chrome browser
        ChromeDriver chromeDriver = new ChromeDriver();

        // this method is to navigate to website / link
        chromeDriver.get("https://google.com");

        //Browser Configurations.
        //Chain of methods will  maximize opened browser.
        chromeDriver.manage().window().maximize();
        //this method is return String, and it's tab title of Application
       String tabTitle = chromeDriver.getTitle();

        System.out.println(tabTitle);

        chromeDriver.quit();
    }
}
