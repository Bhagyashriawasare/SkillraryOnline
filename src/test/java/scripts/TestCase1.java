package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	//private static final String AddtoCartPage = null;

	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearbutton();
		s.skillrarybutton();
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
		driverutilies.switchtabs(driver);
		driverutilies.mousehover(driver,sd.getCoursebtn());
		sd.seleniumtraining();
		
		pomPages.AddtoCartPage a=new pomPages.AddtoCartPage(driver);
		driverutilies.doubleclick(driver,a.getPlusbtn());
		a.addtocardbutton();
		driverutilies.alertpopup(driver);
		
	}

}
