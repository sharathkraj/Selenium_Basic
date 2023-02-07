package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		 
		driver.manage().window().maximize();
		
		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		datepicker.click();
		
		WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		nextbutton.click();
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a"));
		date.click();
		
		

	}

}
