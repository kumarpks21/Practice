package page.object.model.WithotPageFactory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class CloseThePage {
	WebDriver driver;
	Properties pr;
	public CloseThePage(WebDriver driver,Properties pr)
	{
this.driver=driver;
this.pr=pr;
}
	
public void closePage() {
	driver.quit();
}
}
