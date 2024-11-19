package page.object.model.WithPageFactory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class HomePageClass {

	WebDriver driver;
	Properties pr;
	
	public HomePageClass(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void verifyHomePage() {
		String title=driver.getTitle();
		String currentUrl=driver.getCurrentUrl();
		
		if(title.equals("PHPTRAVELS") && currentUrl.equals("https://www.phptravels.net/")) {
			System.out.println("We are the correct page");
		}else {
			System.out.println("We are on wrong page");
		}
	}
}
