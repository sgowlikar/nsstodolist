package nsstodolisttestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class addColourCategory {
	WebDriver driver;
	 @BeforeTest
	 public void setup() throws Exception {
		 System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver.exe");	
		 
	  driver =new FirefoxDriver();     
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://localhost/dotdash-project/index.php");
	 }
	 
	 @Test
	 public void addcolourcategory()
	 {
	  driver.findElement(By.name("categorydata")).sendKeys("School");
	  
	  Select mydrpdwn = new Select(driver.findElement(By.name("colour")));
	  mydrpdwn.selectByVisibleText("Cyan");
	  
	 
	  driver.findElement(By.xpath("//input[@type='submit' and @value='Add category']")).click();
	
	 } 
	
	 @AfterTest
	 public void aftertest() {
	  driver.quit();
	  
	 }
	  
	 
	 
	 
}
