package day09;

import day08.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class hw1 extends TestBase {

    @Test
    public void test(){
        Actions actions = new Actions(driver);

        // Go to URL: http://demo.guru99.com/test/drag_drop.html
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        //Drag and drop the BANK button to the Account section in DEBIT SIDE
        drqAndDrop("Bank","bank");
        //Drag and drop the SALES button to the Account section in CREDIT SIDE
        drqAndDrop("SALE","Loan");
        //Drag and drop the 5000 button to the Amount section in DEBIT SIDE
        drqAndDrop("5000","amt7");
        //Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        drqAndDrop("5000","amt8");
        //Verify the visibility of Perfect text.
        By perfect= By.id("Perfect");
        WebElement per = driver.findElement(perfect);
        Assert.assertTrue(per.isDisplayed());
    }
    public  void drqAndDrop(String Account,String Amount){
        By account = By.xpath("//div[text()='"+ Account +"']");
        By amount = By.xpath("//div[text()='"+Amount+"']");

        WebElement acc = driver.findElement(account);
        WebElement amo = driver.findElement(amount);

        actions
                .dragAndDrop(acc,amo)
                .perform();



    }


}
