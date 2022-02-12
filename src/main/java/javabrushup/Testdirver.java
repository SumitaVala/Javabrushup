package javabrushup;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdirver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver", "E:/sumita/chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("https://www.nseindia.com/");
		 * 
		 * WebElement r = driver.findElement(By.id("header-search-input"));
		 * r.sendKeys("Reliance Industries Limited"); r.sendKeys(Keys.ENTER);
		 * System.out.println(r.getAttribute("id=\"quoteLtp\"")); // driver.close();
		 */
		 System.setProperty("webdriver.chrome.driver", "E:/sumita/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		
		driver.get("https://www.amazon.com/");
		WebElement r = driver.findElement(By.id("twotabsearchtextbox"));
		r.sendKeys("dabur");
		r.sendKeys(Keys.ENTER);
		
	}
	
	public void getdata() {
		
		
	}

}
