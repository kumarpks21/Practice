package page.object.model;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_One {
WebDriver driver;
Properties pr;

public Login_One(WebDriver driver,Properties pr) {
	this.driver=driver;
	this.pr=pr;
}

public void signin() {
	driver.findElement(By.xpath(pr.getProperty("userName"))).sendKeys(pr.getProperty("userId"));
	driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(pr.getProperty("pass"));
	driver.findElement(By.xpath(pr.getProperty("loginBtn"))).click();
}
}
