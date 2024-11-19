package page.object.model;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class checkout {

	WebDriver driver;
	Properties pr;
	
	public checkout(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void finalProcess(String firstName, String lastName, String zipCode) {
		driver.findElement(By.xpath(pr.getProperty("checkout"))).click();
		driver.findElement(By.xpath(pr.getProperty("first_name"))).sendKeys(firstName);
		driver.findElement(By.xpath(pr.getProperty("last_name"))).sendKeys(lastName);
		driver.findElement(By.xpath(pr.getProperty("postal_code"))).sendKeys(zipCode);
		driver.findElement(By.xpath(pr.getProperty("continue"))).click();
		driver.findElement(By.xpath(pr.getProperty("finish"))).click();
		
	}
}
