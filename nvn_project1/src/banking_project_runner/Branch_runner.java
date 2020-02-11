package banking_project_runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import banking_project_admin.Admin_home_links;
import banking_project_admin.Admin_testcases;
import banking_project_admin.Branch_testcases;
import banking_project_admin.Branches;
import keywords.Keywords_for_alert;

public class Branch_runner {

	

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        Admin_testcases TC=new Admin_testcases(driver);
		TC.Admin_login("Admin", "Admin");
		
		Admin_home_links AHL=new Admin_home_links(driver);
		AHL.AHP_Branches_btn.click();
		
		Branches N_b_btn=new Branches(driver);
		N_b_btn.NBC_btn.click();
		
        Branch_testcases BTC=new Branch_testcases(driver);
		BTC.NB_details("naveenbabu", "nalgonda", "50081", "INDIA", "GOA", "GOA");
		
		//N_b_btn.NBC_submit.click();
		
		Keywords_for_alert keys=new Keywords_for_alert(driver);
		keys.verify_alert_textfind("Branch name already Exist");
		
        
       
        
        
        
        
        
        

	}

}
