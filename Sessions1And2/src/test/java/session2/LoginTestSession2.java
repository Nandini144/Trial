package session2;

import java.util.concurrent.TimeUnit;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestSession2 {
	
	@Test
	public void validUsersShouldBeAbleToLogIn() throws InterruptedException {
	//Set Chrome as default browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//Open Chrome Browserd
	WebDriver driver = new ChromeDriver();
	//Maximize the window
	// driver.manage().window().maximize();
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Go to TechFios Website
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	//Type username in the username field
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	// Thread.sleep(2000);
	//Type password in the password field
	driver.findElement(By.name("password")).sendKeys("abc123");
	// Thread.sleep(2000);
	//Click on Sign In button
	driver.findElement(By.name("login")).click();
	//Dashboard page should display
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"))));
	driver.close();
	driver.quit();
	}
	
}
