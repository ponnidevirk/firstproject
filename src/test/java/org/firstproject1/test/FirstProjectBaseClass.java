package org.firstproject1.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProjectBaseClass {
	
	public static WebDriver driver;
	
	//browser launch
public static WebDriver chromeLaunch() {
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
return driver;
}

//switch
		public static void browserLaunch(String browsername) {
		
		switch(browsername) {
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
			break;
		}}
			
			//url
			
		public static void urlLaunch(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		//get current url
				public static String GetCurrentUrl() {
					String url = driver.getCurrentUrl();
					return url;

				}
				//sendkeys
				public static void sendkeys(WebElement e, String data) {
					e.sendKeys(data);
					
				}
		
		
		//click
		public static void click(WebElement e) {
			e.click();
		}
		
		
		
		//action
		
		public static void drapAndDrop(WebElement from, WebElement to) {
			Actions a=new Actions(driver);
			
			a.dragAndDrop(from, to).perform();
			
		}
		
		public static void actclick() {
			Actions a=new Actions(driver);
			a.click().perform();

		}
		
		//Selectbyindex
		
		public static void selectByIndex(WebElement drp, int index) {
			
			Select s=new Select(drp);
			s.selectByIndex(index);

		}
		
		//quit
		public static  void quit() {
			driver.quit();
		
		}
		
		//switchtoindex
		public static void framesSwitch(int index) {
			
			driver.switchTo().frame(index);
		} 
		//implicitywait
		public static void impWait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, null);
		
			

		}
		
		
		//confirmAlert
		public static void confirmAlert() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			
		}
		
		//promptalert
		public static void promptAlert(String input) {
			
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(input);
			alert.accept();

		}
		
	


}