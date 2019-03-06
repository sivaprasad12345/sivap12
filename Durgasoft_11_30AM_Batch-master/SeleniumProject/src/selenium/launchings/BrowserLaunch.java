package selenium.launchings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://www.facebook.com");
		
		//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		//System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		InternetExplorerDriver driver2=new InternetExplorerDriver();
		driver2.get("https://www.snapdeal.com");
		
		
		//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
		//System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
		EdgeDriver driver3=new EdgeDriver();
		driver3.get("https://www.bestbuy.com");
		
		//webdriver.chrome.driver
		//webdriver.gecko.driver
		//webdriver.ie.driver
		//webdriver.edge.driver
		

	}

}
