package com.durgasoft.launching.chromebrowser;

public class TC_004 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		launch("chromebrowser");
		
		navigate("amazonurl");
		
		//String actval = driver.findElement(By.linkText("Customer Service")).getText();
		
		//driver.switchTo().frame(1);
		//String actval = driver.findElement(By.xpath("//a[@href='http://victorian.fortunecity.com/brambles/4/frames/']/font")).getAttribute("innerHTML").trim();
		
		//String expval="Hate Frames Page";
		
		type("amazonsearchtextbox_id", "value");
		
		String actval = getValue("amazonsearchtextbox_id","valuekey");
		
		String expval="sony";
		
		System.out.println("Actual :" + actval);
		System.out.println("Expected :" + expval);
		
		//if(actval.equals(expval))
		//if(actval.equalsIgnoreCase(expval))
		if(actval.contains(expval))
		//if(actval.contentEquals(expval))
			System.out.println("Both strings are matched....");
		else
			System.out.println("Both Strings are not Matched...");
	}

}
