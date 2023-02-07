package google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		 
		driver.manage().window().maximize();
		
		//Locate table
		WebElement mytable = driver.findElement(By.xpath("//*[@id=\"j_idt154_content\"]/table"));
		
		List<WebElement> columns = mytable.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of Columns "+columnCount);

		List<WebElement> rows = mytable.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println("Number of Rows "+rowsCount);
		
		WebElement getElement = driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]"));
		String change = getElement.getText();
		System.out.println("Change "+change);
		
		List<WebElement> allchange = driver.findElements(By.xpath("//td[3]"));
		
		System.out.println("found the column");
		
		List<Integer> noList = new ArrayList<Integer>();
		
		System.out.println("Initialized the List");
		
		for (WebElement webElement : allchange) {
			String value =  webElement.getText().replace("%", "");
			System.out.println(value);
			noList.add(Integer.parseInt(value));
			System.out.println(noList);
			
		}
		
		//System.out.println("Change List "+noList);
		
		//int smallvalue = Collections.min(noList);
		//System.out.println(smallvalue);
		

	}

}
