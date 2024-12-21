package testpage;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import bbbase.Basepage;
import bbmethod.Methodpage;

public class Testpage {
    Basepage base;
    Methodpage method;

    @BeforeMethod
    public void setUp() {
        base = new Basepage();
        base.setup();
        method = new Methodpage(Basepage.driver);
    }

    @Test
    public void testLoadPage() {
        method.loadPage();
        String title = method.getPageTitle();
        Assert.assertEquals(title, "JPetStore Demo");
        method.clickOnFishOption();
        method.clickOnProductF1SW1();
        method.clickOnItemEST1();
        method.addToCart();
        method.searchForDog();
        method.clickOnProductK9BD01();
        method.clickOnItemEST6();
        method.addItemToCartEST6();
        method.clickReturnToMainMenu();
        method.clickCartOption();
        method.removeItemFromCart();

        // Optionally, verify that the cart is empty or the item has been removed
        method.proceedToCheckout();

        // Optionally, verify that we are on the checkout page
        String checkoutPageTitle = Basepage.driver.getTitle();
        Assert.assertTrue(checkoutPageTitle.contains("Checkout"), "Checkout page was not displayed correctly.");
    }
    
    

        // You can add assertions here to verify the result after clicking on Fish
        // For example, checking the title of the page after clicking "Fish"
   

    @AfterMethod
    public void tearDown() {
        base.tearDown();
    }
}
