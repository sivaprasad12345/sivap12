package com.durgasoft.launching.chromebrowser;

import org.apache.log4j.Logger;

public class TC_003 extends BasePage
{
	
	private static final Logger log=Logger.getLogger(TC_003.class.getName());

	public static void main(String[] args) throws Exception 
	{
		
		launch("chromebrowser");
		log.info("Opened the Browser :" + loadData("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigated to url : " + loadData("amazonurl"));
		
		selectValue("amazondropdown_id",15);
		log.info("Selected item : 15 index  by using Locator : - "+ loadData("amazondropdown_id"));
		
		type("amazonsearchtextbox_name1","value");
		log.info("Entered the value : "+ loadData("value") + " By using locator :- " + loadData("amazonsearchtextbox_name"));
		
		click("amazonsearchbutton_xpath");
		log.info("Clicked on Search Button By using Locator  :- " + loadData("amazonsearchbutton_xpath"));
	}

}
