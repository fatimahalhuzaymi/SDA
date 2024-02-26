package HW3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class T1 {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Go to Google
        driver.get("http://www.google.com");

        // Perform searches and print the number of results
        printNumberOfResults("Green Mile");
        printNumberOfResults("Premonition");
        printNumberOfResults("The Curious Case of Benjamin Button");
    }

    private void printNumberOfResults(String searchTerm) {
        // Find the search input field
        driver.findElement(By.name("q")).sendKeys(searchTerm + Keys.ENTER);

        // Find and print the number of search results
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results for '" + searchTerm + "': " + resultStats);
    }

    @AfterClass
    public static void tearDown() {
        // Close the browser
        driver.quit();
    }
}
   /*
   task01:
Create the driver with BeforeClass and make it static inside the class.
Go to http://www.google.com

Type "Green Mile" in the search box and print the number of results.
Type "Premonition" in the search box and print the number of results.
Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
Close with AfterClass.
    */