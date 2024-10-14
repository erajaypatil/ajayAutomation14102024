package practiseProgram;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
public class CoverFoxAppTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		//coverfoxhomepage 1
		driver.findElement(By.xpath("//div[text()='Female']")).click();
		Thread.sleep(2000);
		Reporter.log("coverfoxhomepage 1 running..", true);
		
		
		//coverfoxhealthplanpage 2
		driver.findElement(By.xpath("(//div[@class='ms-title'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Next ']")).click();
		Reporter.log("coverfoxhealthplanpage 2 running..", true);
		
		
		//coverfoxmemberdetails 3
		WebElement agedropdown1=driver.findElement(By.id("Age-You"));
		Select s1=new Select(agedropdown1);
		s1.selectByIndex(10);
		Thread.sleep(2000);
		Reporter.log("coverfoxmemberdeatilspage 3 agedropdown1 is select successfully ", true);
		
		WebElement agedropdown2=driver.findElement(By.id("Age-Daughter-0"));
		Select s2=new Select(agedropdown2);
		s2.selectByValue("5m");
		Thread.sleep(2000);
		Reporter.log("coverfoxmemberdeatilspage 3 agedropdown2 is select successfully ", true);
		driver.findElement(By.className("next-btn")).click();
		Reporter.log("clicking on continue button",true);
		
		
		//coversoxaddrressdeatilspage4
		WebElement pincode=driver.findElement(By.xpath("//input[@class='mp-input-text']"));
		pincode.sendKeys("431505");
		Reporter.log("pincode enter succesfully ", true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='want-expert']")).sendKeys("8888888888");
		Reporter.log("mobile no enter succesfully ", true);
		driver.findElement(By.className("next-btn")).click();
		Reporter.log("coverfoxaddressdetailpage 4 run succesfully ", true);
		
		//coverfoxReusltvalidation
		WebElement result=driver.findElement(By.xpath("//div[text()='43 matching Health Insurance Plans']"));
		String actualResult = result.getText();
		System.out.println("Actual test from reuslt page is " +actualResult);
		String expectedResult="43 matching Health Insurance Plans";
		Assert.assertEquals(actualResult, expectedResult,"coverfoxresultvalidation tc is not matching ");
		
		
		Reporter.log("program run succesfully ",true);
		Thread.sleep(2000);
		driver.close();
		
	}
}
