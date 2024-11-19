package page.object.model.WithPageFactory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlightTicket {
WebDriver driver;
Properties pr;

public BookFlightTicket(WebDriver driver, Properties pr) {
	this.driver=driver;
	this.pr=pr;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[normalize-space()='Flights']")
WebElement flightBtn;

public void flightBtnClick() {
	flightBtn.click();
}

}
