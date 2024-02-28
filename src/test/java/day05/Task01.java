package day05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.dnd.InvalidDnDOperationException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class Task01 {


    /*
    Go to URL: https://demoqa.com/radio-button
Verify whether all 3 options given to the question can be selected.
When each option is selected, print the following texts on the console.
     */
@Test
    public void task1() throws InvalidDriverException{
    WebDriver driver = new ChromeDriver();
    driver.manage().window();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demoqa.com/radio-button");

     driver.findElement(By.id("yesRadio")).click();
    JavascriptException js =(JavascriptExecutor) driver.getDriver();
    ((JavascriptExecutor) js).executeScript("argements[0].click()");

    driver.findElement(By.id("noRadio")).click();
    JavascriptException js1 =(JavascriptExecutor) driver.getDriver();
    ((JavascriptExecutor) js1).executeScript("argements[0].click()");

    driver.findElement(By.id("impressiveRadio")).click();
    JavascriptException js2 =(JavascriptExecutor) driver.getDriver();
    ((JavascriptExecutor) js2).executeScript("argements[0].click()");


}


}
