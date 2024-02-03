package Page_Test;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Main_Page {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Login_Page Login = new Login_Page(driver);
		
		Login.Login_PageUserName();
		Thread.sleep(3000);
		Login.Login_PagePassword();
		Thread.sleep(3000);
		Login.Login_PageLoginButton();
	}

}
