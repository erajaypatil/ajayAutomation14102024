package coverFoxTest;



import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressdetails4;
import coverFoxPOM.CoverFoxHOMEpage1;
import coverFoxPOM.CoverFoxHealthPlan2;
import coverFoxPOM.CoverFoxMemberDeatils3;
import coverFoxPOM.CoverFoxResultPage5;

public class TC11_CoverFox_Appli extends Base{
	
	
	CoverFoxHOMEpage1 Homepage1;
	CoverFoxHealthPlan2 healthpage2;
	CoverFoxMemberDeatils3 memberdetails3;
	CoverFoxAddressdetails4 addressdeatils4;
	CoverFoxResultPage5 resultpage5;
	
	
	@BeforeClass
	public void LaunchBrowser()
	{
	
		launchbrowser();
	}
	
	@BeforeMethod
	public void EnterDetails()
	{
		 Homepage1=new CoverFoxHOMEpage1(driver);
		 healthpage2=new CoverFoxHealthPlan2(driver);
		 memberdetails3=new CoverFoxMemberDeatils3(driver);
		 addressdeatils4=new CoverFoxAddressdetails4(driver);
		 resultpage5=new CoverFoxResultPage5(driver);
		
		Homepage1.FemaleT();
		healthpage2.Daughter();
		healthpage2.NextButton();
		memberdetails3.AgeDropdown1();
		memberdetails3.AgeDropdown2();
		memberdetails3.ContinueButton();
		addressdeatils4.PinCode();
		addressdeatils4.MobileNo();
		addressdeatils4.ContinueButton();	
		Reporter.log("Enter email id tages i wtire msg ",true);
		Reporter.log("hi this is my projet code i write for the automation coding purpose ",true);
	}
	
	
    @Test
    public void ValidatetingCoverFox() 
    {
    	resultpage5.ValidateText();
    }
  
    @AfterMethod
    public void CloseBrowser()
    {
    	closebrowser();
    }
  
  
}
