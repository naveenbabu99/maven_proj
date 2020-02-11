package extend_reports_testng;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import banking_project_admin.Admin_home_links;
import banking_project_admin.Admin_testcases;
import banking_project_admin.Branch_testcases;
import banking_project_admin.Branches;
import banking_project_admin.Role_testcases;
import banking_project_admin.Roles;
import e_banking.methods;
import keywords.Keywords_for_alert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class NewTest {

	String driver_path="\\Browsers\\chromedriver.exe";
	String report_path="X:\\selenium workspace\\nvn_project1\\Extend_Reports\\reports.html";
	WebDriver driver=null;
	ExtentReports reporter;
	ExtentTest test;
	String url="http://192.168.1.97/ebank2/home.aspx";
    String screen_path="X:\\selenium workspace\\nvn_project1\\screens\\image1.png";
	
	
	@Test(priority=0)
  public void Ranford_homepage()
  {
		if (driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/home.aspx")) 
		{   
			test.log(LogStatus.INFO, "Expected report presented");
		} 
		else
		{
            test.log(LogStatus.SKIP, "admin page was not displayed");
            throw new SkipException("Admin page was not displayed"); 
		}
  }
	@Test(priority=1) 
	public void Admin_login() 
	{
		
		if (driver.getTitle().equals("MINDQ RANFORD BANK")) 
		{   Admin_testcases obj=new Admin_testcases(driver);
	        obj.Admin_login("Admin", "Admin");
			
			test.log(LogStatus.PASS, "Expected report presented");
		} 
		else
		{
             test.log(LogStatus.FAIL, "admin page was not displayed");
             throw new SkipException("admin uid or pass was missmatch"); 
		}
		
	}
	@Test(priority=2)
	public void branch_creation() 
	{
		if (driver.getTitle().equals("RANFORD BANK")) 
		{   
			Admin_home_links b_btn=new Admin_home_links(driver);
		    b_btn.AHP_Branches_btn.click();
		    test.log(LogStatus.INFO, "Expected branch presented");
			
		    if (driver.getTitle().equals("admin_banker_master")) 
			{
				Branches NB_btn=new Branches(driver);
				NB_btn.NBC_btn.click();
				test.log(LogStatus.INFO, "Expected newbranch presented");
				
				if (driver.getTitle().equals("admin_banker_master")) 
				{
					Branch_testcases b_details=new Branch_testcases(driver);
					b_details.NB_details("kathakali", "nalgonda", "50081", "INDIA", "GOA", "GOA");
					
					Branches sub=new Branches(driver);
					sub.NBC_submit.click();
					
					driver.switchTo().alert().accept();
					
					
					test.log(LogStatus.INFO, "Expected newbranch created");
				} 
				else
				{
					test.log(LogStatus.SKIP, "branch was not created");
				}
			}
			else 
			{
				test.log(LogStatus.SKIP, "newbranch page was not displayed");
			}
		} 
		
		else 
		{
			test.log(LogStatus.SKIP, "branch page was not displayed");
		}
	}
	
	@Test(priority=3)
	public void Role_creation() throws Exception
	{
		if (driver.getTitle().equals("admin_banker_master"))
		{
			Admin_home_links R_btn=new Admin_home_links(driver);
			R_btn.AHP_Role_btn.click();
			test.log(LogStatus.INFO, "Expected Role presented");
			
			if (driver.getTitle().equals("Admin_Roles_details"))
				try {
					{
						Roles N_R_bth=new Roles(driver);
						N_R_bth.new_roles_btn.click();
						
						Role_testcases R_details=new Role_testcases(driver);
						R_details.role_create("Naveenbabu", "babu", "E");
						
						Roles sub=new Roles(driver);
						sub.roles_submit.click();
						
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			else
			{
				test.log(LogStatus.SKIP, "new page was not displayed");
			}
		}
		
		else 
		{
			test.log(LogStatus.SKIP, "Role was not created");
		}
		
		
		
	}
	
	
	
	
	
  @BeforeMethod
  public void beforeMethod(Method method) 
  {
	  test=reporter.startTest(method.getName());
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception
  {    Keywords_for_alert alert=new Keywords_for_alert(driver);
       alert.capture_screen_when_alertpresented(screen_path+method.getName()+"image1.png");
  
	  test.log(LogStatus.INFO,test.addScreenCapture("X:\\selenium workspace\\nvn_project1\\screens\\image1.png"));
	  reporter.endTest(test);
  }

  @BeforeClass
  public void beforeClass()
  {
	  reporter=new ExtentReports(report_path,true);
	  System.setProperty("webdriver.chrome.driver", "X:\\\\selenium workspace\\\\nvn_project1\\\\Browsers\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(1000);
	  driver.close();
	  reporter.flush();
	  
  }

}
