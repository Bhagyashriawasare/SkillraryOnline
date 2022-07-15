package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericLib.propertyfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BC {
	public WebDriver driver;
	public propertyfile pdata=new propertyfile();
	public WDU driverutilies=new WDU();
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertyfile("url1"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status=res.getStatus();
		String name = res.getName();
		if(status==2)
		{
			SS s=new SS();
			s.getphoto(driver, name);
			
		}
		driver.quit();
	}

}
