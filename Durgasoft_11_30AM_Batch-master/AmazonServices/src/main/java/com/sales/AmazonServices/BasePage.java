package com.sales.AmazonServices;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	
	public static WebDriver driver;
	public static String path="./testdata.properties";
	public static String logPath="./log4j.properties";
	
	static
	{
		PropertyConfigurator.configure(logPath);
		System.out.println("iam default static block");
	}
	
	public static String loadData(String key) throws Exception
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(path);
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	
	public static void launch(String browser) throws Exception
	{
		if(loadData(browser).equalsIgnoreCase("CHROME"))
		{
			driver=new ChromeDriver();
		}
		else if(loadData(browser).equalsIgnoreCase("ff"))
		{
			driver=new FirefoxDriver();
		}
		else if(loadData(browser).equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else if(loadData(browser).equalsIgnoreCase("EDGE"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}
	
	
	public static void navigate(String url) throws Exception 
	{
		//driver.get(url);
		driver.navigate().to(loadData(url));
	}
	
	public static void type(WebElement keyLocator, String dataKey) throws Exception 
	{
		//driver.findElement(By.id(loadData(keyLocator))).sendKeys(loadData(dataKey));
		getElement(keyLocator).sendKeys(loadData(dataKey));
	}
	
	public static String getValue(WebElement keyLocator, String key) throws Exception
	{
		return getElement(keyLocator).getAttribute(loadData(key));
	}
	
	public static WebElement getElement(WebElement keyLocator) throws Exception 
	{
		WebElement  element=null;
		String loc = keyLocator.toString();
		if(loc.endsWith("_id"))
			element=driver.findElement(By.id(loc));
		else if(loc.endsWith("_name"))
			element=driver.findElement(By.name(loc));
		else if(loc.endsWith("_xpath"))
			element=driver.findElement(By.xpath(loc));
		else if(loc.endsWith("_link"))
			element=driver.findElement(By.linkText(loc));
		else
			System.out.println("No locator is matched....");
		return element;
		
	}

	public static void click(WebElement keyLocator) throws Exception 
	{
		getElement(keyLocator).click();
	}
	
	public static void selectValue(WebElement keyLocator, int keyItem) throws Exception
	{
		//getElement(keyLocator).sendKeys(loadData(keyItem));
		//WebElement ele = getElement(keyLocator);
		Select s=new Select(keyLocator);
		s.selectByIndex(keyItem);
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	public String verifyTitle() 
	{
		return driver.getTitle();
		
	}
	
	public void elementWait(WebElement element,int timeInSeconds)
	{
		WebDriverWait wait=new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public int ranNumber() 
	{
		Random r=new Random();
		int rnum=r.nextInt(99999);
		return rnum;
	}
	

}
