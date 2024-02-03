package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest_Annotations {
	public String BaseURL = "https://www.facebook.com/";
	public WebDriver driver;
	
	@BeforeTest
	public void SetbaseURL() {
	driver = new ChromeDriver();
	driver.get(BaseURL);
	}
	@Test
	public void VerifyHomePageTitle() {
		String expectedTitle = "Log in to Facebook";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void UserName() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("AjeeshCP");
	}
	@Test
	public void Password() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Ajeesh@123");
	}
	@Test
	public void Login() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@AfterTest
	public void EndSession() {
		driver.quit();
	}
}
