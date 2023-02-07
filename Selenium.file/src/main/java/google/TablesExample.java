package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.leafground.com/table.xhtml;jsessionid=node0tvoe2lvml49715b3y2xabnnaq466309.node0");
		 
		driver.manage().window().maximize();
		
		//Locate table
		WebElement mytable = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_data\"]"));
		
		
		List<WebElement> columns = mytable.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of Columns "+columnCount);

		List<WebElement> rows = mytable.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println("Number of Rows "+rowsCount);
		
		WebElement getElement = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		String country = getElement.getText();
		System.out.println("Country "+country);
		
		

	}

}
