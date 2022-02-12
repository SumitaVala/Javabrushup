package javabrushup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.codehaus.groovy.control.io.AbstractReaderSource;
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

public class practiceforFrame {

	static WebDriver driver;
	//static WebElement element;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		  try { 
			  defineDriver(); 
			  WindowHandle_demo();
			  System.out.println("Successful"); 
		  }
		  catch (Exception e)
		  { // TODO: handle exception
			  e.printStackTrace(); 
			  TakesScreenshot scrshot = ((TakesScreenshot)driver);
			  File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
			  File decfile = new File("E:/sumita/testamazon.png");

			  FileUtils.copyFile(scrfile, decfile);
		  }
			/*
			 * finally {
			 * 
			 * driver.close(); }
			 */
	}

	public static void defineDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:/sumita/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");

		System.setProperty("webdriver.chrome.driver","E:/sumita/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		//driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.manage().window().maximize();

		Thread.sleep(2000);

		int framesize = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frame = " + framesize);

		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("dabur",Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")));
		
		System.out.println("Expllicit wait");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
		driver.findElement(By.name("submit.add-to-cart")).click();
		System.out.println("Successfully added in cart");

		/*
		 * int framesize1 = driver.findElements(By.tagName("iframe")).size();
		 * System.out.println("Total Frame = " + framesize);
		 */

		Wait<WebDriver> fluwait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(3))
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(TimeoutException.class);
		
		fluwait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				System.out.println("Inside Fluent Wait");
				return driver.findElement(By.id("sw-atc-details-single-container"));				
			}

		});

		//driver.navigate().back();
		//driver.navigate().to("https://www.amazon.com/");
	}

	public static void WindowHandle_demo() {

		String parent = driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		driver.navigate().forward();
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();

		if(!parent.equals(child_window))
		{
			driver.switchTo().window(child_window);
	
			System.out.println(driver.switchTo().window(child_window).getTitle());
	
			driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		System.out.println("Inside Window handle method");

	}

	
}
