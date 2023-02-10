package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEg {
	
 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/radio-button");

		driver.manage().window().maximize();
		
		driver.findElement(By.name("like")).click();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Nandhini");
		driver.findElement(By.className("mr-sm-2 form-control")).sendKeys("jasminejmg7@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Madurai");
		driver.findElement(By.className("form-control")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
}
}
