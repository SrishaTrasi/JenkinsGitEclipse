package JenkinsSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class FirstJen {
	static String url = "http://182.73.115.122:8080";
	static String expectedTitle="KSRTC";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("login page verified by its title");
		/*if(actualTitle.equals(expectedTitle)) {
			System.out.println("login page verified by its title");
		}
		else {
			System.out.println("login page is incorrect");
		}*/
	}

}
