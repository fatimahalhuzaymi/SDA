package day03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task03 {

    static WebDriver driver;
    @BeforeClass
    public static void setUP(){
        driver =new ChromeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://id.heroku.com/login");
    }
    @Test
    public void enter(){
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("password")).click();

    }

    /*
    Task 3:
Go to https://id.heroku.com/login.
Enter an e-mail address.
Enter a password.
Click on the Login button.
There was a problem with your login.
If text is visible, print "Registration Failed".
If the text is not visible, print "Registered".
Close all pages.
     */
}
