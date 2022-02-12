package javabrushup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import groovyjarjarantlr4.v4.parse.ANTLRParser.sync_return;


public class tocheckwait {

	private static final TimeUnit TimeUnit = null;
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 try {
			iframedemo();
			 
		 }catch(Exception e){
			 e.printStackTrace();
			 TakesScreenshot scrShot =((TakesScreenshot)driver);
			 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			 File DestFile=new File("E:/test.png");

             //Copy file at destination

			 System.out.println(SrcFile);

             FileUtils.copyFile(SrcFile, DestFile);
		 }finally {
			 driver.close();
			 System.out.println("i am inside finally"); 
		 }
		}

public static void iframedemo() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:/sumita/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();

	Thread.sleep(3000);
	
	
	/*
	 * driver.switchTo().frame((WebElement) By.xpath(
	 * "//*[@id=\"rt-showcase\"]/div/div[1]/div/div/div/div/div[2]/div/div/iframe"))
	 * ;
	 * 
	 * 
	 * WebElement er = driver.findElement(By.xpath("/html/body/p[1]"));
	 */
	
	
	//*************************************
	int size = driver.findElements(By.tagName("iframe")).size();
	
	for (int i=0;i<size;i++) {
		driver.switchTo().frame(i);
		System.out.println("Switched to frame " +i);
		try {
		WebElement er1 = driver.findElement(By.xpath("/html/body/p[1]"));
		System.out.println("written text= " + er1.getText());
		
		}catch(Exception e) {
			driver.switchTo().parentFrame();
			System.out.println("Exception for frame index" +i);
			
		}
	}
	
	
}
	
public static void  selenium_practice() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:/sumita/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
			
	 WebElement er = driver.findElement(By.name("q"));
	
	er.sendKeys("java interview questions");
	er.sendKeys(Keys.ENTER);
	
	
//	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
//	driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	//driver.findElement(By.xpath("//*[@id=\\\"rso\\\"]/div[1]/div/div[1]/div/a/h3")).sendKeys(selectLinkOpeninNewTab);
	
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3")).click();
	
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3")).click();
	
	int size = driver.findElements(By.tagName("iframe")).size();

	System.out.println("total frame" +size);
	
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/article/div[3]/div/div[1]/span[2]/span[1]")));
	
	driver.findElement(By.xpath("/html/body/div[1]/article/div[3]/div/div[1]/span[2]/span[1]")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/article/div[3]/div/div[1]/span[2]/span[1]")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	
	
	Thread.sleep(2000);
	//driver.close();
					

//	driver.switchTo().newWindow(WindowType.TAB).findElement(By.xpath("//*[@id=\\\"ibpp-header-left-section\\\"]/div[2]/div[1]/a[1]")).click();
	//driver.findElement(By.xpath("//*[@id=\"ibpp-header-left-section\"]/div[2]/div[1]/a[1]")).click();
/*
 * Wait<WebDriver> fluenewait = new
 * FluentWait<WebDriver>(driver).pollingEvery(5); Wait<WebDriver> fluentwait =
 * new FluentWait<WebDriver>(driver).withTimeout(new );
 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	Wait<WebDriver> fluentWait = new FluentWait(driver)
			.withTimeout(Duration.ofSeconds(3))
			.pollingEvery(Duration.ofSeconds(1))
			.ignoring(TimeoutException.class);

	
	 
	  fluentWait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				System.out.println("inside fluent wait");
				return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[1]/img123131231"));
			}
		});
				  
	
	
	driver.findElement(By.xpath("//*[@id=\"ibpp-header-left-section\"]/div[2]/div[1]/a[1]")).click();
	System.out.println("Complete");
	
	
}

}
