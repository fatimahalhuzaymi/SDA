package day09;

import day08.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C01HandlesOfMultipleWindows extends TestBase {

    @Test
    public void test(){
        By tabElement= By.id("tabButton");
        By windowButton= By.id("windowButton");
        By messageWindowButton= By.id("messageWindowButton");
        By  messageOnTab= By.id("sampleHeading");

        //  Go to URL: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");

        //Click on all the child windows.
        driver.findElement(tabElement).click();
        driver.findElement(windowButton).click();
        driver.findElement(messageWindowButton).click();

        //   Print the text present on all the child windows in the console.
        ///List<String>handelList=(List<String>) driver.getWindowHandles();
        Set<String> handel = driver.getWindowHandles();
        Iterator<String> itr= handel.iterator();

        String handelMain =itr.next();
        String handelTab=itr.next();
        String handelNewWindoe= itr.next();
        String habelWindowMessage=itr.next();

        // Print the heading of the parent window in the console.
        driver.switchTo().window(handelTab);
        System.out.println(driver.findElement(messageOnTab).getText());

        driver.switchTo().window(handelNewWindoe);
        System.out.println(driver.findElement(messageOnTab).getText());
    }
}
