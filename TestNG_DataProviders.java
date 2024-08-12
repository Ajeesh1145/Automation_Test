package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_DataProviders {
	@DataProvider(name="searchDataSet")
	
	public Object[][] searchData()
	
	{
		Object[][] searchkeyword=new Object[3][2];
		
		searchkeyword[0][0]="India";
		searchkeyword[0][1]="Qutub Minar";
		
		searchkeyword[1][0]="Agra";
		searchkeyword[1][1]="Taj Mahal";
		
		searchkeyword[2][0]="Hydrabad";
		searchkeyword[2][1]="Charminar";
		return searchkeyword;
		
	}
	@Test(dataProvider="searchDataSet")
	
	public void TestCaseGoogleSearch(String country,String Monument)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		WebElement searchbox=driver.findElement(By.name("q"));
		
		
		//enter key combination of Country and Monument
		searchbox.sendKeys(country +" " + Monument);
		driver.findElement(By.name("btnK")).submit();
		}
		
}

