package google;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageUploadExample {

	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node01w7nb2bgpfpwvkmegrddzpcpj455581.node0");
		 
		driver.manage().window().maximize();
		
		System.out.println("Find button");
		
		WebElement uploadbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89_input\"]"));
		System.out.println("Button found");
		uploadbutton.sendKeys("C:\\Users\\hp\\Desktop\\Docs.txt");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"j_idt97:j_idt98_label\"]"));
		System.out.println("Image Button found");
		
        //button.click();
        
        //Runtime.getRuntime().exec("C:\\Users\\hp\\Downloads\\TestLeaf Logo.png");
		button.sendKeys("C:\\Users\\hp\\Downloads\\TestLeaf Logo.png");
		
		
        //StringSelection selection = new StringSelection("Downloads\\TestLeaf Logo.png");
		
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		System.out.println("Image found");
		
		WebElement imageupload = driver.findElement(By.xpath("//*[@id=\"j_idt97:j_idt98\"]/div[1]/button[1]"));
		imageupload.click();
	
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/


	}

}
