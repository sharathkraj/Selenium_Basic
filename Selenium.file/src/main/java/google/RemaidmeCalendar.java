package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemaidmeCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://atsdemo.4blabs.com/ReportTeam_DSR");
		 
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("U_LoginId"));
		username.sendKeys("superadmin");
		WebElement password = driver.findElement(By.name("U_Password"));
		password.sendKeys("sgs@123");
		WebElement login = driver.findElement(By.name("btn_login"));
		login.click();
		
		WebElement legacy = driver.findElement(By.xpath("//*[@id=\"liSuperAdminLegacyReport\"]/a"));
		legacy.click();
		
		WebElement teamdsr = driver.findElement(By.xpath("//*[@id=\"li4\"]/a"));
		teamdsr.click();
		
		WebElement calendar = driver.findElement(By.xpath("//*[@id=\"divSelectdateDSR\"]/span"));
		calendar.click();
		
		WebElement year = driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[2]"));
		year.click();
		
		WebElement selectyear = driver.findElement(By.xpath("/html/body/div/div[2]/table/thead/tr/th[2]"));
		selectyear.click();
		
		WebElement chooseyear = driver.findElement(By.xpath("/html/body/div/div[3]/table/tbody/tr/td/span[6]"));
		chooseyear.click();
		
		
		
		WebElement month = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td/span[9]"));
		month.click();
		
		WebElement date = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[2]/td[3]"));
		date.click();
		
		

	}

}
