package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxAddressdetails4
{

	@FindBy(xpath="//input[@class='mp-input-text']")private WebElement pincode;
	@FindBy(xpath="//input[@id='want-expert']")private WebElement mobileno;
	@FindBy(className ="next-btn")private WebElement continuneButton;
	
	public CoverFoxAddressdetails4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void PinCode()
	{
		pincode.sendKeys("431536");
		Reporter.log("entering pin code ..", true);
	}
	
	public void MobileNo()
	{
		mobileno.sendKeys("8888888888");
		Reporter.log("entering mobile no ..", true);
	}
	
	
	public void ContinueButton()
	{
		continuneButton.click();
		Reporter.log("continue button clicking ..", true);
	}
	
	
	
}
