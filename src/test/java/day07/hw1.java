package day07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw1 {

    static WebDriver driver;


    @BeforeClass
    public static void setUp(){
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }
    @AfterClass
    public static void  tearDown(){
        //driver.quit();
    }
    @Test
    public void test()throws InterruptedException{
  driver.findElement(By.partialLinkText("Click for JS Alert")).click();
        Thread.sleep(1000);
        Alert alert =driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println("alertMessage = " + alertMessage);
        alert.accept();
        driver.findElement(By.partialLinkText("Click for JS Confirm")).click();
        Thread.sleep(1000);
        String alertMessage2 = alert.getText();
        System.out.println("alertMessage = " + alertMessage2);
        alert.accept();
        driver.findElement(By.partialLinkText("Click for JS Prompt")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Textbox")).click();
        alert.accept();

    }
}
