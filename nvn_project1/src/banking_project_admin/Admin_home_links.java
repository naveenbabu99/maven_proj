package banking_project_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_home_links
{

	public Admin_home_links(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement AHP_Home_btn;
	
	
	@FindBy(xpath="//a[@href='change_password.aspx']")
	public WebElement AHP_changepassword_btn;
	
	
	@FindBy(xpath="//a[@href='home.aspx']")
	public WebElement AHP_logout_btn;
	
	
	@FindBy(xpath="//a[@href='admin_banker_master.aspx']")
	public WebElement AHP_Branches_btn;
	
	
	@FindBy(xpath="//a[@href='Admin_Roles_details.aspx']")
	public WebElement AHP_Role_btn;
	
	
	@FindBy(xpath="//a[@href='userdetails.aspx']")
	public WebElement AHP_Users_btn;
	
	
	@FindBy(xpath="//a[@href='Admin_Emp_details.aspx']")
	public WebElement AHP_Employee_btn;
	
	
}
