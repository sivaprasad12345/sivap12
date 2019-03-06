package errorScreenShots;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotOnFailure {

WebDriver driver;
	

	@BeforeMethod
	public void setUp()
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com");
		//driver.get("https://try.powermapper.com/Demo/SortSite");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	
	@Test
	public void getScreenshot() throws Exception
	{
				
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());

			for(int i=0;i<links.size();i++)
			{
				if(!links.get(i).getText().isEmpty())
				{
				   String linkname=links.get(i).getText();
				   links.get(i).click();
				   
				   if(driver.getTitle().contains("Register: Mercury Tours"))
				  {
					   DateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
					   Date dt=new Date();
					   
					   File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					   FileUtils.copyFile(srcFile,new File("C:\\Users\\DELL\\Desktop\\Screenshots123\\" +linkname+ "_" +dateFormat.format(dt)+".png"));
				   }
				   
				   //driver.navigate().back();
				   links=driver.findElements(By.tagName("a"));
			    }
			}
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//Close browser
		driver.quit();
	}

}
