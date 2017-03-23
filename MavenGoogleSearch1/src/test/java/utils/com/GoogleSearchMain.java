package utils.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchMain {
	
	WebDriver driver;
	
	public WebDriver getUrlDriver(String siteaddress) {
		
          System.setProperty("webdriver.chrome.driver", "/Users/swapanpreetkaur/Downloads/chromedriver");
	      driver=new ChromeDriver();
	      driver.get(siteaddress);
	      return driver;
	}
	
	
	public WebElement getElement(String name) {
		WebElement element = driver.findElement(By.id("lst-ib"));
		return element;
	}
	
	
}





