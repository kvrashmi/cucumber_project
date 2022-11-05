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
	
	public void validateAccountCreation()
	{
		try
		{
			Thread.sleep(6000);
			String sCellValue = ACCOUNTS_TABLE.getText();
			System.out.println("val:"+sCellValue);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
