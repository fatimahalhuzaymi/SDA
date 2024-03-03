package day07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Challange3 {

    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
    @Test
    public void test()throws InterruptedException{
        //click on "Click me, to Open an alert after 5 seconds" button
driver.findElement(By.partialLinkText("Click me, to Open an alert after 5 seconds")).click();
Thread.sleep(5);
//click on accept alert
driver.switchTo().alert().accept();
//click on "Change Text to Selenium Webdriver"
        driver.findElement(By.partialLinkText("Change Text to Selenium Webdriver")).click();
        Thread.sleep(10);
//verify "Selenium Webdriver" message is displayed
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Selenium Webdriver message is displayed"));


        // click on "Display button after 10 seconds" button
        driver.findElement(By.partialLinkText("Display button after 10 seconds")).click();
        Thread.sleep(10);
 //verify the button is displayed
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("button is displayed"));
 //click on "Enable button after 10 seconds" button
        driver.findElement(By.partialLinkText("")).click();
        Thread.sleep(10);
 //verify the button is enabled
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("button is enable"));
 //click on "Check Checkbox after 10 seconds" button
        driver.findElement(By.partialLinkText("Check Checkbox after 10 seconds")).click();
 //verify the check box is checked
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("check box is checked"));


            }
        }

