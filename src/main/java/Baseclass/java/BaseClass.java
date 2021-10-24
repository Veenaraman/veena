package Baseclass.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver launchBrowser(String browsername){ 
		switch(browsername) {
		case"chrome":
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 break;
	 default:
		 System.err.println("valid browser name");
	break;
}
		return driver;
	}
	public static void launchUrl(String url) {
		driver.get(url);	
	}
	public static String getCurrentURL1() {
	String url = driver.getCurrentUrl();
	return url;
	}
	public static String getTitle() {
		String Title = driver.getCurrentUrl();
		return Title;
	}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void btnclick(WebElement e) {
		e.click();
	}
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
		}	
}



