package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://hoa.fbconnectapp.link/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("admin@fourbends.com");
		LoginPageObjects.password.sendKeys("Test1234");
		LoginPageObjects.loginButton.click();
		
		
		/*LoginPageObjects loginPageObjects = new LoginPageObjects();
		LoginPageObjects.username(driver).sendKeys("admin@fourbends.com");
		LoginPageObjects.password(driver).sendKeys("Test1234");
		LoginPageObjects.loginButton(driver).click();*/
		
		
	}
}
