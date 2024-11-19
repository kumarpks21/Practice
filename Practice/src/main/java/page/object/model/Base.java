package page.object.model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import page.object.model.utility.TestUtility;

public class Base {

	public static WebDriver driver;
	public static Properties pr;
	
	@BeforeMethod
	public void launch() throws IOException {
		pr=new Properties();
		File f=new File("C:\\Users\\kumar\\eclipse-workspace\\Practice\\Object.properties");
		FileReader fr=new FileReader(f);
		pr.load(fr);
		
		String browserName=pr.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtility.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtility.IMPLICIT_WAIT));
		driver.get(pr.getProperty("url"));

		
	}
}
