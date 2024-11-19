package page.object.model.WithotPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginPage {
    WebDriver driver;
    Properties pr;

    public LoginPage(WebDriver driver, Properties pr) {
        this.driver = driver;
        this.pr = pr;
    }

    By userName=By.xpath("//input[@id='user-name']");
    By passWord=By.xpath("//input[@id='password']");
    By loginBtn = By.xpath("//input[@id='login-button']");
    
public void loginThePage() {
	driver.findElement(userName).sendKeys(pr.getProperty("userId"));
	driver.findElement(passWord).sendKeys(pr.getProperty("pass"));
	driver.findElement(loginBtn).click();
}

public void checkCurrentURL() {
	String currentURL=driver.getCurrentUrl();
	if(currentURL.equals("https://www.saucedemo.com/inventory.html")) {
		System.out.println("We are on correct page");
	}else {
		System.out.println("We are on wrong page");
	}
}
}
