package banking_project_runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import banking_project_admin.Admin_testcases;
import banking_project_admin.Branch_updation;
import keywords.Keywords_for_alert;

public class Branch_update_runner {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
        Admin_testcases adm=new Admin_testcases(driver);
        adm.Admin_login("Admin", "Admin");
        
        Branch_updation brch_btn=new Branch_updation(driver);
        brch_btn.Branches_btn.click();
        
        
        
        Keywords_for_alert bra_up=new Keywords_for_alert(driver);
        bra_up.branch_updation_edit();
        
        Branch_updation brc_test=new Branch_updation(driver);
        brc_test.branch_testcases("Nvnbabu001", "babu", "Nalgonda", "devara", "500007", "INDIA", "GOA", "GOA");
       
        Branch_updation click_update=new Branch_updation(driver);
        click_update.update_btn.click();
        driver.switchTo().alert().accept();
        System.out.println("nvn updated succsessfully");
      
        
        
        
        
        

	}

}
