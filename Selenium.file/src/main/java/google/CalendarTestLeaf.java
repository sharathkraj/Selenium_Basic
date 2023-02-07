package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTestLeaf {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.leafground.com/calendar.xhtml;jsessionid=node0jq411qpg50b519zv5owhcfhac469735.node0");
		 
		driver.manage().window().maximize();
		
		WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[1]/div[1]/div/button[2]"));
		nextbutton.click();
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[2]/td[3]/div"));
		date.click();
		
		System.out.println("date picked");
		
		//WebElement title = driver.findElement(By.cssSelector("Title"));
		//title.sendKeys("TestLeaf Calendar");
		
		WebElement savebutton = driver.findElement(By.xpath("//*[@id=\"j_idt87:addButton\"]/span[2]"));
		savebutton.click();
		System.out.println("saved");

	}

}
