package day08;

import day08.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class hw1 extends TestBase {

    @Test
    public void test(){

        driver.get("http://demo.guru99.com/test/guru99home/");
        //Find the number of iframes on the page.
        List<WebElement> iframes =driver.findElements(By.tagName("iframe"));
        System.out.println("number of the iframes on the page is:"+iframes.size());

       // Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
       driver.switchTo().frame(2);
        WebElement linkInsideIframe = driver.findElement(By.linkText("click here"));
        linkInsideIframe.click();
        //Exit the iframe and return to the main page.
        driver.switchTo().defaultContent();


    }
}
