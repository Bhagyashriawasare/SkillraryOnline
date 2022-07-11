package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtowhistlist;
import pomPages.SkillraryLoginPage;
import pomPages.corejavapage;

public class TestCase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchtb(pdata.getpropertyfile("coursename"));
		s.searchbutton();
		
		corejavapage c=new corejavapage(driver);
		c.corejava();
		
		Addtowhistlist a=new Addtowhistlist(driver);
		a.cookiebutton();
		driverutilies.switchtoframe(driver);
		Thread.sleep(8000);
		a.playicon();
		Thread.sleep(8000);
		a.pauseicon();
		driverutilies.switchback(driver);
		a.whistlist();
	}

}
