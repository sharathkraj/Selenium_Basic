package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/select.xhtml");
		 
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		input.sendKeys("s");
		
		List<WebElement> tool = driver.findElements(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select/ui"));
		
		for (WebElement option : tool) {
		
			if(option.getText().equals("Selenium")) {
				option.click();
				break;
			}else
				System.out.println("Element not found");
			
		}

	}

}
