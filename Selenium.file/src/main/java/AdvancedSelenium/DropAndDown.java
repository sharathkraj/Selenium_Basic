package AdvancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/droppable/");

		driver.manage().window().maximize();
		
		//Actions class method to drag and drop		
				Actions builder = new Actions(driver);
				 
				WebElement from = driver.findElement(By.id("draggable"));
				 
				WebElement to = driver.findElement(By.id("droppable"));	 
				//Perform drag and drop
				builder.dragAndDrop(from, to).perform();
				
				//verify text changed in to 'Drop here' box 
				String textTo = to.getText();

				if(textTo.equals("Dropped!")) {
					System.out.println("PASS: Source is dropped to target as expected");
				}else {
					System.out.println("FAIL: Source couldn't be dropped to target as expected");
				}
			
				driver.close();

	}

}
