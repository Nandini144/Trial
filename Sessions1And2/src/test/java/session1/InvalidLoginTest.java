package session1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTest {
	@Test
	public void invalidUsersShouldBeAbleToLogIn() {
	//Set Chrome as default browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//Open Chrome Browser
	WebDriver driver = new ChromeDriver();
	//Go to TechFios Website
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	//Type username in the username field
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	//Type password in the password field
	driver.findElement(By.name("password")).sendKeys("abc");
	//Click on Sign In button
	driver.findElement(By.name("login")).click();
	}

}
