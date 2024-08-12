package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGDemo {
	@Test
public void VerifyPageTitle(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String expectedTitle = "Google";
		String actualTile = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTile);
		driver.quit();
		
		
		
		
		
	}

}
