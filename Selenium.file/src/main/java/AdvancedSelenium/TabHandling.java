package AdvancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=Mu-PVv2NJqnG8Ae06af4Bg&gws_rd=ssl");
		 
		driver.manage().window().maximize();
	//Open a new tab using Ctrl + t
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	//driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

	//driver.findElement(By.cssSelector("body")).sendKeys(Keys.SHIFT,Keys.ALT);

	Thread.sleep(6000);
	String url = "http://docs.seleniumhq.org/";
	driver.navigate().to(url);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"w");
	//Switch between tabs using Ctrl + \t
	//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		}


	}


