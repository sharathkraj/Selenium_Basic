package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableDataRowswise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		 
		driver.manage().window().maximize();
		
		WebElement mytable = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[2]/table"));
		
		int Row_count = mytable.findElements(By.tagName("tr")).size();
		 System.out.println("Number Of Rows = "+Row_count);
		 
		 int Col_count = mytable.findElements(By.tagName("th")).size();
		 System.out.println("Number Of Columns = "+Col_count);
		 
		 String from_to = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[2]/table")).getText();
	        System.out.println(from_to);
		 
	}

}
