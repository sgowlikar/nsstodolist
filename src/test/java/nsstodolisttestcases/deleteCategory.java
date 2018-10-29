package nsstodolisttestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class deleteCategory {
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
	 public void DeleteCategory()
	 {
		  driver.findElement(By.name("todo[1]")).click();
		 
		  driver.findElement(By.xpath("//input[@type='submit' and @value='Remove']")).click();
		  
		   }
	 

	 @AfterTest
	 public void aftertest() {
	  driver.quit();
	  
	 }
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
