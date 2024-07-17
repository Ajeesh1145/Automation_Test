package Ajeesh.Maven_Project;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Count_RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@ type='radio']"));
		System.out.println("Total Number of Radio Button"+radioButtonList.size());
		driver.close();
		
		

	}

}
