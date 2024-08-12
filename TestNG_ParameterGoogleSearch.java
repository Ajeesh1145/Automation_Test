package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestNG_ParameterGoogleSearch {
@Parameters({"keyword"})
	@Test

	public void googleSearch(String searchdata)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement searchbox=driver.findElement(By.name("q"));
	searchbox.sendKeys(searchdata);
	Assert.assertEquals(searchdata, searchbox.getAttribute("value"));
	//driver.quit();
		}
}
