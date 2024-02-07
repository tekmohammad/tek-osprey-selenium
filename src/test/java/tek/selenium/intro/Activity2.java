package tek.selenium.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    //Open browser maximize it and navigate to https://retail.tekschool-students.com/
    //and get title "React App" make sure title is correct.
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();

        if (title.equals("Tek Retail App")){
            System.out.println("Title is Correct Test Passed");
        }else {
            System.err.println("Title is not correct, Test Failed");
        }
        driver.quit();
    }
}
