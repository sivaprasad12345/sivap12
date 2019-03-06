package com.sales.AmazonServices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class RadioButton1 extends BasePage
{

	@BeforeMethod(groups= {"Regression","Smoke"})
	@Parameters("browser")
	  public void beforeMethod(String btype) throws Exception 
	  {
		  launch(btype);
		  navigate("radiobuttonurl");
	  }
	
	
	@Test(groups= {"Regression","Smoke"})
	public void radioButtonTest()
	{
		WebElement radio=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod(groups= {"Regression","Smoke"})
  public void afterMethod() 
  {
	  driver.quit();
  }
	
}
