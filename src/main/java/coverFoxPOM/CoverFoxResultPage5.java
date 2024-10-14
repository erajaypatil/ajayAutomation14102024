package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class CoverFoxResultPage5

{

	@FindBy(xpath="//div[text()='43 matching Health Insurance Plans']")private WebElement testonpage;
	
	public CoverFoxResultPage5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateText()
	{
		String actualtext=testonpage.getText();
		System.out.println("actualtext is " +actualtext);
		String expectedtext="43 matching Health Insurance Plans";
		if(actualtext.equals(expectedtext))
		{
			System.out.println("test case is passed ");
		}
		Reporter.log("Validating text succesfully..", true);
	}
}
