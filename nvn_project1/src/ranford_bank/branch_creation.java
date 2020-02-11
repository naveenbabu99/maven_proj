package ranford_bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class branch_creation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		
		//Admin login
		driver.findElement(By.id("txtuId")).clear();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		
		driver.findElement(By.id("txtPword")).clear();
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();
		
		
		//Branch open
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		//new branch creation
		driver.findElement(By.id("BtnNewBR")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
