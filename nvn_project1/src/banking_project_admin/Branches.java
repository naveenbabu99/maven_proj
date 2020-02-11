package banking_project_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Branches
{

	public Branches(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="lst_countryS")
	public WebElement branch_country;
	
	@FindBy(id="lst_stateS")
	public WebElement branch_state;
	
	@FindBy(id="lst_cityS")
	public WebElement branch_city;
	
	
	@FindBy(id="btn_search")
	public WebElement branch_search;
	
	@FindBy(id="btn_clsearch")
	public WebElement branch_clear;
	
	
	
	@FindBy(id="BtnNewBR")
	public WebElement NBC_btn;
	
	
	@FindBy(id="txtbName")
	public WebElement NBC_name;
	
	
	@FindBy(id="txtAdd1")
	public WebElement NBC_address1;
	
	
	@FindBy(id="txtZip")
	public WebElement NBC_zipcode;
	
	
	@FindBy(id="lst_counrtyU")
	public WebElement NBC_country;
	
	
	@FindBy(id="lst_stateI")
	public WebElement NBC_state;
	
	
	@FindBy(id="lst_cityI")
	public WebElement NBC_city;
	
	
	@FindBy(id="btn_insert")
	public WebElement NBC_submit;
	
	
	@FindBy(id="Btn_Reset")
	public WebElement NBC_reset;
	
	
	@FindBy(id="Btn_cancel")
	public WebElement NBC_cancel;
	
	
	
	
}
