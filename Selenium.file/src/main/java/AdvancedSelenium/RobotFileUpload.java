package AdvancedSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotFileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://my.monsterindia.com/create_account.html");

		driver.manage().window().maximize();
		
		StringSelection sel = new StringSelection("C:\\Users\\hp\\Desktop\\Docs");
		//C:\1.docx
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
				
		System.out.println("selection :::::" +sel);
		
Thread.sleep(2000);
		
		//Scroll down the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scroll(0,350)");
		 
		 Thread.sleep(5000);
		 
		// This will click on Browse button
		 driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
		 
		 System.out.println("Browse button clicked");
		 
		 // Create object of Robot class
		 Robot robot = new Robot();
		 Thread.sleep(1000);
		      
		  // Press Enter
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		 //Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
