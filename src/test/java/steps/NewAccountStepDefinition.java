package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccountListPage;
import pages.LoginPage;
import pages.NewAccountPage;
import pages.TestBase;
import util.Helper;

public class NewAccountStepDefinition extends TestBase{
	
	LoginPage lp;
	NewAccountPage np;
	AccountListPage ap;
	
	String userName="demo@techfios.com";
	String passWord="abc123";
	String accountTitle="RashmiVik";
	String description="Salary Account";	
	String initialBalance="2000";
	String accountNumber="1002";	
	String contactPerson="AccountMgr";
	String phoneNo="799-500-";
	String internetBankingUrl="citibank.com";
	
	@Given("^User is on the techfios login page for add account$")
	   public void user_is_on_the_techfios_login_page_for_add_account()
	   {
		   TestBase.initDriver();
		   lp=PageFactory.initElements(driver, LoginPage.class);
		   np=PageFactory.initElements(driver, NewAccountPage.class);
		   ap=PageFactory.initElements(driver, AccountListPage.class);

		   driver.get("http://www.techfios.com/billing/?ng=admin/");
		   
	   }
	
	
	@When("^User enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String arg1)
	{
		lp.inputUserName(this.userName);
	}
	
	@When("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String arg1)
	{
		lp.inputPassWord(this.passWord);
	}
	
	@And("^User clicks on signin button$")
	public void user_clicks_on_signin_button()
	{
		lp.login();
	}
	
	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_dashboard_page()
	{
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle	= lp.getTitle();
	}
	
	@And("^User clicks on bankcash link$")
	public void user_clicks_on_bankcash_link()
	{
		np.clickBankAndCashLink();
	}
	
	@And("^User clicks on newaccount link$")
	public void user_clicks_on_newaccount_link()
	{
		np.clickNewAccountLink();
	}
	
	@And("^User enters accountTitle as \"<([^\"]*)>\"$")
	public void user_enters_accountTitle_as(String accountTitle)
	{
		int rNo=Helper.generateRandomNumber(9999);
		np.inputAccountTitle(this.accountTitle+"_"+rNo);
	}
	
	@And("^User enters description as \"([^\"]*)\"$")
	public void user_enters_description_as(String description)
	{
		np.inputDescription(this.description);
	}
	
	@And("^User enters initialBalance as \"([^\"]*)\"$")
	public void user_enters_initialBalance_as(String initialBalance)
	{
		np.inputInitialBalance(this.initialBalance);
	}
	
	@And("^User enters accountNumber as \"([^\"]*)\"$")
	public void user_enters_accountNumber_as(String accountNumber)
	{
		np.inputAccountNumber(this.accountNumber);
	}
	
	@And("^User enters contactPerson as \"([^\"]*)\"$")
	public void user_enters_contactPerson_as(String contactPerson)
	{
		np.inputContactPerson(this.contactPerson);
	}
	
	@And("^User enters phoneNumber as \"([^\"]*)\"$")
	public void user_enters_phoneNumber_as(String phoneNumber)
	{
		int rNo=Helper.generateRandomNumber(9999);
		np.inputPhoneNumber(this.phoneNo+rNo+" ");
		
	}
	
	@And("^User enters internetBankingUrl as \"([^\"]*)\"$")
	public void user_enters_internetBankingUrl_as(String internetBankingUrl)
	{
		np.inputInternetBankingUrl(this.internetBankingUrl);
	}
	
	@Then("^User clicks on newaccount button$")
	public void user_clicks_on_newaccount_button()
	{
		np.clickCreateAccount();

	}
	
	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully()
	{
		ap.validateAccountCreation();
	}
	   

}
