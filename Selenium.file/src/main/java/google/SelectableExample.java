package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/list.xhtml");
		 
		driver.manage().window().maximize();
		List<WebElement> select = driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		int i = select.size();
		System.out.println(i);
		
		Actions act = new Actions(driver);
		//act.clickAndHold(select.get(0));
		//act.clickAndHold(select.get(1));
		//act.clickAndHold(select.get(4));
		
		
		
		act.keyDown(Keys.CONTROL).click(select.get(0)).click(select.get(1)).build().perform();
		
		WebElement move = driver.findElement(By.xpath("//*[@id=\"pickList\"]/div[3]/div/button[1]"));
		move.click();
		
		List<WebElement> cities = driver.findElements(By.xpath("//*[@id=\"j_idt111\"]/div/div[2]/ul/li"));
	
		act.keyDown(Keys.CONTROL).click(cities.get(0)).click(cities.get(1)).click(cities.get(3)).build().perform();
		
		WebElement downbutton = driver.findElement(By.xpath("//*[@id=\"j_idt111\"]/div/div[1]/button[4]"));
		downbutton.click();

	}

}
