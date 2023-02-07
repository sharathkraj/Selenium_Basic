package google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConvertStringToInt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		 
		driver.manage().window().maximize();
		
		WebElement mytable = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table"));
		

		List<WebElement> allchange = mytable.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[4]/table//td[3]"));
		
		//System.out.println("found the column");
		
		List<Integer> noList = new ArrayList<Integer>();
		
		//System.out.println("Initialized the List");
		
		for (WebElement webElement : allchange) {
			String value =  webElement.getText().replace("m", "");
			//System.out.println(value);
			noList.add(Integer.parseInt(value));
			//System.out.println(noList);
			
		}
		
		System.out.println("Change List "+noList);
		
		int smallvalue = Collections.min(noList);
		System.out.println(smallvalue);
		

	}

}
