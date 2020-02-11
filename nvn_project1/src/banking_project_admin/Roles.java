package banking_project_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roles
{
	public Roles(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="btnRoles")
	public WebElement new_roles_btn;
	
	@FindBy(id="txtRname")
	public WebElement role_name_eb;
	
	@FindBy(id="txtRDesc")
	public WebElement role_desp_eb;
	 
	@FindBy(id="lstRtypeN")
	public WebElement role_type_drop;
	
	@FindBy(id="btninsert")
	public WebElement roles_submit;
	
	@FindBy(id="Btn_Reset")
	public WebElement roles_reset;
	
	@FindBy(id="Btn_cancel")
	public WebElement roles_cancle;
	
	
	
	
	
	
	
	
	
	
	
}
