package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CoverFoxMemberDeatils3 
{

	@FindBy(id="Age-You") private WebElement agedropdown1;
	@FindBy(id="Age-Daughter-0")private WebElement agedropdown2;
	@FindBy(className ="next-btn")private WebElement continuebutton;
	
	public CoverFoxMemberDeatils3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AgeDropdown1()
	{
		
		Select s1=new Select(agedropdown1);
		s1.selectByIndex(10);
		Reporter.log("selecting agedropdown1..", true);
	}
	
	public void AgeDropdown2()
	{
		Select s2=new Select(agedropdown2);
		s2.selectByValue("5m");
		Reporter.log("selecting agedropdown2..", true);
	}
	
	public void ContinueButton()
	{
		continuebutton.click();
		Reporter.log("continue button is clicking..", true);
	}
}
