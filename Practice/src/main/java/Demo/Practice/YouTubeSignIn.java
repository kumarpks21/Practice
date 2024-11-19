package Demo.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class YouTubeSignIn {

    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            // Step 1: Navigate to YouTube
            driver.get("https://www.youtube.com/");
            driver.manage().window().maximize();

            // Step 2: Click on the 'Sign In' button
            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tp-yt-paper-button[@aria-label='Sign in']")));
            signInButton.click();

            // Step 3: Enter the Email or Phone
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
            emailField.sendKeys("your_email@gmail.com");  // Replace with your actual email

            // Click Next
            WebElement emailNextButton = driver.findElement(By.xpath("//span[text()='Next']"));
            emailNextButton.click();

            // Step 4: Enter the Password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            passwordField.sendKeys("your_password");  // Replace with your actual password

            // Click Next
            WebElement passwordNextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
            passwordNextButton.click();

            // Step 5: Wait for the profile icon to confirm login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='img' and @alt='Avatar image']")));
            System.out.println("Login successful!");

        } catch (Exception e) {
            System.out.println("An error occurred during the login process: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the browser after some time to review results
            driver.quit();
        }
    }
}
