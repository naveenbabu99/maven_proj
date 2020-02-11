package web_tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webtable_keywords 
{
       WebDriver driver;
	public Webtable_keywords(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void web_table_deletaion(String xpath, String Branchname, int cellnum) throws Exception 
	{
		 boolean flag=false;
			boolean flag1=false;
			
			do {
				
				
				WebElement table;
				table=driver.findElement(By.xpath(xpath));
				
				//outter
				
				WebElement LastRow;
				LastRow=table.findElements(By.tagName("tr")).get(6);
				
		        List<WebElement> pagelinks;
		        pagelinks=LastRow.findElements(By.tagName("a"));
		        
		        int linkcount;
		        linkcount=pagelinks.size();
		        System.out.println(linkcount);
				
		      for (int i = 0; i <=linkcount-1; i++)
		        {
		        	List<WebElement> rows;
					rows=table.findElements(By.tagName("tr"));
					
					System.out.println("list of rows at each page=>"+rows.size());
					
					for (int j = 1; j <rows.size()-2; j++)
					{
						List<WebElement> cells;
						cells=rows.get(j).findElements(By.tagName("td"));
						System.out.println("cellcount is=> "+cells.size());
						
						for (int k = 0; k < cells.size(); k++)
						{
							String Eachcell=cells.get(k).getText();
							
							if (Eachcell.equals(Branchname)) 
							{
								System.out.println("Record found");
							
								cells.get(cellnum).findElement(By.tagName("a")).click();
								System.out.println("warning for delete");
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
					
					if (!pagelinks.get(i).getText().equals("...")) {
						pagelinks.get(i).click();
						Thread.sleep(1000);
					}
					
					
					table=driver.findElement(By.id("DG_bankdetails"));
					LastRow=table.findElements(By.tagName("tr")).get(6);
					pagelinks=LastRow.findElements(By.tagName("a"));
					
					
					
				}
				
				
				if (flag1==true) 
				{
					break;
				}
				
			
				
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
	
	
	
		public void web_table_updationon(String xpath, String Branchname, int cellnum) throws Exception 
		{
			 boolean flag=false;
				boolean flag1=false;
				
				do {
					
					
					WebElement table;
					table=driver.findElement(By.xpath(xpath));
					
					//outter
					
					WebElement LastRow;
					LastRow=table.findElements(By.tagName("tr")).get(6);
					
			        List<WebElement> pagelinks;
			        pagelinks=LastRow.findElements(By.tagName("a"));
			        
			        int linkcount;
			        linkcount=pagelinks.size();
			        System.out.println(linkcount);
					
			      for (int i = 0; i <=linkcount-1; i++)
			        {
			        	List<WebElement> rows;
						rows=table.findElements(By.tagName("tr"));
						
						System.out.println("list of rows at each page=>"+rows.size());
						
						for (int j = 1; j <rows.size()-2; j++)
						{
							List<WebElement> cells;
							cells=rows.get(j).findElements(By.tagName("td"));
							System.out.println("cellcount is=> "+cells.size());
							
							for (int k = 0; k < cells.size(); k++)
							{
								String Eachcell=cells.get(k).getText();
								
								if (Eachcell.equals(Branchname)) 
								{
									System.out.println("Record found");
								
									cells.get(cellnum).findElement(By.tagName("a")).click();
									System.out.println("warning for delete");
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
						
						if (!pagelinks.get(i).getText().equals("...")) {
							pagelinks.get(i).click();
							Thread.sleep(1000);
						}
						
						
						table=driver.findElement(By.id("DG_bankdetails"));
						LastRow=table.findElements(By.tagName("tr")).get(6);
						pagelinks=LastRow.findElements(By.tagName("a"));
						
						
						
					}
					
					
					if (flag1==true) 
					{
						break;
					}
					
				
					
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
	
	

