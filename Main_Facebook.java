package Page_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Login_facebook Login = new Login_facebook(driver);
		Login.Login_facebookUserName();
		Login.Login_facebookPassword();
		Login.Login_facebookLoginButton();
	}

}
