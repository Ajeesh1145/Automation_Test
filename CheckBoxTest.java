package Assertion_;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxTest {

public static void main(String[]args) {
	System.setProperty("webdriver.chromedriver", "D:\\Ajeesh\\WebDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	
	Assert.assertTrue(false);
		System.out.println(driver.findElement(By.xpath("//input[@type='radio']")).isSelected());
			
			
}
}
