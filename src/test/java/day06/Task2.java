package day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Task2 {
    static WebDriver driver;
    /*
    Task:2

 After that, select 'Magenta' using visible text.
 Select an option using value.
     */
    @BeforeClass
    public static void setUP(){
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }
    @AfterClass
    public static void tearDown(){
       // driver.quit();
    }

    @Test
    public void test(){
      //Select the Old Style Select Menu using the element id.
        WebElement element= driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(element);
        //Print all the options of the dropdown.
        List<WebElement> options = select.getOptions();
        System.out.println("Print all dropdown value");
        for (WebElement option:options){
            System.out.println(option.getText());
        }

        // Select 'Purple' using the index.
        select.selectByIndex(3);

       // After that, select 'Magenta' using visible text.
        select.selectByVisibleText("Magenta");
          //      Select an option using value.
        select.selectByValue("2");


    }
}
