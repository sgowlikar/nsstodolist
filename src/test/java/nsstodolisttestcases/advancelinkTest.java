package nsstodolisttestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class advancelinkTest {
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
	 public void checkadvancelinkisclickabe()
	 {
	  driver.findElement(By.tagName("a")).click();
}

	 @AfterTest
	 public void aftertest() {
	  driver.quit();
	  
	 }
	  
}