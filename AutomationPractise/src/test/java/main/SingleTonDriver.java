package main;

import java.util.concurrent.TimeUnit;

//Singletondriver- is a class that we make sure we pass the same instance of the obj
//here we wanna pass same driver
//Q- if we create a singleton driver class what would be the limitation for the testing?


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleTonDriver {
	
	public SingleTonDriver(WebDriver driver) {
		
	this.driver = driver;
	}
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	

	private WebDriver driver;
	
	public WebDriver openbrowser(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to(url);
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to(url);
			
		} else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to(url);
		
	} 
	else {
		System.out.println("Incorrect Driver....!");
		
			
				
			}
		return driver;
			
			
		}
		
	


	
}

