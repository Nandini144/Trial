

package session2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocatorsAndElements {
	
	@Test
	public void variousLocatorsAndElements() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://objectspy.space/");
	Thread.sleep(3000);
	//Clear the search field
	// driver.findElement(By.className("search")).clear();
	// Thread.sleep(3000);
	// 
	// //Type techfios into search field
	// driver.findElement(By.className("search")).sendKeys("Techfios");
	// Thread.sleep(3000);
	// 
	// //Examples of cssSelector
	// driver.findElement(By.cssSelector("input[title='Search']")).click();
	//Click on a linked Text (Display in different different color)
	//Will always have a tagname "a" and url
	// Thread.sleep(3000);
	// driver.findElement(By.linkText("Link Test : New Page")).click();
	//Partial Link Text
	// driver.findElement(By.partialLinkText("OS-API")).click();
	//Absolute xpath example
	// driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[4]/a")).click();
	//Relative xpath example for radio button Male
	// driver.findElement(By.xpath("//input[@value='Male']")).click();
	// Thread.sleep(2000);
	// driver.findElement(By.xpath("//*[@value='Female']")).click();
	//Relative xpath with function text()
	// driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
	//Relative xpath with contains()
	// driver.findElement(By.xpath("//*[contains(text(), 'New Page')]")).click();
	//xpath with "and"
	//*[contains(text(), 'New Page') and contains(text(),'Link')]
	//label[@class='checkbox' and contains(text(), 'Auto')]
	// Thread.sleep(3000);
	// //Close the browser
	// driver.close();
	// //Quite the driver
	// driver.quit();
	
	}

}
