package AdvancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://docs.seleniumhq.org/");

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(5000);

	}

}
