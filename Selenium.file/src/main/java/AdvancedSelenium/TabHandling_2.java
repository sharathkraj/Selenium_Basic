package AdvancedSelenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TabHandling_2 {

	public static void main(String[] args) {
		/*private WebDriver driver;
		@Test
		public void testTabs() {
		driver = new FirefoxDriver();
		driver.get("https://business.twitter.com/start-advertising");
	    assertStartAdvertising();

	    // considering that there is only one tab opened in that point.
	    String oldTab = driver.getWindowHandle();
	    driver.findElement(By.linkText("Twitter Advertising Blog")).click();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
	    assertAdvertisingBlog();

	    // Do what you want here, you are in the new tab

	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
	    assertStartAdvertising();

	    // Do what you want here, you are in the old tab
	}
	}
}

	private void assertStartAdvertising() {
	    Assert.assertEquals("Start Advertising | Twitter for Business", driver.getTitle());
	}

	private void assertAdvertisingBlog() {
		Assert.assertEquals("Twitter Advertising", driver.getTitle());
	
	}*/
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.in//");
		 
		driver.manage().window().maximize();
		
		String currentHandle= driver.getWindowHandle();
		// Searching for Headphones
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Headphones",Keys.ENTER);
		System.out.println("done");

		//Clicking on search button
		//String UrlToClick=driver.findElement(By.xpath("//span[contains(text(),'Infinity (JBL) Glide 500 Wireless Headphones with ')]")).getAttribute("href");
	
	}
}

