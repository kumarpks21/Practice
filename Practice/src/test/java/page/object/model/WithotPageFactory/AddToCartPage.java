package page.object.model.WithotPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class AddToCartPage {
    WebDriver driver;
    Properties pr;

    public AddToCartPage(WebDriver driver, Properties pr) {
        this.driver = driver;
        this.pr = pr;
    }

public void addToCartProduct() {
	driver.findElement(By.xpath(pr.getProperty("product-xpath"))).click();
	driver.findElement(By.xpath(pr.getProperty("add-to-cart-xpath"))).click();
	driver.findElement(By.xpath(pr.getProperty("go-to-cart-xpath"))).click();
}
}
