package page.object.model.WithPageFactory;

import org.testng.annotations.Test;

public class TeatCase extends BaseClass {

	@Test(priority=1,enabled=true)
	public void executeHomePageClass() {
		HomePageClass hpc=new HomePageClass(driver,pr);
		hpc.verifyHomePage();
	}
	@Test(priority=2,enabled=true)
	public void executeSignUpPage() throws InterruptedException {
		SignUpPage sup=new SignUpPage(driver, pr);
		sup.verifySignUpPage();
	}
	@Test(priority=3,enabled=true)
	public void executeLoginPage() throws InterruptedException {
		LoginPage lp=new LoginPage(driver,pr);
		lp.verifyLoginPage("useforspotify1994@gmail.com", "testing@123");
	}
	@Test(priority=4,enabled=true)
	public void executeFlightBooking() {
		BookFlightTicket bft=new BookFlightTicket(driver,pr);
		bft.flightBtnClick();
	}
}
