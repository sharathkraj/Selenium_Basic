package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/broken_images");
		 
		driver.manage().window().maximize();
		
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
		
		if(brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
			
		}else {System.out.println("The image is not broken");}

}}