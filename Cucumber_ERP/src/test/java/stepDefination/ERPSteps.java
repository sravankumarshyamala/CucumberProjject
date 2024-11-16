package stepDefination;

import java.io.FileNotFoundException;
import java.io.IOException;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ERPSteps 

{
	
	@Given("launch browser as")
	public void launch_browser_as() throws FileNotFoundException, IOException 
	{
	    FunctionLibrary.startBrowser();
	}
	@When("launch url")
	public void launch_url() 
	{
	    FunctionLibrary.openurl();
	}
	@When("wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String LocatorType, String LocatorValue, String MyWait)
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, MyWait);
	}
	@When("Enter user name with {string} and {string} and {string}")
	public void enter_user_name_with_and_and(String LocatorType, String LocatorValue, String TestData) 
	{
	    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String LocatorType, String LocatorValue, String TestData)
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("Click on login with {string} and {string}")
	public void click_on_login_with_and(String LocatorType, String LocatorValue) 
	
	{
          FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Wait for supplier link with {string} and {string} and {string}")
	public void wait_for_supplier_link_with_and_and(String LocatorType, String LocatorValue, String MyWait)
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, MyWait);
	}
	@When("Click supplier link with {string} and {string}")
	public void click_supplier_link_with_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Wait for AddIcon with {string} and {string} and {string}")
	public void wait_for_add_icon_with_and_and(String LocatorType, String LocatorValue, String MyWait)
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, MyWait);
	}
	@When("Click on AddIcon with {string} and {string}")
	public void click_on_add_icon_with_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Wait for supplier number with {string} and {string} and {string}")
	public void wait_for_supplier_number_with_and_and(String LocatorType, String LocatorValue, String MyWait)
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, MyWait);
	}
	@When("Capature Supplier number with {string} and {string}")
	public void capature_supplier_number_with_and(String LocatorType, String LocatorValue) throws IOException 
	{
	    FunctionLibrary.capaturesupplier(LocatorType, LocatorValue);
	}
	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	
	@When("Click Add button with {string} and {string}")
	public void click_add_button_with_and(String LocatorType, String LocatorValue)  
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Wait for confirmOk button with {string} and {string} and {string}")
	public void wait_for_confirm_ok_button_with_and_and(String LocatorType, String LocatorValue, String MyWait) 
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, MyWait); 
	}
	@When("Click confirm ok button with {string} and {string}")
	public void click_confirm_ok_button_with_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Wait for Alert ok button with {string} and {string} and {string}")
	public void wait_for_alert_ok_button_with_and_and(String LocatorType, String LocatorValue, String MyWait) 
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, MyWait);
	}
	@When("Click on Alert ok button with {string} and {string}")
	public void click_on_alert_ok_button_with_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Verify Suppliernumber")
	public void verify_suppliernumber() throws Throwable 
	{
	    FunctionLibrary.suppliertable();
	}
	@When("Click Logout link with {string} and {string}")
	public void click_logout_link_with_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	} 
	@When("close browser")
	public void close_browser() 
	{
	   FunctionLibrary.close();
	}
	
	@When("Wait for Customer link with {string} and {string} and {string}")
	public void wait_for_customer_link_with_and_and(String LocatorType, String LocatorValue, String MyWait)
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, MyWait);
	    
	}
	@When("Click Customer link with {string} and {string}")
	public void click_customer_link_with_and(String LocatorType, String LocatorValue)
	{
	  FunctionLibrary.clickAction(LocatorType, LocatorValue);  
	}
	@When("Wait for Customer number with {string} and {string} and {string}")
	public void wait_for_customer_number_with_and_and(String LocatorType, String LocatorValue, String MyWait) 
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, MyWait);
	}
	@When("Capature Customer number with {string} and {string}")
	public void capature_customer_number_with_and(String LocatorType, String LocatorValue) throws IOException 
	{
	    FunctionLibrary.capaturecustomer(LocatorType, LocatorValue);
	}
	@When("Verify Customernumber")
	public void verify_customernumber() throws IOException, InterruptedException 
	{
	    FunctionLibrary.customertable();
	}

	
	

}
