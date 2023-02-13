package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfilePageObject {
	WebDriver driver;
	
	@FindBy(name="identity")
	public static WebElement username;
	
	@FindBy(name= "password")
	public static WebElement password;
	
	@FindBy(id="submitButton")
	public static WebElement loginButton;
	
	@FindBy(id="dropdownMenu2")
	public static WebElement myprofile;
	
	//@FindBy(xpath="//*[@id=\\\"collapsingNavbar\\\"]/ul/div/div/a[1]")
	//public static WebElement editprofile;
	
	@FindBy(id="phone")
	public static WebElement phoneNumber;
	
	@FindBy(name = "submit")
	public static WebElement saveuser;

	/*public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("identity"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.id("submitButton"));
	}
	
	
	public static WebElement myprofile(WebDriver driver ) {
		return driver.findElement(By.id("dropdownMenu2"));
			
	}
	
	public static WebElement editprofile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"collapsingNavbar\"]/ul/div/div/a[1]"));
		
	}
	
	public static WebElement phoneNumber(WebDriver driver) {
	
		return driver.findElement(By.id("phone"));
		
	}
	
	public static WebElement saveuser(WebDriver driver) {
		return driver.findElement(By.name("submit"));
	}*/
}
