package Page_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_facebook {
	
	//Define WebElement
		@FindBy(xpath="//input[@id='email']") private WebElement UN;
		@FindBy(xpath="//input[@id='pass']") private WebElement PWD;
		@FindBy(xpath="//button[@name='login']") private WebElement LoginBtn;
		
		//step2: create constructor
		public Login_facebook(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//step3: create method
		public void Login_facebookUserName() {
			UN.sendKeys("9895590659");
		}
		
		public void Login_facebookPassword() {
			PWD.sendKeys("Ajeesh@123");
		}
		public void Login_facebookLoginButton(){
			LoginBtn.click();

		}
}
