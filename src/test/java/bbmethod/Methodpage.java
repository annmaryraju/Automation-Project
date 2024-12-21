package bbmethod;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Methodpage {
    WebDriver driver;

    // Constructor to initialize WebDriver
    public Methodpage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to load the JPET Store page
    public void loadPage() {
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
    }

    // Example method to check if the page title is correct
    public String getPageTitle() {
        return driver.getTitle();
    }
 // Method to click on the Fish option
    public void clickOnFishOption() {
        // Locate the Fish option (by link text in this case)
        WebElement fishLink = driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]"));
        fishLink.click();
}
    public void clickOnProductF1SW1() {
        // Locate the product by its ID (assuming the product ID is part of the link's href or alt text)
        WebElement product = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
        product.click();
    }
        public void clickOnItemEST1() {
            // Locate the item with ID EST1 (assuming it's in the link or another attribute)
            WebElement item = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
            item.click();
            
}
        public void addToCart() {
            WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a"));  // Assuming the button has 'addToCart' as name attribute
            addToCartButton.click();
        }
        public void searchForDog() {
            // Locate the search bar by its 'name' attribute (adjust the name if necessary)
            WebElement searchField = driver.findElement(By.name("keyword"));

            // Enter "dog" into the search field
            searchField.sendKeys("dog");

            // Locate and click on the search button (adjust the 'name' if necessary)
            WebElement searchButton = driver.findElement(By.name("searchProducts"));
            searchButton.click();
        }
        public void clickOnProductK9BD01() {
            WebElement product = driver.findElement(By.xpath("//a[contains(@href, 'K9-BD-01')]"));
            product.click();
        }
        public void clickOnItemEST6() {
            WebElement item = driver.findElement(By.xpath("//a[contains(@href, 'EST-6')]"));
            item.click();
        }
        public void addItemToCartEST6() {
            WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a"));
            addToCartButton.click();
        }
        public void clickReturnToMainMenu() {
            WebElement returnToMainMenuLink = driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
            returnToMainMenuLink.click();
        }
        public void clickCartOption() {
            WebElement cartLink = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]/img"));
            cartLink.click();
        }
        public void removeItemFromCart() {
            // Locate the "Remove" button by its unique identifier (e.g., name, class, or XPath)
            WebElement removeButton = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a"));
            removeButton.click();
        }
        public void proceedToCheckout() {
            // Locate the "Proceed to Checkout" button by its unique identifier (e.g., name, class, XPath)
            WebElement checkoutButton = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
            checkoutButton.click();
        }
}
