package banking_project_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Branch_updation
{

	public Branch_updation(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(xpath="//a[@href='admin_banker_master.aspx']")
	public WebElement Branches_btn;
	
	@FindBy(xpath="//a[@href='javascript']")
	public WebElement edit_btn;
	
	@FindBy(id="txtbnameU")
	public WebElement branch_name;
	
	
	@FindBy(id="txtadd1u")
	public WebElement add_1;
	
	
	@FindBy(id="txtadd2u")
	public WebElement add_2;
	
	@FindBy(id="txtareaU")
	public WebElement branch_area;
	
	
	@FindBy(id="txtzipu")
	public WebElement zipcode;
	
	@FindBy(id="drlst_countryU")
	public WebElement country_name;
	
	@FindBy(id="lst_stateU")
	public WebElement state_name;
	
	@FindBy(id="LST_cityU")
	public WebElement city_name;
	
	@FindBy(id="btnupdate")
	public WebElement update_btn;
	
	
	public void branch_testcases(String name,String add1,String add2,String area,String zip,String coun,String state,String city)
	{
		
		
		branch_name.clear();
	    branch_name.sendKeys(name);
		
	    add_1.clear();
	    add_1.sendKeys(add1);
	
		add_2.clear();
		add_2.sendKeys(add2);
		
		branch_area.clear();
		branch_area.sendKeys(area);
		
		zipcode.clear();
		zipcode.sendKeys(zip);
		
		
		new Select(country_name).selectByVisibleText(coun);
		new Select(state_name).selectByVisibleText(state);
		new Select(city_name).selectByVisibleText(city);
		
		
	}
	
	
	
}
