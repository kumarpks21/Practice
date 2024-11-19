package page.object.model.WithPageFactory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseClass {
//initialize the WebDriver and Properties
	public WebDriver driver;
	public Properties pr;
	@BeforeClass
	public void startProcess() throws IOException {
		//load the file and read data from property file
		pr=new Properties();
		File f=new File("C:\\Users\\kumar\\eclipse-workspace\\Practice\\src\\test\\java\\page\\object"
				+ "\\model\\WithPageFactory\\Object.Properties");
		FileReader fr=new FileReader(f);
		pr.load(fr);
		//open browser according to property file
		String browserName=pr.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}else {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(UtilitiesClass.page_load_timeout)); // time import from UtilitiesClass
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(UtilitiesClass.imlicit_wait));                    // time import from UtilitiesClass
		//open the browser
		driver.get("https://www.phptravels.net/");
	}
	
}
