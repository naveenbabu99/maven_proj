package banking_project_runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import banking_project_admin.Admin_home_links;
import banking_project_admin.Admin_testcases;
import banking_project_admin.Role_testcases;
import banking_project_admin.Roles;
import keywords.Keywords_for_alert;

public class Roles_runner {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        Admin_testcases TC=new Admin_testcases(driver);
        TC.Admin_login("Admin", "Admin");
        
        Admin_home_links RL=new Admin_home_links(driver);
        RL.AHP_Role_btn.click();
        
        Roles nrb=new Roles(driver);
        nrb.new_roles_btn.click();
        
        Role_testcases RTC=new Role_testcases(driver);
        RTC.role_create("nvnteller", "hello", "E");
        
        nrb.roles_submit.click();
        
        Keywords_for_alert key=new Keywords_for_alert(driver);
		key.verify_alert_textfind("role created succses");
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
