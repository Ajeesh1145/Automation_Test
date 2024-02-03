package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1_Login {
	@Test
	public void openBrowser() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ajeesh_CP");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Ajeesh_2024");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.close();
	}
		
		@BeforeClass
		public void openBrowser1() {
		Reporter.log("--openBrowser--",true);		
		}
			@BeforeMethod
			public void LogintoAPP() {
			Reporter.log("--Login to app--",true);
			}
			@Test
			public void Enter_UserID(){
				Reporter.log("running Enter_UserID TC",true);
			}
			@Test
			public void Enter_Password()
			{
			Reporter.log("running Enter_Password TC",true);
			}
			@AfterMethod
			public void Submit_LoginBtn()
			{
			Reporter.log("--Submit_LoginBtn--",true);
			}
			@AfterClass
			public void close()
			{
			Reporter.log("--close--",true);
			}
}
