package banking_project_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Role_testcases
{
	
	WebDriver driver;
	Roles Rol;
	
	public Role_testcases(WebDriver driver)
	{
		this.driver=driver;
		Rol=new Roles(driver);
	}

	public void role_create(String name,String descp,String type) throws Exception
	{
		Rol.role_name_eb.clear();
		Rol.role_name_eb.sendKeys(name);
		
		Rol.role_desp_eb.clear();
		Rol.role_desp_eb.sendKeys(descp);
		
		Thread.sleep(1000);
		new Select(Rol.role_type_drop).selectByVisibleText(type);
		
		Rol.roles_submit.click();
		
		
	}
	
	
}
