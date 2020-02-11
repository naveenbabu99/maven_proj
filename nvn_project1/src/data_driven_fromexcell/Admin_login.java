package data_driven_fromexcell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import banking_project_admin.Admin_home_links;
import banking_project_admin.Branch_testcases;
import banking_project_admin.Branches;
import banking_project_admin.RHP;

public class Admin_login 
{
	public FileInputStream fi;
	public XSSFWorkbook book;
	public String filepath="TestData\\";
	public XSSFSheet sht;
	public XSSFRow row;
	public WebDriver driver;
	
	public Admin_login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void excel_connection(String filepath, String sheetname)
	{
		try {
			
			fi=new FileInputStream(filepath);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
			row=sht.getRow(1);
			
		}
		catch (Exception e)
		{
		    e.printStackTrace();
		}
		
		
		
	}
	
	public void Excell_Admin_login() throws Exception
	{
		excel_connection(filepath+"Admin.xlsx", "Login");
		String UID=row.getCell(0).getStringCellValue();
		String PWD=row.getCell(1).getStringCellValue();
		
		RHP home=new RHP(driver);
		
		home.admin_UID_EB.clear();
		home.admin_UID_EB.sendKeys(UID);
		
		home.admin_PWD_EB.clear();
		home.admin_PWD_EB.sendKeys(PWD);
		
		home.admin_login_btn.click();
		
		
	}
	
	public void Excel_new_branch() throws IOException
	{
		excel_connection(filepath+"Admin.xlsx", "New_Branch");
		String Branchname=row.getCell(0).getStringCellValue();
		String Address1=row.getCell(1).getStringCellValue();
		//String Address2=row.getCell(2).getStringCellValue();
		//String Address3=row.getCell(3).getStringCellValue();
		//String Area=row.getCell(4).getStringCellValue();
		String Zipcode=row.getCell(2).getStringCellValue();
		String Country=row.getCell(3).getStringCellValue();
		String State=row.getCell(4).getStringCellValue();
		String City=row.getCell(5).getStringCellValue();
		
		Admin_home_links branch_btn=new Admin_home_links(driver);
		Branches new_branch_btn=new Branches(driver);
		Branch_testcases NB_entry=new Branch_testcases(driver);
		
		branch_btn.AHP_Branches_btn.click();
		new_branch_btn.NBC_btn.click();
		NB_entry.NB_details(Branchname, Address1, Zipcode, Country, State, City);
		
		NB_entry.branches_submit_btn();
	}
	
	public void New_Role()
	{
		
	}
	
	
	
}
