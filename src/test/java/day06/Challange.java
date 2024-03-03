package day06;

import com.github.javafaker.Faker;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Challange {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com");
    }

    @Test
    public void test01(){
        driver.findElement(By.id("email")).sendKeys("ekarsli61@gmail.com");
        driver.findElement(By.id("password")).sendKeys("1234567890");
        driver.findElement(By.id("submit")).click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://thinking-tester-contact-list.herokuapp.com/contactList");

        driver.findElement(By.id("add-contact")).click();

        Assert.assertEquals("https://thinking-tester-contact-list.herokuapp.com/addContact", driver.getCurrentUrl());


        //In this approach, I used hashmap to put my values with related keys.
        Map<String, String> contact = new HashMap<>();
        Faker faker = new Faker();

        contact.put("firstName", faker.name().firstName());
        contact.put("lastName", faker.name().lastName());
        contact.put("birthdate", "2015-11-11");
        contact.put("email", faker.internet().emailAddress());
        contact.put("phone", "12345678");
        contact.put("street1", faker.address().streetAddress());
        contact.put("street2", faker.address().buildingNumber());
        contact.put("city", faker.address().city());
        contact.put("stateProvince", faker.address().state());
        contact.put("postalCode", faker.address().zipCode());
        contact.put("country", faker.address().country());



        //using foreach loop to iterate over the hashmaps keys to
        //find the element by id and sendkeys by getting the value of the key
        for (String w: contact.keySet()){
            driver.findElement(By.id(w)).sendKeys(contact.get(w));
        }
        driver.findElement(By.id("submit")).click();

        //Simple hard wait after clicking submit to wait for url to be changed
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("https://thinking-tester-contact-list.herokuapp.com/contactList", driver.getCurrentUrl());

        //Again here I used foreach loop to avoid multiple lines of unnecessary code blocks.
        for (String w: contact.values()){
            Assert.assertNotEquals(0, driver.findElements(By.xpath("//*[contains(text(), '" + w + "')]")).size());
        }


    }

    @After
    public void tearDown(){

        driver.quit();
    }
}


