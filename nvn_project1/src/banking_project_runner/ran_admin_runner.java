package banking_project_runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import banking_project_admin.Admin_home_links;
import banking_project_admin.Admin_testcases;

public class ran_admin_runner {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Admin_testcases TC=new Admin_testcases(driver);
		TC.Admin_login("Admin", "Admin");
		
		Admin_home_links AHL=new Admin_home_links(driver);
		AHL.AHP_Branches_btn.click();
		
		AHL.AHP_Role_btn.click();
		
		AHL.AHP_Users_btn.click();
		
		AHL.AHP_Employee_btn.click();
		
		AHL.AHP_Home_btn.click();
		
		AHL.AHP_logout_btn.click();
		
		
	}

}
