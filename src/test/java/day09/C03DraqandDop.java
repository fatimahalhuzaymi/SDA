package day09;

import day08.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C03DraqandDop extends TestBase {
    String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
    @Test
    public void test() {

//Fill in capitals by country.



        //Fill in capitals by country.

/*
        WebElement Oslo =driver.findElement(By.id("box1"));
        WebElement Stockholm=driver.findElement(By.id("box2"));
        WebElement Washington =driver.findElement(By.id("box3"));
        WebElement  coenhagen =driver.findElement(By.id("box4"));
        WebElement Seoul =driver.findElement(By.id("box5"));
        WebElement Rome = driver.findElement(By.id("box6"));
        WebElement Madrid = driver.findElement(By.id("box7"));
        */

         Actions actions = new Actions(driver);



        driver.get(url);
        dragCapitolInCountryBox("Madrid", "Spain");
        dragCapitolInCountryBox("Washington", "United States");
        dragCapitolInCountryBox("Rome", "Italy");
        dragCapitolInCountryBox("Seoul", "South Korea");
        dragCapitolInCountryBox("Copenhagen", "Denmark");
        dragCapitolInCountryBox("Oslo", "Norway");
        dragCapitolInCountryBox("Stockholm", "Sweden");


    }
    public void dragCapitolInCountryBox(String capital, String country){
        By cap = By.xpath("//div[text()='"+ capital +"'][2]");
        By count = By.xpath("//div[text()='"+country+"']");

        Actions actions = new Actions(driver);
        WebElement capitalBox = driver.findElement(cap);
        WebElement countryBox = driver.findElement(count);
        actions.dragAndDrop(capitalBox,countryBox).perform();


    }
    }

