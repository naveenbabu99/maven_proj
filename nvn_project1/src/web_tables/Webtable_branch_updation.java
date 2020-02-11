package web_tables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Webtable_branch_updation {

	public Webtable_branch_updation(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


    //Admin branches update branchname_EB
    @FindBy(id="txtbnameU") 
    public WebElement update_branchname_EB;

    
    //Admin branches update add1_EB
    @FindBy(id="txtadd1u")
    public  WebElement update_add1_EB;
    
    
    //Admin branches update area_EB
    @FindBy(id="txtareaU") 
    public WebElement update_area_EB;

    
    //Admin branches update zipcode_ EB
    @FindBy(id="txtzipu")
    public  WebElement update_zipcode_EB;
    
    
   //Admin branches update_country_EB
    @FindBy(id="drlst_countryU")
    public  WebElement update_country_EB;
    
    //Admin branches update state_EB
    @FindBy(id="lst_stateU") 
    public WebElement update_state_EB;

    
    //Admin branches update city_EB
    @FindBy(id="LST_cityU")
    public  WebElement update_city_EB;
    
    //Admin_branch_update_btn
    @FindBy(id="btnupdate")
    public  WebElement branch_update_btn;
	
	
	public void Admin_branch_updation(String branchname,String add1, String area, String zip, String cout, String state,String city) 
	{
		update_branchname_EB.clear();
		update_branchname_EB.sendKeys(branchname);
		
		update_add1_EB.clear();
		update_add1_EB.sendKeys(add1);
		
		update_area_EB.clear();
		update_area_EB.sendKeys(area);
		
		update_zipcode_EB.clear();
		update_zipcode_EB.sendKeys(zip);
		
		
		
		new Select(update_country_EB).selectByVisibleText(cout);
		new Select(update_state_EB).selectByVisibleText(state);
		new Select(update_city_EB).selectByVisibleText(city);
		
		branch_update_btn.click();
		
		
	
		
		
	}
	

	
	
}
