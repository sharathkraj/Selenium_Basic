package DataProvidersTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {

	String [][] data= {
			{"admin@fourbends.com","Test"},
			{"admin","Test1234"},
			{"admin","Test"},
			{"admin@fourbends.com","Test1234"}
	};
	
	@DataProvider(name="LoginData")
	public String[][] loginDataProvider() {
		return data;
	}
		
	
	@Test(dataProvider = "LoginData")
	
	public void loginBothCorrect(String UName, String PWord) {
		
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
