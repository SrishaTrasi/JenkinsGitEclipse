package JenkinsSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyFirstJen {
	public String url = "http://113.193.50.6:8080";
	public String expectedTitle="KSRTC";
	public WebDriver driver;
  @Test
  public void login() {
	  WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle);
	  System.out.println("login page verified by its title...");
		/*if(actualTitle.equals(expectedTitle)) {
			System.out.println("login page verified by its title");
		}
		else {
			System.out.println("login page is incorrect");
		}*/
		driver.close();
  }
  /*@BeforeTest
  public void BeforeTest() {
		
		
  }
  @AfterTest
  public void AfterTest() {
	  driver.close();
  }*/
}
