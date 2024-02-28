package day05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task02 {

    /*
    Task 2:
     * breakout task: (in a separate class)
     * navigate to this url https://www.saucedemo.com/v1/inventory.html
     * add the first item you find to your cart
     * open your cart*
     * assert that the item name is correct inside the cart
     */



    public class CartTest {
        public static void main(String[] args) {
            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

            // Create a new instance of the ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Navigate to the URL
            driver.get("https://www.saucedemo.com/v1/inventory.html");

            // Add the first item to the cart
            WebElement addItemButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
            addItemButton.click();

            // Open the cart
            WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
            cartIcon.click();

            // Assert that the item name is correct inside the cart
            WebElement itemNameInCart = driver.findElement(By.className("inventory_item_name"));
            String itemName = itemNameInCart.getText();
            String expectedItemName = "Name of the item"; // Replace with the expected item name
            assert itemName.equals(expectedItemName) : "Item name in the cart is not correct";

            // Print a success message if the assertion passes
            System.out.println("Item name in the cart is correct: " + itemName);

            // Close the browser
            driver.quit();
        }
    }
}
