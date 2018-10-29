package nsstodolisttestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class addcategory {

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
	 public void addnewcategory()
	 {
		 driver.findElement(By.name("data")).sendKeys("Hockey");
	
	
		 
		 
	  Select mydrpdwn1 = new Select(driver.findElement(By.name("category")));
	  mydrpdwn1.selectByVisibleText("Personal");
	  
	  Select mydrpdwn2 = new Select(driver.findElement(By.name("due_day")));
	  mydrpdwn2.selectByIndex(6);
	  
	  Select mydrpdwn3 = new Select(driver.findElement(By.name("due_month")));
	  mydrpdwn3.selectByVisibleText("Nov");
	  
	  Select mydrpdwn4 = new Select(driver.findElement(By.name("due_year")));
	  mydrpdwn4.selectByIndex(1);
	  
	driver.findElement(By.xpath("//input[@type='submit' and @value='Add']")).click();
	
}
	 
	 @AfterTest
	 public void aftertest() {
	  driver.quit();
	  
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}