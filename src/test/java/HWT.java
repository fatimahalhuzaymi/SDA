import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWT {

    public static void main(String[]args ){

        WebDriver driver = new ChromeDriver();
        // Invoke Chrome Browser

 //Navigate to URL: https://www.w3schools.com/
driver.navigate().to("https://www.w3schools.com/");
// Navigate to URL: https://stackoverflow.com/
driver.navigate().to("https://stackoverflow.com/");
//Come back to the w3schools using the back command.
driver.navigate().back();
// Again go back to the stackoverflow website using forward command
driver.navigate().forward();
// Refresh the Browser using refresh command.
driver.navigate().refresh();
// Close the Browser.
driver.quit();
    }
}
// TC - 02

// Go to www.yahoo.com
//driver.get("www.yahoo.com");
// Maximize Window
//driver.manage().window().maximize();
// Go to www.amazon.com
//driver.get("www.amazon.com");
// Maximize Window
//driver.manage().window().maximize();
// Navigate Back
//driver.navigate();
// Navigate Forward
//driver.navigate.forward();
// Refresh The Page
//drivrt.navigate.refresh();

// TC – 03

// Expected Title
//String exptitlr = "google" driver.get("https://www.google.com/");
//Set Path of the Chrome driver
//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
// Open URL of Website
//driver.get("https://www.example.com");
// Maximize Window
//driver.manage().window().maximize();
// Get Title of current Page
//String titele = driver.getTitle();
// Validate/Compare Page Title
//String expectedTitle = "Example Domain";
// Assert.assertEquals(expectedTitle, title);
// Close Browser
//driver.quite();

// TC - 04

// Go to the w3school URL : https://www.w3schools.com/
//driver.get("https://www.w3schools.com/");
// Print the position and size of the page.
//System.out.println("position ="+driver.manage().window().getPosition());
//System.out.println("size="+driver.manage().window().getSize());
// Adjust the position and size of the page as desired.
//driver.manage.window.getPosition(new Point(90,40));
//driver.manage.window.getSize(new Dimension(900, 500));
// Test that the page is in the position and size you want.
//int X = driver.manage().window().getPosition().getX();
//int Y = driver.manage.window.getSize().getY();
//int width= driver.manage.window.getSize.width;
//int height= driver.manage.window.getSize.height;
//if(X==90 && Y==90 && width ==900 && height==500){
//System.out.println("PASSED");
//}eles{ System.out.println("FAILED"); }
// Close the page
//driver.quite();

// TC - 05

// Invoke Chrome Browser
// Open URL: https: https://www.w3schools.com/
//driver.get("https://www.w3schools.com/");
// Maximize the window.
//driver.manage().window().maximize();
// Print the position and size of the page.
//System.out.println("position="+driver.manage().window().getPosition());
//System.out.println("size=" + driver.manage().window().getSize());
// Minimize the page.
//driver.manage().window().minimize();
// Wait 7 seconds in the icon state and maximize the page.
//Thread.sleep(7000);
// Print the position and dimensions of the page in maximized state.
//System.out.println("Size="+driver.manage().window().getSize());
//System.out.println("Position="+driver.manage().window().getPosition());
// Make the page fullscreen.
//driver.manage().window().fullscreen();
// Close the Browser.
//driver.quite();

//TC - 06
//public static void main(String[] args)  { ​ System.setProperty("webdriver.gecko.driver","resources/drivers/geckodriver.exe"); ​ ​
  //WebDriver driver = new FirefoxDriver(); ​

// Go to https://www.youtube.com/
//driver.get("//www.youtube.com/");
// Maximize the window
//driver.manage().window().maxmize();
// Verify the page title contains the word video.
//String TitleofP=driver.getTitle();
//System.out.println("Title Of The page is:"+TitleofP);
//if(TitleofP.contains("video")){
//System.out.println("It contains that one");
//elese{
//System.out.println("It dose not contains the word video");
//}
// Minimize the window
//driver.manage().windoe().minimize();
// Verify the page title contains the word video.
//String TitleofP=driver.getTitle();
//System.out.println("Title Of The page is:"+TitleofP);
//if(TitleofP.contains("video")){
//System.out.println("It contains that one");
//elese{
//System.out.println("It dose not contains the word video");
//}
// Make the page fullscreen
//driver.manage().window().fullscreen();
// Close the driver.
//driver.quite();



