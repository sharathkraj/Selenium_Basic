package google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://demo.guru99.com/test/");
		 
		driver.manage().window().maximize();
		// Using TextBox
		
		WebElement date = driver.findElement(By.name("bdaytime"));
		date.sendKeys("09061992");
		date.sendKeys(Keys.TAB);
		date.sendKeys("0900PM");
		
		
		
		
	}

}
