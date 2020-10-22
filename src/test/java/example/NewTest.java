package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;	
	
  @Test
  public void testEasy() {
	  driver.get("http://demo.guru99.com/test/guru99home/");  
	  String title = driver.getTitle();				 
	  Assert.assertTrue(title.contains("Demo Guru99 Page")); 
	  System.out.println("MY Fiest Chnage in Poject to check in Git");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium -BrowserDrivers\\Drivers\\Mozilla Firfox\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
