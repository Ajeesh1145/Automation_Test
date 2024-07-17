package Ajeesh.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile_RobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("D:\\ASD.txt");
	}
}