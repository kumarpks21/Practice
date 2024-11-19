package page.object.model.WithPageFactory;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage  {

	WebDriver driver;
	Properties pr;
	
	public SignUpPage (WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		PageFactory.initElements(driver, this);
	}
	
public void verifySignUpPage() throws InterruptedException {
	driver.findElement(By.xpath(pr.getProperty("accountBtn-xpath"))).click();
	driver.findElement(By.xpath(pr.getProperty("signupBtn-xpath"))).click();
	driver.findElement(By.xpath(pr.getProperty("firstName-xpath"))).sendKeys(pr.getProperty("firstName"));
	driver.findElement(By.xpath(pr.getProperty("lastName-xpath"))).sendKeys(pr.getProperty("lastName"));
	driver.findElement(By.xpath(pr.getProperty("selectCountry-xpath"))).click();
	driver.findElement(By.xpath(pr.getProperty("countrySearchBox-xpath"))).sendKeys("India");
	driver.findElement(By.xpath(pr.getProperty("indiaCountry-xpath"))).click();
	driver.findElement(By.xpath(pr.getProperty("phoneNo-xpath"))).sendKeys(pr.getProperty("phoneNo"));
	driver.findElement(By.xpath(pr.getProperty("userEmail-xpath"))).sendKeys(pr.getProperty("userEmail"));
	driver.findElement(By.xpath(pr.getProperty("password-xpath"))).sendKeys(pr.getProperty("password"));
	Actions action=new Actions(driver);
	action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(10000);
	driver.findElement(By.xpath(pr.getProperty("finalSignUpBtn-xpath"))).click();
	
	String signupURL=driver.getCurrentUrl();
	String signupTitle=driver.getTitle();
	if(signupURL.equals("https://www.phptravels.net/signup_success") && signupTitle.equals("Signup Success")) {
		System.out.println("Signup done successfully..............");
	}else {
		System.out.println("Signup failed...........");
	}
}
	
}
