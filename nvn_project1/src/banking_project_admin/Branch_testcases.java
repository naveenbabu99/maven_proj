package banking_project_admin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Branch_testcases
{

	WebDriver driver;
	Branches BRC;
	
	public Branch_testcases(WebDriver driver)
	{
		this.driver=driver;
		BRC=new Branches(driver);	
	}

	public void NB_details(String name,String address1,String zipcode,String country,String state,String city) 
	{
		
		BRC.NBC_name.sendKeys(name);
		BRC.NBC_address1.sendKeys(address1);
		BRC.NBC_zipcode.sendKeys(zipcode);
		new Select(BRC.NBC_country).selectByVisibleText(country);
		new Select(BRC.NBC_state).selectByVisibleText(state);
		new Select(BRC.NBC_city).selectByVisibleText(city);
	}
		
	public void branches_submit_btn()
		{
		BRC.NBC_submit.click();
		}
		
		
		
	}
	

	
	

