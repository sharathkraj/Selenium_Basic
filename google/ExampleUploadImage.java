package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleUploadImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://imgbb.com/");
		 
		driver.manage().window().maximize();
		
		WebElement startupload = driver.findElement(By.xpath("//*[@id=\"top-bar\"]/div/ul[2]/li[1]"));
		startupload.click();
		System.out.println("Start Image upload button clicked");
		WebElement addImage = driver.findElement(By.xpath("//*[@id=\"anywhere-upload\"]/div[1]/div/div[1]/div/div[1]/span"));
		System.out.println("Image upload button found");
		addImage.sendKeys("Downloads\\TestLeaf Logo.png");
		System.out.println("Button found");
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"anywhere-upload-submit\"]/div[1]/button"));
		uploadButton.click();
		System.out.println("Image uploaded");

	}

}
