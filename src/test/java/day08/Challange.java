package day08;

import day08.utilities.TestBase;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class Challange {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");
    }
    @AfterClass
    public static void tearDown(){
       // driver.quit();
    }

        @Test
                public void test(){
            driver=new ChromeDriver();


            driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");


            List<WebElement> inputFields = driver.findElements(By.tagName("input"));
            System.out.println("Number of input fields found: " + inputFields.size());
            for (WebElement inputField : inputFields) {
                System.out.println("Input Field Type: " + inputField.getAttribute("type"));
                System.out.println("Input Field Name: " + inputField.getAttribute("name"));
                System.out.println("Input Field ID: " + inputField.getAttribute("id"));
                System.out.println("Input Field Placeholder: " + inputField.getAttribute("placeholder"));
                System.out.println("-----------------------");
            }
            List<WebElement> buttons = driver.findElements(By.tagName("button"));
            System.out.println("Number of buttons found: " + buttons.size());
            for (WebElement button : buttons) {
                System.out.println("Button Text: " + button.getText());
                System.out.println("Button ID: " + button.getAttribute("id"));
                System.out.println("Button Type: " + button.getAttribute("type"));
                System.out.println("-----------------------");
            }



            driver.findElement(By.xpath("//div[@class='checker']")).click();
            List<WebElement> radButtons=driver.findElements(By.xpath("//input[@type='radio']"));
            radButtons.get(0).click();
            Assert.assertTrue(radButtons.get(0).isSelected());
            radButtons.get(1).click();
            Assert.assertTrue(radButtons.get(1).isSelected());
            radButtons.get(2).click();
            Assert.assertTrue(radButtons.get(2).isSelected());

            List<WebElement>  checkboxes = driver.findElements(By.xpath("//div[@class='checker']"));
            if(!checkboxes.get(0).isSelected()){
                checkboxes.get(0).click();
                System.out.println("check box 1 is selected...");
            } else {
                System.out.println("check box 1 is already selected...");

            }
            if(!checkboxes.get(1).isSelected()){
                checkboxes.get(1).click();
                System.out.println("check box 2 is selected...");
            } else {
                System.out.println("check box 2 is already selected...");

            }
            Assert.assertTrue(checkboxes.get(0).isSelected());
            Assert.assertTrue(checkboxes.get(1).isSelected());
            //driver.findElement(By.xpath("//input[@id='SingleLine-arialabel']"));


            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            WebElement fifthStar = driver.findElement(By.xpath("//div[@class='ratingCount]/span[5]"));

            fifthStar.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        }
    }

