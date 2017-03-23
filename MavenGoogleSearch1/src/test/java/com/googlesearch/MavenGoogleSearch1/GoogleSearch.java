package com.googlesearch.MavenGoogleSearch1;

import org.testng.annotations.Test;
import utils.com.GoogleSearchMain;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {	
	 
	
	 WebDriver driver;
	 WebElement element;
	 Properties properties = new Properties();
	 FileInputStream fileInput;
     String fileName = "resource.properties";
	 GoogleSearchMain gs =new  GoogleSearchMain();
			
     @Test
     public void searchName() throws InterruptedException, IOException {
			
		         PropertyConfigurator.configure("log4j.properties");
				 Logger logger = Logger.getLogger("GoogleSearch");
				 logger.info(" *********** GOOGLESEARCH ***************");
				 logger.info(" *********** READING RESOURCE.PROPERTIES FILE ***************");
				 fileInput =gs.readFile(fileName);
				 properties.load(fileInput);
				 System.setProperty(properties.getProperty("driverName"),properties.getProperty("driverPath"));	
				 logger.info(" ***********OPENING BROWSER***************");
				 driver = gs.getDriver(); 
				 gs.openBrowser(properties.getProperty("urlLink"));
				 logger.info(" ***********FINDING NAME BY USING ID***************");
				 element = gs.findById(properties.getProperty("searchId"));
				 gs.enter(element, properties.getProperty("name"));
				}	
}

 






