package com.sales.AmazonServices;

public class TC_001 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		launch("chromebrowser");
		
		navigate("amazonurl");
		
		selectValue("amazondropdown_id", 15);
		
		type("amazonsearchtextbox_id", "value");
		
		click("amazonsearchbutton_xpath");
		
		
	}

}
