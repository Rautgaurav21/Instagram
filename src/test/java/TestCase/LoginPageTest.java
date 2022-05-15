package TestCase;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	@BeforeMethod
	public void setup()
	{
		initalization();
		login = new LoginPage();
	}
	@Test
	public void validTitleOfPageTest()
	{
	String expected= "Instagram";	
	String actual=login.validTitleOfPage();
	assertEquals(actual, expected);
	Reporter.log("Title Of The Page = "+actual);
	}
	@Test
	public void varifyInstaLogoTest()
	{
		boolean value = login.varifyInstaLogo();
		assertEquals(true, value);
		Reporter.log("Logo Is Displayed = "+value);
	}
	@Test
	public void LoginTest() throws InterruptedException
	{
		login.Login();
		Reporter.log("Login Is Successful :- Wel Come to Instagram Home page");
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
}
