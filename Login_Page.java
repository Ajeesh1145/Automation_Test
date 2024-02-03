package Page_Test;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	
	//Define WebElement
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	//private WebElement UN = driver.findElement(By.xpath("//input[@id='userid']"));
		
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	//private WebElement PWD = driver.findElement(By.xpath("//input[@id='password']"));
	
	@FindBy(xpath="//button[text()='Login ']") private WebElement loginbtn;
	//private WebElement loginBtn=driver.findElement(By.xpath(""));

	//step2: create constructor
	public Login_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
		}
	
	//step3: create method
		public void Login_PageUserName() {
			UN.sendKeys("ZAX405");
		}
		public void Login_PagePassword() {
			PWD.sendKeys("Akshay@1437");
		}
		public void Login_PageLoginButton(){
			loginbtn.click();
}
}
