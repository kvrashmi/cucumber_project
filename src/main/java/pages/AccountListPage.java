package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountListPage extends BasePage {
	WebDriver driver;
	public AccountListPage(WebDriver driver) 
	{
			super(driver);
			this.driver=driver;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/table/tbody/tr[2]/td[2]")WebElement ACCOUNTS_TABLE;
	@FindBy(how=How.XPATH,using="/html/body/section/div/div[1]/div[3]/div[1]")WebElement ACCOUNT_CREATED_TEXT;
	
	public String validateAccountCreation()
	{
		super.explicitlyWaitForElements("Div","/html/body/section/div/div[1]/div[3]/div[1]" );
		System.out.println(ACCOUNT_CREATED_TEXT.isDisplayed());
		System.out.println(ACCOUNT_CREATED_TEXT.getTagName());
		System.out.println(ACCOUNT_CREATED_TEXT.getText().indexOf("Account Created Successfully"));
		System.out.println(ACCOUNT_CREATED_TEXT.getText().length());
		String arr=ACCOUNT_CREATED_TEXT.getText();
		return arr.substring(2,arr.length() );
		
	}
}
