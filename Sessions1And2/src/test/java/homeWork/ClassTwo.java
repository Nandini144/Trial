package homeWork;
//Scenario: Users will be able to add deposit
//1: Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
//2. Enter username: techfiosdemo@gmail.com
//3. Enter password: abc123
//4. Click login button
//5. Click on Add Deposit button on Dashboard Page
//6. Click on Open An Account drop down to expand it,
//7. Click on any account name,
//8. Type any description,
//9. Type any amount,
//10. Click on submit button,
//Visually check to make sure the deposit posted

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTwo {
	@Test
	public void addTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Add Deposit')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Choose an Account')]")).click();
		driver.findElement(By.xpath("//option[@value='sharif']")).click();
		driver.findElement(By.xpath("//span[@id='select2-account-container']")).click();
		driver.findElement(By.id("description")).sendKeys("Initial Balance");
		String amount = String.valueOf(5555);
		driver.findElement(By.id("amount")).sendKeys(amount);
		driver.findElement(By.id("submit")).click();
	
	}
	
	

}
