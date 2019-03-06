package com.sales.AmazonServices;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependencyDemo 
{
	
  @Test(priority=1,groups= {"Regression"})
  public void orange() 
  {
	  System.out.println("orange");
  }
  
  @Test(priority=2,dependsOnMethods= {"orange"},groups= {"Regression"})
  public void white() 
  {
	  System.out.println("white");
  }
  

  @Test(priority=3,dependsOnMethods= {"white"},groups= {"Regression"})
  public void blue() 
  {
	  System.out.println("blue");
	  Assert.fail();
	  System.out.println("iam end....");
  }
  
  @Test(priority=4,dependsOnMethods= {"blue"},groups= {"Regression"})
  public void green() 
  {
	  System.out.println("green");
  }
}
