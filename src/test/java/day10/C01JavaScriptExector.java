package day10;

import day08.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C01JavaScriptExector extends TestBase {

@Test
    public void test(){
    driver.get("https://www.linkedin.com");

    JavascriptExecutor js =(JavascriptExecutor)driver;
    //js.executeScript("alert(\"hi SDA\");");

    js.executeScript("window scrollBy(0,3000)");
    WebElement button = driver.findElement(By.id("bottom-cta-section__header"));

    int x = button.getLocation().getX();
    int y= button.getLocation().getY();

    js.executeScript("argument[0].scrollIntoView();",driver.findElement(By.id("bottom-cta-section__header")));

}

}
