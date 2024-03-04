package day09;

import day08.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C04HorizantilSlider extends TestBase {


    @Test
    public void sliderTest() {
        By slider = By.xpath("//div[@class='range-slider vertical-range']/span[1]");

        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
        WebElement sliderButton = driver.findElement(slider);
        actions
                .dragAndDropBy(sliderButton, 0, -32)
                .pause(Duration.ofSeconds(2))
                .dragAndDropBy(sliderButton, 0, 32)
                .build()
                .perform();

    }
}