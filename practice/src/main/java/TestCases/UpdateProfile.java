package TestCases;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.UpdateProfilePageObject;

public class UpdateProfile {

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
		
		PageFactory.initElements(driver, UpdateProfilePageObject.class);
		UpdateProfilePageObject.myprofile.click();
	    driver.findElement(By.xpath("//*[text()[contains(.,'Edit Profile')]]")).click();
		//UpdateProfilePageObject.editprofile.click();
		UpdateProfilePageObject.phoneNumber.clear();
		UpdateProfilePageObject.phoneNumber.sendKeys("9988776655");
		UpdateProfilePageObject.saveuser.click();
		UpdateProfilePageObject.myprofile.click();
	    driver.findElement(By.xpath("//*[text()[contains(.,'Logout')]]")).click();
		
		//LoginPageObjects loginPageObjects = new LoginPageObjects();
		/*LoginPageObjects.username(driver).sendKeys("admin@fourbends.com");
		LoginPageObjects.password(driver).sendKeys("Test1234");
		LoginPageObjects.loginButton(driver).click();
		
		UpdateProfilePageObject.myprofile(driver).click();
		UpdateProfilePageObject.editprofile(driver).click();
		UpdateProfilePageObject.phoneNumber(driver).sendKeys("9876543210");
		UpdateProfilePageObject.saveuser(driver).click();*/
		
}
}