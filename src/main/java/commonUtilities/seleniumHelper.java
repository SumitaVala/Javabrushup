package commonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumHelper {
	static ChromeDriver driver ;
	
public static ChromeDriver startbrowser(String url) {

	System.setProperty("webdriver.chrome.driver", "E:/sumita/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();	
	driver.get(url);
	return driver;
}


public static void putdata_text(ChromeDriver driver,  String searchkey) {
	driver.findElement(By.name("q")).sendKeys(searchkey + Keys.ENTER);	
	driver.close();
}


}
