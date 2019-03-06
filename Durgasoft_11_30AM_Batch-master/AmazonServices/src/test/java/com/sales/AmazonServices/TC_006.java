package com.sales.AmazonServices;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_006 extends BasePage
{
	static PageUI page;
	
  @BeforeMethod
  public void startProcess() throws Exception 
  {
	  launch("chromebrowser");
	  navigate("automationurl");
	  
  }
  
  @Test(enabled=false)
  public void automationLogin() 
  {
	  page=new PageUI(driver);
	  page.login();
	  Assert.assertEquals(page.verifyLogin(), "Authentication failed.");
  }
  
  
  @Test
  public void automationRegistration() throws Exception
  {
	  page=new PageUI(driver);
	  page.customerRegistration();
  }

  @AfterMethod
  public void endProcess() 
  {
	  //driver.quit();
  }

}
