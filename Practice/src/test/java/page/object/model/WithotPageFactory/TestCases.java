package page.object.model.WithotPageFactory;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCases extends BaseClass {

    @Test(priority=1)
    public void executeTestLogin() {
    	LoginPage login=new LoginPage(driver, pr);
    	login.loginThePage();
    	login.checkCurrentURL();
    	Reporter.log("Login page test case executed successfully .............");
    }
    @Test(priority=2)
    public void executeTestAddToCart() {
    	AddToCartPage cart=new AddToCartPage(driver, pr);
    	cart.addToCartProduct();
    	Reporter.log("Add to cart test case executed successfully.............");
    }
    @Test(priority=3)
    public void executeTestCheckOut() {
    	CheckOut order=new CheckOut(driver,pr);
    	order.finalCheckout("Prashant", "Singh", "221005");
    	Reporter.log("Checkout functionality is tested successfully...............");
    }
    @Test(priority=4)
    public void close() {
    	CloseThePage closePagefinal=new CloseThePage(driver,pr);
    	closePagefinal.closePage();
    	Reporter.log("Browser is closed successfully............");
    }
    }

