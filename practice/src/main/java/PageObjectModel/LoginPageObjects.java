package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(name="identity")
	public static WebElement username;
	
	@FindBy(name= "password")
	public static WebElement password;
	
	@FindBy(id="submitButton")
	public static WebElement loginButton;
	

	/*public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("identity"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.id("submitButton"));
	}*/
}
