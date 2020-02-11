package banking_project_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RHP 
{

	public RHP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='http://ravinderbasani.com']")
	public WebElement Home_button;
	
	@FindBy(css="a[href='personal_banking.html']")
	public WebElement personal_banking_btn;
	
	@FindBy(xpath="//a[@href='Corporate Banking.html']")
    public WebElement corp_bank_btn;
	
	@FindBy(xpath="//a[@href='International Banking.html']")
	public WebElement interna_bank_btn;
	
	@FindBy(xpath="//a[@href='aboutus.html']")
	public WebElement about_btn;
	
	@FindBy(id="personal")
	public WebElement clogin_personal_btn;
	
	
	@FindBy(id="corporate")
	public WebElement clogin_corpo_btn;
	
	@FindBy(id="NRI")
	public WebElement clogin_international_btn;
	
	@FindBy(id="txtuId")
	public WebElement admin_UID_EB;

	
	@FindBy(id="txtPword")
	public WebElement admin_PWD_EB;
	
	
	@FindBy(id="login")
	public WebElement admin_login_btn;
	
	
	@FindBy(xpath="//a[@href='customerServices.html']")
	public WebElement footer_custom_link;
	
	
	@FindBy(xpath="//a[@href='faqs.html']")
	public WebElement footer_internetbanking_link;
	
	
	@FindBy(xpath="//a[@href='privacy.html']")
	public WebElement footer_privacy_link;

	
	@FindBy(xpath="//a[@href='terms&conditions.html']")
	public WebElement footer_terms_cond_link;
	
	
	@FindBy(xpath="//a[@href='disclaimer.html']")
	public WebElement footer_disclaimer_link;
	
	

	@FindBy(xpath="//a[@href='sitemap.html']")
	public WebElement footer_sitemap_link;
	
}