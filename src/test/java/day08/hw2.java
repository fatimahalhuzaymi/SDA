package day08;

import day08.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class hw2 extends TestBase {

    @Test
    public void test(){
        //Go to URL: https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");
        //Verify the text: “Opening a new window”
        WebElement open = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(open.getText().contains("Opening a new window"));
        //Verify the title of the page is “The Internet”
        WebElement title = driver.findElement(By.tagName("title"));
        Assert.assertTrue(title.getText().contains("The Internet"));
        //Click on the “Click Here” button
        WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();
        //Verify the new window title is “New Window”

        WebElement newWindow =driver.findElement(By.tagName("h3"));
        Assert.assertTrue(newWindow.getText().contains("New Window"));
        //Go back to the previous window and then verify the title: “The Internet”


    }
}
