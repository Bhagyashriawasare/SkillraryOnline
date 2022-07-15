package All_Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import POMs.DemoPage;
import POMs.LoginPage;
import POMs.Testingpage;
import genericLibrary.BC;

public class TC2 extends BC {
	@Test
	public void tc2() throws IOException
	{
		LoginPage l=new LoginPage(driver);
		l.gearbutton();
		l.skillrarydemoapp();
		
		DemoPage d=new DemoPage(driver);
		driverutilies.switchtabs(driver);
		driverutilies.dropdown(d.getDropdown(),pdata.getpropertyfile("dd"));
		
		Testingpage t=new Testingpage(driver);
		driverutilies.dragdrop(driver,t.getSeletrain(),t.getCart());
		Point loc = t.getFace().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilies.scrollbar(driver, x, y);
		t.facebook();
		
	}

}
