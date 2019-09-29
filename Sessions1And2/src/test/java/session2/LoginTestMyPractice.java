//my practice
//to comment it out highlight the code, press CTRL+ /
package session2;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestMyPractice {
	
//	String expectedCondition = "Dashboard";
	@Test
	public void validUserShouldBeAbleToLogIn() throws InterruptedException {
	//set chrome as default browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	//open chrome browser
	WebDriver driver = new ChromeDriver();
	
	//Maximize the  window
	driver.manage().window().maximize();
	
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//go to techfios website
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	
	//Type username in the username field
	//Right click on the element and select inspect. it will highlight the code
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	
	Thread.sleep(2000);
	
	//type password in the password field
	driver.findElement(By.name("password")).sendKeys("abc123");
	
	//thread with time in millisec
	Thread.sleep(2000);
	
	//click on sign in button
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(2000);
	
	//Dashboard page should display
	//use contains in the XPath to validate the text "Dashboard"
	//Depending on the situation you can either use * or tagname in the XPath
	//storing the element in the variable dashboardTitle of the type WebElement 
	WebElement dashboardTitle =  driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
	
	//Explicit wait(
	waitFor(dashboardTitle, driver);
	
	if(dashboardTitle.isDisplayed()) {
		System.out.println("Test Passed");
		
	}else {
		System.out.println("Test Failed!!");
	}
	
	driver.close();
	driver.quit();
	
	
	}
	
	public static void waitFor(WebElement element, WebDriver driver) {
		
		//Explicit wait with time in secs
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
}
