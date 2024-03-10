package day11;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import day08.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class Homework3 extends TestBase {

    @Test
    public void test() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        CV(driver);
        verify("C:\\Users\\hp-pc\\Desktop\\fileT2");


    }

    public void CV(WebDriver driver) throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));


        //Login page valid credentials.
        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();


        //Click PIM on the left side bar
        WebElement pim = driver.findElement(By.linkText("PIM"));
        w.until(ExpectedConditions.elementToBeClickable(pim));
        pim.click();

        //Click Configuration and select Data Import
        WebElement Configuration = driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-item']"));
        w.until(ExpectedConditions.visibilityOf(Configuration));
        Configuration.click();

        WebElement dataimport = driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-link']"));
        dataimport.click();

        //Download sample CSV file.
        WebElement Download = driver.findElement(By.name("Download"));
        Download.click();
        Thread.sleep(1000);
    }
        //Verify if the file downloaded successfully.
        public void verify(String cvfile){
        String file = "cvfile";
        String download = "Download";
        String userhome = System.getProperty("user.home");
        String separator = System.getProperty("file.separator");

        String path = userhome+separator+download+separator+file;
            System.out.println("path = " + path);
            boolean isExists = Files.exists(Path.of(path));
            System.out.println("isExists = " + isExists);

        }

    }
