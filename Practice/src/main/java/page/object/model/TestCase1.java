package page.object.model;

import org.testng.annotations.Test;

public class TestCase1 extends Base {
	
	@Test
public void testCase() {
	
		Login_One login=new Login_One(driver, pr);
		login.signin();
		
		AddToCart add=new AddToCart(driver,pr);
		add.product();
		
		checkout out=new checkout(driver, pr);
		out.finalProcess("Prashant", "Singh", "221005");
}
}
