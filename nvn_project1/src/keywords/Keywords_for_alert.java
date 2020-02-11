package keywords;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Keywords_for_alert
{

		WebDriver driver;
	public Keywords_for_alert(WebDriver driver) 
	{
		
		this.driver=driver;	
	}


	/*
	 * Keyword:-->Close Alert
	 * Author:-->
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	
	public boolean is_Alertpresented() 
	{
		boolean nvn;
		try {
			driver.switchTo().alert();
			nvn=true;
		}
		catch (NoAlertPresentException e)
		{
			nvn=false;
	System.out.println(e.getMessage());
				
		}
		return nvn;
	
	}
	

	/*
	 * Keyword:-->Close Alert
	 * Author:-->
	 * Created on:-->
	 * Reviewed By;-->
	 * Last updated date:-->
	 * 
	 */
	
	
	public boolean verify_alert_textfind(String exp_alert_present)
	{
		boolean flag;
		if (is_Alertpresented()) 
		{
			String title=driver.switchTo().alert().getText();
			flag=title.contains(exp_alert_present);
			System.out.println(flag);
			driver.switchTo().alert().accept();
			System.out.println("exp_alert_present");
		}
		else 
		{
            flag=false;
            System.out.println("alert not presented");
		}
		
		return flag;
		
	}
	
       public void screen_shot() throws Exception
       {
    	   SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
    	   Date d=new Date(0);
    	   String time=df.format(d);
    	   
    	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 
		   FileUtils.copyFile(src,new File("screens\\"+time+"Targetimage.png"));
       }
	
	
	public void capture_screen_when_alertpresented(String image) throws Exception
	{   //Create obeject fo robot class
		Robot rbt=new Robot();
		
		//Get Screen dimension
		Dimension screen_siz=Toolkit.getDefaultToolkit().getScreenSize();
		
		//Create screen using robot class
		BufferedImage img=rbt.createScreenCapture(new Rectangle(screen_siz));
		String path="X:\\selenium workspace\\nvn_project1\\screens\\image1.png";
		File filepath=new File(path);
		
		//Write image into local system
        ImageIO.write(img, "PNG", filepath);
	}

   public void branch_updation_edit() throws Exception
   {
	   boolean flag=false;
		boolean flag1=false;
	
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
			
	      for (int i = 0; i <=linkcount-2; i++)
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


   