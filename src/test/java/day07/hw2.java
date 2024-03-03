package day07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw2 {

    static WebDriver driver;


    @BeforeClass
    public static void setUp(){
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/basic_auth");

    }
    @AfterClass
    public static void  tearDown(){
        //driver.quit();
    }

    @Test
    public void test(){
        String username = "admin";
        String password = "admin";

        String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Congratulations! You must have the proper credentials.")) {
            System.out.println("Congratulations message verified successfully.");
        } else {
            System.out.println("Congratulations message not found!");
        }


    }
}
