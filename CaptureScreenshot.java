package Ajeesh.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Ajeesh\\eclipse-workspace\\Maven_Project\\Screenshot\\FB.JPEG");
		
		FileUtils.copyFile(src, dest);
		
	}

}
