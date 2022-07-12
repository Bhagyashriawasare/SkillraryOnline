package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryLoginPage;
import pomPages.Testing;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws IOException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearbutton();
		s.skillrarybutton();
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
	    driverutilies.switchtabs(driver);
	    driverutilies.dropDown(sd.getDd(),pdata.getpropertyfile("coursedd"));
	    
	    
	    Testing t=new Testing(driver);
	    driverutilies.dragdrop(driver,t.getSeletrain(),t.getCard());
	    Point loc = t.getFace().getLocation();
	    int x = loc.getX();
	    int y = loc.getY();
	    driverutilies.scrollbar(driver, x, y);
	    t.facebook();
	}

}
