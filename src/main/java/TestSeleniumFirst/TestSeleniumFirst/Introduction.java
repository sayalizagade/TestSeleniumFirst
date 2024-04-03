package TestSeleniumFirst.TestSeleniumFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
	
public static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		//driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		System.out.println("TestSayali");	
		
	}

}
