package coverFoxPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHOMEpage1
{

	@FindBy(xpath="//div[text()='Female']")private WebElement gender;
	
	public CoverFoxHOMEpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void FemaleT()
	{
		Reporter.log("FemaleT is clicking..", true);
		gender.click();
	}
	
}
