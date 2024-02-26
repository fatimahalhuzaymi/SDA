import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class C01Junit {
    /*
 ******JUNIT*****
" The most basic framework with Java can be created using the JUnit framework.
* JUnit is an open-source unit testing tool used to test small/large code units.
* You don't need to create a class object or define a main method to run a JUnit test.
*  Developers also use unit tests to run tests.
*  We will create and use the TestNG framework as it is an advanced version of JUnit for our testing.
* JUnit is also used to run Automation packages with multiple test scenarios.
* When we say 'test,' it can be a single method or a structure containing many classes and packages.
* Regression Test, Smoke Test, etc.
* The test method is the smallest test structure created using the @Test annotation, which can be run independently.
* @Test annotation: Test method"
 */
    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
    @Test
    public void test2(){
        WebDriver driver = new SafariDriver();
        driver.get("https://google.com");
        driver.quit();
    }
    @Test
    public void test3(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.quit();
    }
    @Test
    public void test4(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://clarusway.com");
        driver.quit();
    }
}

//HW1
//public  static void main(String[] args){
  // WebDriver driver = new ChromeDriver();

//}
// Invoke Chrome Browser

// Navigate to URL: https://www.w3schools.com/
//driver.navigate().to("https://www.w3schools.com/");
// Navigate to URL: https://stackoverflow.com/
//driver.navigate().to("https://stackoverflow.com/");
// Come back to the w3schools using the back command.
//driver.navigate().back();
// Again go back to the stackoverflow website using forward command
//driver.navigate().forward();
//driver.navigate().refresh();
// Refresh the Browser using refresh command.
// Close the Browser.
//driver.quite