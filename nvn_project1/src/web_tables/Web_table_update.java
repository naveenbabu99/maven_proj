package web_tables;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table_update {

	public static <webelement> void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "X:\\selenium workspace\\nvn_project1\\Browsers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		
		//admin login
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();
		
		//branch click
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(1000);
		
		boolean flag=false;
		boolean flag1=false;
		int x=0;
		do {
			 
			
			WebElement table;
			table=driver.findElement(By.id("DG_bankdetails"));
			
			//outter
			
			WebElement LastRow;
			LastRow=table.findElements(By.tagName("tr")).get(6);
			
	        List<WebElement> pagelinks;
	        pagelinks=LastRow.findElements(By.tagName("a"));
	        
	        int linkcount;
	        linkcount=pagelinks.size();
	        System.out.println(linkcount);
			
	      for (int i = x; i <=linkcount-2; i++)
	        {
	        	List<WebElement> rows;
				rows=table.findElements(By.tagName("tr"));
				
				
				System.out.println("list of rows at each page=>"+rows.size());
				
				for (int j = 1; j <=5; j++)
				{
					List<WebElement> cells;
					cells=rows.get(j).findElements(By.tagName("td"));
					System.out.println("cellcount is=> "+cells.size());
					
					for (int k = 0; k < cells.size(); k++)
					{
						String Eachcell=cells.get(k).getText();
						
						if (Eachcell.equals("updatedtext")) 
						{
							System.out.println("Record found");
						
							cells.get(6).findElement(By.tagName("a")).click();
							flag1=true;
							break;
						}
						
					}//cells
					
					
					if (flag1==true)
					{
						break;
					}
					
					
					
				}//rows
				
				
				
					
				if (flag1==true)
				{
					break;
				}
				
				
				pagelinks.get(i).click();
				Thread.sleep(1000);
				
				table=driver.findElement(By.id("DG_bankdetails"));
				LastRow=table.findElements(By.tagName("tr")).get(6);
				pagelinks=LastRow.findElements(By.tagName("a"));
				
				
				
			}
			
			
			if (flag1==true) 
			{
				break;
			}
			
			x=1;
			
			String Next;
			Next=pagelinks.get(linkcount-1).getText();
			
			if (Next.equals("..."))
			{
				flag=true;
				pagelinks.get(linkcount-1).click();
			}
			
			if (!Next.equals("...")) 
			{
				flag=false;
			}
			
			
			
		} while (flag);
		
		
		
	}

	

}
