package com.durgasoft.launching.chromebrowser;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

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
		else if(loadData(browser).equalsIgnoreCase("FIREFOX"))
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
	}
	
	
	public static void navigate(String url) throws Exception 
	{
		//driver.get(url);
		driver.navigate().to(loadData(url));
	}
	
	public static void type(String keyLocator, String dataKey) throws Exception 
	{
		//driver.findElement(By.id(loadData(keyLocator))).sendKeys(loadData(dataKey));
		getElement(keyLocator).sendKeys(loadData(dataKey));
	}
	
	public static String getValue(String keyLocator, String key) throws Exception
	{
		return getElement(keyLocator).getAttribute(loadData(key));
	}
	
	public static WebElement getElement(String keyLocator) throws Exception 
	{
		WebElement  element=null;
		
		if(keyLocator.endsWith("_id"))
			element=driver.findElement(By.id(loadData(keyLocator)));
		else if(keyLocator.endsWith("_name"))
			element=driver.findElement(By.name(loadData(keyLocator)));
		else if(keyLocator.endsWith("_xpath"))
			element=driver.findElement(By.xpath(loadData(keyLocator)));
		else if(keyLocator.endsWith("_link"))
			element=driver.findElement(By.linkText(loadData(keyLocator)));
		else
			System.out.println("No locator is matched....");
		return element;
		
	}

	public static void click(String keyLocator) throws Exception 
	{
		getElement(keyLocator).click();
	}
	
	public static void selectValue(String keyLocator, int keyItem) throws Exception
	{
		//getElement(keyLocator).sendKeys(loadData(keyItem));
		WebElement ele = getElement(keyLocator);
		Select s=new Select(ele);
		s.selectByIndex(keyItem);
	}
	

}
