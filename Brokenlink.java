package Ajeesh.Maven_Project;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Brokenlink {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//wait for 10seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.deadlinkcity.com/");

		//find hyperlinks
				List<WebElement> linklist=driver.findElements(By.tagName("a"));
				int resCode=200;//2xx response code is valid link
				int brokenLinkcount=0;System.out.println("Total link on page:"+linklist.size());
				
				for(WebElement element:linklist)
				{
					String url=element.getAttribute("href");
					try
					{
						URL urlLink=new URL(url);
						HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();
						huc.setRequestMethod("HEAD");
						huc.connect();
						resCode=huc.getResponseCode();
						if(resCode>=400)
						{
							System.out.println(url+"broken link");
							brokenLinkcount++;
						}
						 
					}catch(MalformedURLException e)
					{
				}
					catch(Exception e)
					{
			}
				System.out.println("total broken link:"+brokenLinkcount);
		}}}
