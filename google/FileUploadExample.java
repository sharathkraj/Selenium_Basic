package google;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node01w7nb2bgpfpwvkmegrddzpcpj455581.node0");
		 
		driver.manage().window().maximize();
		
		System.out.println("Find button");
		WebElement uploadbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89_input\"]"));
		System.out.println("Button found");
		uploadbutton.sendKeys("C:\\Users\\hp\\Desktop\\Docs.txt");
		
		/*uploadbutton.click();
		
		StringSelection selection = new StringSelection("C:\\Users\\hp\\Desktop\\Docs.txt");
		
		Robot robot = new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/

	}

}
