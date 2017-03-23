package com.googlesearch.MavenGoogleSearch1;

import org.testng.annotations.Test;
import utils.com.GoogleSearchMain;



import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {	
	 
	
	 WebDriver driver;
	 WebElement element;
	 
	 //GoogleSearchMain gs;
	 
	/* @BeforeClass
	 
     public void setUp(String value) {
       // Launch browser and open application under test
		 driver=gs.webDriver(value);
	 }
*/
	
	 @Test  
	 @Parameters({"SiteAddress","name"})

	 public void OpenBrowser(String siteaddress,String name) {
		 
		  PropertyConfigurator.configure("log4j.properties");
		  Logger logger = Logger.getLogger("GoogleSearch");
		  logger.info(" *********** GOOGLESEARCH ***************");
	 	  GoogleSearchMain gs=new GoogleSearchMain();
	 	  driver=gs.getUrlDriver(siteaddress);
	 	  element = gs.getElement(name);
	      element.sendKeys(name);
	      element.submit();
	      
	   }
}







