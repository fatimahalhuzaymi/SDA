package day09;

import com.google.j2objc.annotations.Weak;
import day08.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class hw2 extends TestBase {

    @Test
    public void test(){
        By rangeslider = By.xpath("//div[@id='js-rangeslider-0']");
        By output = By.id("js-output");

        //  Go to URL: https://rangeslider.js.org/
        driver.get("https://rangeslider.js.org/");
        WebElement out1=driver.findElement(output);
        System.out.println("output1:"+out1.getText());
        //Shift 100 units to the right and 100 units to the left on the horizontal axis.
        WebElement rangessliderbutton= driver.findElement(rangeslider);

        actions
                .dragAndDropBy(rangessliderbutton, 0, 100)
                .pause(Duration.ofSeconds(2))
                .dragAndDropBy(rangessliderbutton, 0, -100)
                .build()
                .perform();

        WebElement out2=driver.findElement(output);
        System.out.println("output2=:"+out2.getText());
        Assert.assertEquals(out1.getText(),out2.getText());

    }


}
