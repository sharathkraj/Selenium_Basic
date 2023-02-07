package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptainmentExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://emptainment.com/");
		 
		driver.manage().window().maximize();
	

	}

}
