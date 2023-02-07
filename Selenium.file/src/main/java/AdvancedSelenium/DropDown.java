package AdvancedSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.toolsqa.com/automation-practice-form");

		driver.manage().window().maximize();
		
		//To select the drop down via ID locator
				Select oSelect = new Select(driver.findElement(By.id("continents")));
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//Select the option from drop down
				
				oSelect.selectByVisibleText("Europe");
				Thread.sleep(5000);

				
				//To print all the option from the dropdown
				List<WebElement> abc = oSelect.getOptions();
				
				int iListSize = abc.size();
				System.out.println( iListSize );
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//Providing the loop to print all the values from the drop down
				for(int i=0;i<=iListSize;i++){
					String sValue = oSelect.getOptions().get(i).getText();
					System.out.println(sValue);
					
					//Check fromt he lsit if any of our needed option exist
					if(sValue.equals("Africa")){
						
						oSelect.selectByIndex(i);
						Thread.sleep(5000);
						break;
					}
					
				}
			
				driver.quit();

	}

}
