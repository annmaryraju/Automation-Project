package bbbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage{
    public static WebDriver driver;

    public void setup() {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void tearDown() {
        // Close the driver
    	  try {
              Thread.sleep(12000); // 5 seconds delay
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        
    }
}
