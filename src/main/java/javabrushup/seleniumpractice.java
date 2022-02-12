package javabrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class seleniumpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "E:/sumita/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement elt =driver.findElement(By.name("q") );
		elt.sendKeys("java interview question");
		elt.sendKeys(Keys.ENTER);
		
		
	}

}
