package banking_project_admin;

import org.openqa.selenium.WebDriver;

public class Admin_testcases
{
          WebDriver driver;
          RHP rhp;
       public Admin_testcases(WebDriver driver)
       {
    	  this.driver=driver;
    	  rhp=new RHP(driver);
    	   
       }
       
	public void Admin_login(String UID, String PWD)
	{
		rhp.admin_UID_EB.clear();
		rhp.admin_UID_EB.sendKeys(UID);
		
		rhp.admin_PWD_EB.clear();
		rhp.admin_PWD_EB.sendKeys(PWD);
		
		rhp.admin_login_btn.click();
		
	}
	
	
	
}
