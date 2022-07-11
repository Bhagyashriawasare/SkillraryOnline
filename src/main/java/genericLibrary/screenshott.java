package genericLibrary;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshott {
	public void getphoto(WebDriver driver,String name) throws IOException
	{
		
		//d.toString().replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(autoconstant.propertyfile);
		FileUtils.copyFile(src, dest);
	}

}
