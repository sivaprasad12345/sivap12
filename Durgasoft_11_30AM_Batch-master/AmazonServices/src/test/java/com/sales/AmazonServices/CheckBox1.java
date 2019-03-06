package com.sales.AmazonServices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckBox1 extends BasePage
{
  
	@BeforeMethod(groups= {"Regression","Smoke"})
	@Parameters("browser")
	  public void beforeMethod(String btype) throws Exception 
	  {
		  launch(btype);
		  navigate("checkboxurl");
	  }
	  
	  
	@Test(groups= {"Regression","Smoke"})
	public void checkboxTest()
	{
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
	}
 

  @AfterMethod(groups= {"Regression","Smoke"})
  public void afterMethod() 
  {
	 driver.quit();
  }

}
