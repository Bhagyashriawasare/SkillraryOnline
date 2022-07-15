package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJava {
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement core;

	public CoreJava(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void corejava()
	{
		core.click();
	}
}
