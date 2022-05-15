package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath = "//img[@alt='Instagram']") private WebElement InstaLogo;
	@FindBy(xpath = "//input[@name='username']") private WebElement Username;
	@FindBy(xpath = "//input[@name='password']") private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Submit;
	
	public LoginPage()
	{
	PageFactory.initElements(driver, this);
	}
	public String validTitleOfPage() 
	{
		return driver.getTitle();
	}

	public boolean varifyInstaLogo()
	{
		return InstaLogo.isDisplayed();
	}
	public void Login() throws InterruptedException
	{
		Username.sendKeys("rautgaurav1995");
		Thread.sleep(1000);
		Password.sendKeys("abcdef123");
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(5000);
	}

}
