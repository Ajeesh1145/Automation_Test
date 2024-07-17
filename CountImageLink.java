package Ajeesh.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		//find wbelement image link open cart
		driver.findElement(By.xpath("//img[@title = 'OpenCart - Demo']"));
		
		//verify the title of the current page witth expected homepage
		if(driver.getTitle().equals("OpenCart - Demo"))
		{
			System.out.println("Test Passed!");
		}
		driver.close();
	}

}
