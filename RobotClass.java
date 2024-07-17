package Ajeesh.Maven_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		WebElement button=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions act=new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb=new Robot();
		
		
		rb.delay(20000);
		//delay 2secondsC:\suraj123\suraj 2.txt
		
		//copy file to clipboard
		StringSelection ss=new StringSelection("D:\\ASD.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		//perform control + V action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_ENTER);


	}

}
