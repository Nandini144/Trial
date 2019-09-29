package homeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassOne {
	
	@Test
	public void loginWithValidCredentials() {
		
		//set chrome as default browser
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//open chrome browser
		WebDriver dr = new ChromeDriver();
		//Go to object spy Website
		dr.get("http://objectspy.space");
		//Type First name in the First name  field
		dr.findElement(By.name("firstname")).sendKeys("John");
		//Type Last name in the last name  field
		dr.findElement(By.name("lastname")).sendKeys("Smith");
		//Type password in the password field
		dr.findElement(By.name("Password")).sendKeys("abc123");
		//Click on Sign In button
		dr.findElement(By.id("openwindow")).click();
		
	}

}
