package banking_project_runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import banking_project_admin.RHP;

public class rhp_runner {

	private static RHP links;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		RHP links=new RHP(driver);
		links.footer_custom_link.click();
		
		
		
	}

}
