package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02Example {


    /*
    http://the-internet.herokuapp.com/add_remove_elements/
Click on the "Add Element" button 100 times.
Write a function that takes a number, and clicks the "Delete" button.
Given number of times, and then validates that given number of buttons was deleted.

1. Method: createButtons(100)
2. Method: DeleteButtonsAndValidate()
     */
    static WebDriver driver;

    @Test
    public void createDeleteTest(){
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

    }
    public void createButtons(int numberOfButtons){
        WebElement button = driver.findElement(By.xpath("//*[.='Add Elements']"));
        for (int i = 0; i<numberOfButtons; i++)
            button.click();
    }
}

