package day11;

import day08.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

public class Homework1 extends TestBase {

    @Test
    public void test()  {

        //Task1: Go to URL : https://facebook.com
        driver.get("https://facebook.com");
        //getCookies
        System.out.println("Get All cookies");
        driver.manage().getCookies().forEach(t-> System.out.println(t));
        System.out.println("------------------------------");


        //addCookies
        Cookie newCookie = new Cookie("newCookie","Welcome");
        driver.manage().addCookie(newCookie);
        driver.manage().getCookies().forEach(t-> System.out.println(t));
        System.out.println("------------------------------");

        //deleteCookieNamed,
        driver.manage().deleteCookieNamed("newCookie");
        driver.manage().getCookies().forEach(t-> System.out.println(t));
        System.out.println("------------------------------");
        //deleteAllCookie
        driver.manage().deleteAllCookies();
        driver.manage().getCookies().forEach(t-> System.out.println(t));
        System.out.println("End here...");


    }
}
