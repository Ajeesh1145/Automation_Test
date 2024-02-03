package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Normal_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000); 
		driver.close();


	}

}
