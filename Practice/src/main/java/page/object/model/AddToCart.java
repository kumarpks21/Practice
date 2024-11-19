package page.object.model;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {

	WebDriver driver;
	Properties pr;
	
	public AddToCart(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void product() {
		driver.findElement(By.xpath(pr.getProperty("prod1"))).click();
		driver.findElement(By.xpath(pr.getProperty("addCart"))).click();
		driver.findElement(By.xpath(pr.getProperty("cart"))).click();
	}
	
}
