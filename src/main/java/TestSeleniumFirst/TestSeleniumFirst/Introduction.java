package TestSeleniumFirst.TestSeleniumFirst;

import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Invoking Browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		//driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
;	}

}
