package day14;

import org.testng.annotations.Test;

public class C03TestNG {
    /*
    Create tests that depend on each other
Create beforeClass and set up settings.
By creating interdependent tests;
First go to Facebook.
Then go to Google depending on Facebook,
Then go to Amazon depending on Google
Close the driver
     */

    @Test(dependsOnMethods = "https//:www.google.com")
    public void g() {
        System.out.println("Test01 has executed");

    }

    @Test(timeOut = 500, description = "this is test02")
    public void o() throws InterruptedException {
        Thread.sleep(600);
        System.out.println("Test02 has executed");
    }

    @Test(dependsOnMethods = "https//:www.amazon.com")
    public void a() {
        System.out.println("Test02 has executed");

    }

    @Test(dependsOnMethods = "https//:www.facebook.com")
    public void f() {
        System.out.println("Test02 has executed");

    }
}

