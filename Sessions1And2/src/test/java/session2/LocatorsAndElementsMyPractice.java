package session2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAndElementsMyPractice {
	@Test
	public void variousLocatorsandElements() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// open chrome window
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// go to objectspy.space
		driver.get("http://objectspy.space/");
		Thread.sleep(3000);
	 
		
//		//To clear the search field
//		driver.findElement(By.className("search")).clear();
//		Thread.sleep(3000);
//		//type techfios in the search field 		
//		driver.findElement(By.className("search")).sendKeys("Techfios");
//		Thread.sleep(3000);
//		
//		//Examples of CssSelector
//		//Css syntax- tag[attribute='Value']
//		driver.findElement(By.cssSelector("input[title='Search']")).click();
		
		
//		//Absolute XPath element (link text)
//		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[4]/a")).click();
//		
		//Relative XPath example for radio button and click on male
//		driver.findElement(By.xpath("//input[@value='Male']")).click();
//		
//		Thread.sleep(2000);
//		
//		//Relative XPath example for radio button and click on female
//		//here in this xpath you can use * instead of tagname which means it includes all the tagnames(which means it will look for it in all the nodes)
//		driver.findElement(By.xpath("//*[@value='Female']")).click();
		
//		//Relative XPath with function text(). using xpath to click on  a text. 
//		//use a function called text(). if you use a function dont use @ symbol
//		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		
		//Relative Xpath with contains()
//		driver.findElement(By.xpath("//*[contains(text(),'New Page')]")).click();
		
		//Relative Xpath with 2 conditions. doesn't mind the order of the conditions. Can combine any way you want as long as the logic is right
		//XPath with "and" - //*[contains(text(),'New Page') and contains(text(),'Link')]
		
		//XPath with attributes and text( check box Automation Tester)
		//XPath - //label[@class='checkbox' and contains(text(),'Auto')]
		
		
//		//Click on Linked text(Displayed in diff color)
//		//will always have a tag name "a" and URL
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Link Test : New Page")).click();
//		
//		//Partial linked text
//		//if there was another--text with same 
//		driver.findElement(By.partialLinkText("OS-API")).click();
//		
		
		//Thread.sleep(3000);
//		//close the browser
//		driver.close();
//		//quit the driver so that all backend work is shut down and everything is clean
//		driver.quit();
//		
		

		
		
		
		
		
		
		
	}

}
