package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHealthPlan2 
{

	@FindBy(xpath="(//div[@class='ms-title'])[3]")private WebElement datugher;
	@FindBy(xpath="//div[text()=' Next ']")private WebElement nextbutton;
	
	public CoverFoxHealthPlan2(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
	public void Daughter()
	{
		datugher.click();
		Reporter.log("Daughter is clicking..", true);
	}
	
	
	public void NextButton()
	{
		nextbutton.click();
		Reporter.log("NextButton is clicking..", true);
	}
	
	
	
}
