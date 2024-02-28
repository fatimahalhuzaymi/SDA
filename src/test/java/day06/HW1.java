package day06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HW1 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @AfterClass
    public static void tearDown() {
        // driver.quit();
    }

    @Test
    public void test() {

        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        //Select Option 1 using index .
        select.selectByIndex(0);


       //Select Option 2 by value.
       select.selectByValue("2");

       //Select Option 1 value by visible text.
        select.deselectByVisibleText("option 1");

        //Print all dropdown value.
         List<WebElement> options = select.getOptions();
        System.out.println("Print all dropdown value");
        for (WebElement option:options){
            System.out.println(option.getText());
        }

//Verify the dropdown has Option 2 text.
        boolean option2Exists = false;
        for (WebElement option : options) {
            if (option.getText().equals("Option 2")) {
                option2Exists = true;
                break;
            }
        }
        if (option2Exists) {
            System.out.println("Dropdown has Option 2 text");
        } else {
            System.out.println("Dropdown does not have Option 2 text");
        }


//Print first selected option.
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("First selected option: " + firstSelectedOption.getText());
//Find the size of the dropdown,
       int s = options.size();
// Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
        int dropdownSize = options.size();
        if (dropdownSize != 3) {
            System.out.println("Expected Is Not Equal Actual");
        }
    }
}
