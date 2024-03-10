package day10;

import day08.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import day08.utilities.JScriptUtilities;


public class C02JavaScriptExector02 extends TestBase {


    @Test
    public void test(){


        driver.get("https://api.jquery.com/dblclick/");
        driver.switchTo().frame(0);
        WebElement colouredButton =driver.findElement(By.cssSelector("body>div"));

        JScriptUtilities.scrollIntoViewJS(driver,colouredButton);

        actions
                .doubleClick(colouredButton)
                .perform();

        String colorCode = colouredButton.getCssValue("background-color");

        driver.switchTo().defaultContent();

        JScriptUtilities.scrollAllUpByJS(driver);

        driver.findElement(By.name("s")).sendKeys(colorCode);

        JScriptUtilities.scrollDownByJS(driver);
        driver.findElement(By.xpath("//a[@href = 'https://www.manning.com/books/jquery-in-action-third-edition']")).click();


    }
}
