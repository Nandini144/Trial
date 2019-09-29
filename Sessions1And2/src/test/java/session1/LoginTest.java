package session1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	//@ is annotation
	@Test
	public void ValidUserShouldBeAbleToLogIn() throws InterruptedException {
		
		//set chrome as default browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//Launching the browser
		//open chrome browser
		//creating a new object driver and the constructor chromeDriver() automatically launches the browser 
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Go to TechFios Website
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		//Type username in the username field
		//always double click on the locator(eg username) and copy and paste to get everything including spaces
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		Thread.sleep(1000);
		
		//Type password in the password field
		driver.findElement(By.name("password")).sendKeys("abc123");
		
		//thread slows down by milliseconds you provide in the parenthesis
		Thread.sleep(1000);
		
		//Click on Sign In button
		driver.findElement(By.name("login")).click();
		//Dashboard should display
		
		
	}
	
	

}
