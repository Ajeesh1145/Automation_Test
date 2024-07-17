package Ajeesh.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TootTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String actualtooltip = driver.findElement(By.xpath("//a[@href = '/reg/']")).getAttribute("Title");
		
		String ExpectedToolTip = "Sign up for Facebook";
		
		if(actualtooltip.equals(ExpectedToolTip)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}

	}

}
