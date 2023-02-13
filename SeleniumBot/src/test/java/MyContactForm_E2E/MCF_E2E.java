package MyContactForm_E2E;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MCF_E2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();

		 driver.get("https://www.mycontactform.com/");
		 
		WebElement username =  driver.findElement(By.name("user"));
		username.sendKeys("prabhu123"+Keys.TAB);
		
		WebElement password=  driver.findElement(By.name("pass"));
		 password.sendKeys("12345"+Keys.ENTER);
		 
		 WebElement newformwizard=   driver.findElement(By.xpath("//*[@id=\"user_bar\"]/ul/li[2]/a"));
		 newformwizard.click();
		 
		 // find position of new form wizard button
		 @SuppressWarnings("unused")
		WebElement getNewformPositionButton =  driver.findElement(By.xpath("//*[@id=\"user_bar\"]/ul/li[2]/a"));
		org.openqa.selenium.Point xypoint = getNewformPositionButton.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("X value is :"+xvalue+"Y value is:"+yvalue);
		
		
		// find the color of the start wizard button
		
		////*[@id="user_bar"]/ul/li[2]/a
		
		
		 WebElement buttonColor = driver.findElement(By.xpath("//*[@id=\"user_bar\"]/ul/li[2]/a"));
		 String color = buttonColor.getCssValue("background-color");
	     System.out.println("Button color is:"+color);	
		
		 
		 WebElement startwizard= driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/div/input"));
		 startwizard.click();
		 
		// find the size
		 
	     WebElement sizeButton = driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/div/input"));
		 int height=  sizeButton.getSize().getHeight();
         int width= sizeButton.getSize().getWidth();
         System.out.println("Button Height = "+height+"Button Width = "+width);
      
        
        
		 WebElement formname = driver.findElement(By.name("formname"));
		 formname.sendKeys("freshment?????Form");
		 WebElement webaddress = driver.findElement(By.id("referrer"));
		 webaddress.sendKeys("www.google.com");
		 
		 // Dropdown cases:
		 WebElement dropdowm1 = driver.findElement(By.id("format"));
		 Select option1 = new Select(dropdowm1);
		 option1.selectByIndex(0);
		 
		 WebElement dropdowm2 = driver.findElement(By.id("empty"));
		 Select option2 = new Select(dropdowm2);
		 option2.selectByValue("0");
		 
		 WebElement dropdowm3 = driver.findElement(By.id("printurl"));
		 Select option3 = new Select(dropdowm3);
		 option3.selectByVisibleText("Yes");
		 
		List<WebElement> listOfOptions =  option3.getOptions();
		int size = listOfOptions.size();
		System.out.println("Number of options: "+size);
		
		 WebElement next = driver.findElement(By.id("Submit"));
		 next.click();
		
		 WebElement onePredefined = driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/div[1]/label"));
		 onePredefined.click();
		 
		 WebElement next1 = driver.findElement(By.id("Submit"));
		 next1.click();
		 
		 WebElement next2 = driver.findElement(By.id("Submit"));
		 next2.click();
	
	    WebElement allowType = driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/div[2]/label"));
	    allowType.click();
	    
	    WebElement next3 = driver.findElement(By.id("Submit"));
		 next3.click();
	    
		 WebElement subject =  driver.findElement(By.name("subjectvalue"));
			subject.sendKeys("Request for classes");
			
			WebElement next4 = driver.findElement(By.id("Submit"));
			 next4.click();
			 
		WebElement no= driver.findElement(By.name("autores"));
		no.click();
		
		WebElement next5 = driver.findElement(By.id("Submit"));
		 next5.click();
			 
		@SuppressWarnings("unused")
		WebElement sendEmail = driver.findElement(By.name("autoemail"));
		sendEmail.sendKeys("nandhini@gmail.com");
		
		WebElement autoRes = driver.findElement(By.name("autosub"));
		autoRes.sendKeys("Reply");
		
		WebElement response = driver.findElement(By.name("autotext"));
		response.sendKeys("Thanks for the application");
		
		WebElement next6 = driver.findElement(By.id("Submit"));
		 next6.click();
		 
		 WebElement question = driver.findElement(By.id("questionsetup"));
		 Select options = new Select(question);
		 options.selectByValue("1");
		 
		 WebElement next7 = driver.findElement(By.id("Submit"));
		 next7.click();
		 
		 //WebElement numques = driver.findElement(By.id("numquestions"));
			//numques.sendKeys("6");
			
			
		
			 WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/div[5]/label"));
			 checkbox1.click();
			 
			 //WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/div[2]"));
			 //checkbox2.click();
			 
			 WebElement next8 = driver.findElement(By.id("Submit"));
			 next8.click();
			 
			 WebElement basicContact = driver.findElement(By.name("tempid"));
			 basicContact.click();
			
			 
			 WebElement next9 = driver.findElement(By.id("Submit"));
			 next9.click();
			 
			 WebElement next10 = driver.findElement(By.id("Submit"));
			 next10.click();
			 
			 WebElement subLayout = driver.findElement(By.id("subjectlayout"));
			 Select choice = new Select(subLayout);
			 choice.selectByValue("2");
			 
			 WebElement emailLayout = driver.findElement(By.id("emailfromlayout"));
			 Select choice1 = new Select(emailLayout);
			 choice1.selectByValue("2");
			 
			 WebElement next11 = driver.findElement(By.id("Submit"));
			 next11.click();
			 
			 WebElement redirect = driver.findElement(By.id("redirectpage"));
			 redirect.sendKeys("www.gmail.com");
			 
			 WebElement next12 = driver.findElement(By.id("Submit"));
			 next12.click();
			 
			 WebElement next13 = driver.findElement(By.id("Submit"));
			 next13.click();
			 
			 WebElement font = driver.findElement(By.id("font"));
			 Select choices = new Select(font);
			 choices.selectByValue("Courier");
			 
			 WebElement fontcolor = driver.findElement(By.id("fontcolor"));
			 fontcolor.sendKeys("#204020");
			 
			 WebElement fontsize = driver.findElement(By.id("fontsize"));
			 fontsize.sendKeys("6");
			 
			 WebElement fontStyle = driver.findElement(By.name("bold"));
			 fontStyle.click();
			 
			 WebElement fontStyle1 = driver.findElement(By.name("italic"));
			 fontStyle1.click();
			 
			 WebElement fontStyle2 = driver.findElement(By.name("underline"));
			 fontStyle2.click();
			 
			 WebElement next14 = driver.findElement(By.id("Submit"));
			 next14.click();
			 
			 WebElement next15 = driver.findElement(By.id("Submit"));
			 next15.click();
			 
			 WebElement next16 = driver.findElement(By.id("Submit"));
			 next16.click();
			 
			 WebElement fieldborder = driver.findElement(By.id("fieldbordersize"));
			 fieldborder.sendKeys("4");
			 
			 WebElement next17 = driver.findElement(By.id("Submit"));
			 next17.click();
			 
			 WebElement next18 = driver.findElement(By.id("Submit"));
			 next18.click();
			 
			 WebElement linkStyle = driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/div[2]/input"));
			 linkStyle.click();
			 
			 WebElement next19 = driver.findElement(By.id("Submit"));
			 next19.click();
			 
			 WebElement next20 = driver.findElement(By.id("Submit"));
			 next20.click();
			 
			 WebElement formbutton = driver.findElement(By.id("printbut"));
			 formbutton.click();
			 
			 WebElement next21 = driver.findElement(By.id("Submit"));
			 next21.click();
			 
			 WebElement category = driver.findElement(By.id("sitecat"));
			 Select choose = new Select(category);
			 choose.selectByValue("6");
			 
			 WebElement next22 = driver.findElement(By.id("Submit"));
			 next22.click();
			 
			 WebElement logOut = driver.findElement(By.xpath("//*[@id=\"user_bar\"]/ul/li[1]/a"));
			 logOut.click();
	
		
	}
}
