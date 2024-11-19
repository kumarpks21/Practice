package page.object.model.WithotPageFactory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseClass {
    public static WebDriver driver;
    public static Properties pr;

    @BeforeClass
    public void initialization() throws IOException {
        pr = new Properties();
        File f = new File("C:\\Users\\kumar\\eclipse-workspace\\Practice\\src\\test\\java\\page\\object\\model\\WithotPageFactory\\Object.Properties");
        FileReader fr = new FileReader(f);
        pr.load(fr);
        
        System.out.println("Bol benchod kaun sa browser pe chalana hai.... bol jaldi se bol");
        Scanner scanner = new Scanner(System.in);
        String brName=scanner.next();

        //String browserName = pr.getProperty("browser");
        if (brName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (brName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + brName);
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(pr.getProperty("url"));
    }
    
    
}
