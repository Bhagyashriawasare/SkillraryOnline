package All_Scripts;

import org.testng.annotations.Test;

import POMs.DemoPage;
import POMs.LoginPage;
import genericLibrary.BC;
import pomPages.AddtoCartPage;

public class TC1 extends BC{
	@Test
	public void tc1()
	{
		LoginPage l=new LoginPage(driver);
		l.gearbutton();
		l.skillrarydemoapp();
		
		DemoPage d=new DemoPage(driver);
		driverutilies.switchtabs(driver);
		driverutilies.mousehover(driver,d.getCoursebtn());
		d.seletrainbutton();
		
		AddtoCartPage a=new AddtoCartPage(driver);
		driverutilies.doubleclick(driver,a.getPlusbtn());
		a.addtocardbutton();
		driverutilies.alertpopup(driver);
	}
	

}
