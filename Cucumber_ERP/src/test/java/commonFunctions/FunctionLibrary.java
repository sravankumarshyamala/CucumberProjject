package commonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class FunctionLibrary
{
	public static WebDriver driver;
	public static Properties conpro;
	
	// method to browser launch
	
	public static WebDriver startBrowser() throws FileNotFoundException, IOException
	{
		// create an object
		conpro = new Properties();
		//load property method
		conpro.load(new FileInputStream("./PropertyFiles/Environment.properties"));
		if(conpro.getProperty("Browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(conpro.getProperty("Browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			Reporter.log("Browser is not matching",true);
		}
		return driver;
	}
	
	// method for open url
	public static void openurl()
	{
		driver.get(conpro.getProperty("Url"));
	}
	
	// method for wait element
	
	public static void waitForElement(String LocatorType,String LocatorValue,String MyWait)
	{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(MyWait)));
			if(LocatorType.equalsIgnoreCase("xpath"))
			{
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LocatorValue)));
			}
			if(LocatorType.equalsIgnoreCase("id"))
			{
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(LocatorValue)));
			}
			if(LocatorType.equalsIgnoreCase("name"))
			{
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(LocatorValue)));
			}
			
	}
	
	// method for enter data in textbox
	public static void typeAction(String LocatorType,String LocatorValue,String TestData)
	{
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).clear();
			driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).clear();
			driver.findElement(By.name(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).clear();
			driver.findElement(By.id(LocatorValue)).sendKeys(TestData);
		}
	}
	
	// method for button,link,radio button,check boxes,images
	public static void clickAction(String LocatorType,String LocatorValue)
	{
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).click();
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).click();
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).sendKeys(Keys.ENTER);
		}
	}

	
	// method to capature supplier number
	
	public static void capaturesupplier(String LocatorType,String LocatorValue) throws IOException
	{
		String suppliernum="";
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			suppliernum=driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
		}
		
		if(LocatorType.equalsIgnoreCase("id"))
		{
			suppliernum=driver.findElement(By.id(LocatorValue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			suppliernum=driver.findElement(By.name(LocatorValue)).getAttribute("value");
		}
		// creating note pad and write supplier number
		FileWriter fw= new FileWriter("./CaptureData/supplier.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(suppliernum);
		bw.flush();
		bw.close();
	}
	
	//verify supplier number
	
	public static void suppliertable() throws Throwable
	
	{
		// read supplier for note pad
		FileReader fr = new FileReader("./CaptureData/supplier.txt");
		BufferedReader br= new BufferedReader(fr);
		String exp= br.readLine();
		
		// search text box is displayed or not
		if(!driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).isDisplayed())
		
			driver.findElement(By.xpath(conpro.getProperty("Search-panel"))).click();
			driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).clear();
			driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).sendKeys(exp);
			driver.findElement(By.xpath(conpro.getProperty("Search-button"))).click();
			Thread.sleep(3000);
		
		// Table
		String act= driver.findElement(By.xpath("//table[@class=\"table ewTable\"]/tbody/tr[1]/td[6]/div/span/span")).getText();
		if(exp.equals(act))
		{
			Reporter.log("test pass",true);
		}
		else
		{
			Reporter.log("test fail",true);
		}
		
	}
	
	public static void close()
	{
		driver.quit();
	}
	
	// method for capature customer
	public static void capaturecustomer(String LocatorType, String LocatorValue) throws IOException
	{
		String customernum="";
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
		   customernum = driver.findElement(By.xpath(LocatorValue)).getAttribute("Value");
		}
		
		if(LocatorType.equalsIgnoreCase("id"))
		{
		   customernum = driver.findElement(By.id(LocatorValue)).getAttribute("Value");
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
		   customernum = driver.findElement(By.name(LocatorValue)).getAttribute("Value");
		}
		
		// we are creating note pad file and past into  customer number in note pad
		
		FileWriter fw = new FileWriter("./CaptureData/customer.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(customernum);
		bw.flush();
		bw.close();
	}
	
	// Verify customer number
	
	public static void customertable() throws IOException, InterruptedException
	{
		// read number in note pad and paste into customer field
		
		FileReader fr = new FileReader("./CaptureData/Customer.txt");
		BufferedReader br = new BufferedReader(fr);
		String exp = br.readLine();
		if(!driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).isDisplayed())
			driver.findElement(By.xpath(conpro.getProperty("Search-panel"))).click();
		driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).clear();
		driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).sendKeys(exp);
		driver.findElement(By.xpath(conpro.getProperty("Search-button"))).click();
		Thread.sleep(3000);

		
		
	// verify table
		String act=driver.findElement(By.xpath("//table[@class=\"table ewTable\"]/tbody/tr[1]/td[5]/div/span")).getText();
		if(exp.equals(act))
		{
			Reporter.log("test pass",true);
		}
		else
		{
			Reporter.log("test fail",true);
		}
		
	}
	
	
	
	
	
	
	
	

}
