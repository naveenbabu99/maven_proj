package data_driven_fromexcell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import banking_project_admin.Admin_home_links;
import banking_project_admin.Branch_testcases;
import banking_project_admin.Branches;

public class Excell_admin_runner {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
        driver.manage().window().maximize();
        
        
        Admin_login log=new Admin_login(driver);
        log.Excell_Admin_login();
        
       //Admin_home_links brancbtn=new Admin_home_links(driver);
      // brancbtn.AHP_Branches_btn.click();
       
     // Branches nb=new Branches(driver);
      // nb.NBC_btn.click();
        log.Excel_new_branch();
        
 
	}

}
