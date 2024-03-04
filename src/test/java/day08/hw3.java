package day08;

import day08.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class hw3 extends TestBase {
    public void test(){
      //  Go to URL: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");
        //Click on the windows - "WindowButton"
        driver.switchTo().frame("windowButton");
        //Click on all the child windows.
        driver.switchTo().defaultContent();
        //Print the text present on all the child windows in the console.
        WebElement tabButton =driver.findElement(By.id("tabButton"));
        WebElement windowButton  =driver.findElement(By.id("windowButton"));
        WebElement messageWindowButton =driver.findElement(By.id("messageWindowButton"));

        tabButton.click();
        windowButton.click();
        messageWindowButton.click();

        //Print the heading of the parent window in the console.
        System.out.println("Heading of the parent window: " + driver.findElement(By.tagName("h1")).getText());

    }
}
