package page.object.model.WithotPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class CheckOut {
    WebDriver driver;
    Properties pr;

    public CheckOut(WebDriver driver, Properties pr) {
        this.driver = driver;
        this.pr = pr;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[@id='checkout']") 
    WebElement clickCheckout;
    
    @FindBy(xpath="//input[@id='first-name']")
    WebElement userFirstName;
    
    @FindBy(xpath="//input[@id='last-name']")
    WebElement userLastName;
    
    @FindBy(xpath="//input[@id='postal-code']")
    WebElement userZipCode;
    
    @FindBy(xpath="//input[@id='continue']")
    WebElement Continue;
    
    @FindBy(xpath="//button[@id='finish']")
    WebElement finish;
    
 public void finalCheckout(String firstName,String lastName,String zipCode) {
	 clickCheckout.click();
	 userFirstName.sendKeys(firstName);
	 userLastName.sendKeys(lastName);
	 userZipCode.sendKeys(zipCode);
	 Continue.click();
	 finish.click();
 }
}
