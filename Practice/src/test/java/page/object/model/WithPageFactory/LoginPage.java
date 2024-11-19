package page.object.model.WithPageFactory;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	Properties pr;
	
	public LoginPage(WebDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void verifyLoginPage(String uname,String pass) throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("accountBtn-xpath"))).click();
		driver.findElement(By.xpath(pr.getProperty("loginBtn-xpath"))).click();
		driver.findElement(By.xpath(pr.getProperty("loginEmailid-xpath"))).sendKeys(uname);
		driver.findElement(By.xpath(pr.getProperty("loginPassword-xpath"))).sendKeys(pass);
		driver.findElement(By.xpath(pr.getProperty("rememberMe-xpath"))).click();Thread.sleep(1000);
		driver.findElement(By.xpath(pr.getProperty("finalLoginBtn-xpath"))).click();
		
		String loginpgURL=driver.getCurrentUrl();
		String loginpgTitle=driver.getTitle();
		if(loginpgURL.equals("https://www.phptravels.net/dashboard") && loginpgTitle.equals("Dashboard")) {
			System.out.println("Login done successfully......");
		}else {
			System.out.println("Login is failed ......");
		}
	}
}
