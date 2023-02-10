package DataDrivenXML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class CorrectUserName {

	@Test
	@Parameters({"username","password"})
	public void loginCorrectUserName(String UName, String PWord) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://hoa.fbconnectapp.link/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("identity")).sendKeys(UName);
		driver.findElement(By.name("password")).sendKeys(PWord);
		driver.findElement(By.id("submitButton")).click();
		driver.quit();
	}
}
