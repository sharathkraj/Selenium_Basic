package DataProvidersTestNG;

import java.io.FileInputStream;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginwithExcel {

	Object [][] data= null;
	WebDriver driver;
	
	@DataProvider(name="LoginData")
	public String[][] loginDataProvider() {
		data = getExcelData();
		
		return data;
	}
		
	public String[][] getExcelData() {
		FileInputStream excel = new FileInputStream("C:\\Users\\hp\\Desktop\\LoginData.xls");
		
		Workbook workbook = workbook.getWorkbook(excel);
		
		Sheet sheet = workbook.getSheet(0);
		
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		String testData[][] = new String[rowCount-1][columnCount];
		for(int i=1;i<rowCount;i++)
			for(int j=0;j<columnCount;j++)
		{
				testData[i-1][j] = sheet.getCell(j,i).getContents;
			
		}
		
		@BeforeTest
		public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("http://hoa.fbconnectapp.link/");
			
			driver.manage().window().maximize();
		}
			
		@AfterTest
		public void afterTest() {
		
			driver.quit();
		}
	}
	@Test(dataProvider = "LoginData")
	
	public void loginBothCorrect(String UName, String PWord) {
		
		driver.findElement(By.name("identity")).sendKeys(UName);
		driver.findElement(By.name("password")).sendKeys(PWord);
		driver.findElement(By.id("submitButton")).click();
		
}
}
