package e_banking;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper
{
	WebDriver driver;
	
	public void launch_browser()
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();	
		
	}
	
	public void open_app() 
	{
		driver.get("http://192.168.1.97/ebank2/Home.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	
	public void admin_login()
	{
		driver.findElement(By.id("txtuId")).clear();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		
		driver.findElement(By.id("txtPword")).clear();
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click(); 
		
	}
	
	public void branch_button() 
	{
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	
	}
	
	public void new_branch_button()
	{
		
		driver.findElement(By.id("BtnNewBR")).click();
	}
	
	public void newbranch_details()
	{
	WebElement b_name=driver.findElement(By.id("txtbName"));
	b_name.sendKeys("NAVEENBABU");
	
	WebElement Address_1=driver.findElement(By.id("txtAdd1"));
	Address_1.sendKeys("nalgonda");
	
	WebElement zipcode=driver.findElement(By.id("txtZip"));
	zipcode.sendKeys("50001");
	
    new Select(driver.findElement(By.id("lst_counrtyU"))).selectByValue("INDIA");
	new Select(driver.findElement(By.id("lst_stateI"))).selectByValue("Andhra Pradesh");
	new Select(driver.findElement(By.id("lst_cityI"))).selectByValue("Hyderabad");
	
	
	}
	
	public void submit()
	{
		driver.findElement(By.id("btn_insert")).click();
	}
	
	public void newbranch_alert()
	{
		driver.switchTo().alert().accept();
	}
	
	
	public void home_button() 
	{
		driver.findElement(By.xpath("//table[@width='460']/tbody/tr/td/a/img")).click();
	}
	
	public void logout_button()
	{
		
	}
	
	
	
	
}
