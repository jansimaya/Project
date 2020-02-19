package org.amazon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Cli {
	static WebDriver driver;
	@BeforeClass
	public void beforeclass() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\jansirar\\eclipse-workspace\\Testng\\dri\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public void afterclass() {
		driver.quit();
	}
	
	
	@Test
	public void test() {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("jansi");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("jansi2019");
	}
	@Test
	public void abc() {
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
	}





	}


