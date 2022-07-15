package All_Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import POMs.AddtoWL;
import POMs.CoreJava;
import POMs.LoginPage;
import genericLibrary.BC;

public class TC3 extends BC {
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		l.searchtb(pdata.getpropertyfile("name"));
		l.searchbutton();
		
		CoreJava c=new CoreJava(driver);
		c.corejava();
		
		AddtoWL a=new AddtoWL(driver);
		a.cookiebutton();
		driverutilies.switchtoframe(driver);
		a.playicon();
		Thread.sleep(5000);
		a.pauseicon();
		driverutilies.switchback(driver);
		a.addtowhishlist();
	}

}
