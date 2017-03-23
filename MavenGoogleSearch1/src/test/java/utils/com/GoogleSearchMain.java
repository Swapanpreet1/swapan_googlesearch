package utils.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchMain {
	
	
		 WebDriver driver;
		 FileInputStream fileInput;
		 WebElement element;
		
		public  WebDriver getDriver(){
			driver = new ChromeDriver();
			return driver;
		}
		
		public  void openBrowser(String url){
			driver.navigate().to(url);
		}
		
		public  FileInputStream readFile(String fileName) throws FileNotFoundException{
			fileInput = new FileInputStream(new File(fileName));
			return fileInput;
		}
		
		public  WebElement findById(String id){
			element =  driver.findElement(By.id(id));
			return element;
		}
		
		public  void enter(WebElement ele,String name){
			ele.sendKeys(name);
			ele.submit();
		}
		
}






