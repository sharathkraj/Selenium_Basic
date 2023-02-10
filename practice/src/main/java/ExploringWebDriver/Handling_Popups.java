package ExploringWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;

public class Handling_Popups {
@Test
@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();

	 driver.get("http://demo.guru99.com/test/delete_customer.php");
	 
	 driver.findElement(By.name("cusid")).sendKeys("53920");					
       driver.findElement(By.name("submit")).submit();			
       		
       // Switching to Alert        
       Alert alert = driver.switchTo().alert();		
       		
       // Capturing alert message.    
       String alertMessage= driver.switchTo().alert().getText();		
       		
       // Displaying alert message		
       System.out.println(alertMessage);	
       Thread.sleep(5000);
       		
       // Accepting alert		
       alert.accept();	

}  
}


