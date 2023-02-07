package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		 
		driver.manage().window().maximize();
		
		WebElement optionsfrom = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement todebit = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
        Actions act = new Actions(driver);
		
		act.clickAndHold(optionsfrom);
		act.moveToElement(todebit);
		act.release(todebit);
		act.build().perform();
		
		WebElement amountFrom = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amountTo = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		act.clickAndHold(amountFrom);
		act.moveToElement(amountTo);
		act.release(amountTo);
		act.build().perform();
		
		
		

	}

}
