package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement sdabtn;
	
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void gearbutton()
	{
		gearbtn.click();
	}
	public void skillrarydemoapp()
	{
		sdabtn.click();
	}
	public void searchtb(String name)
	{
		search.sendKeys(name);
	}
	public void searchbutton()
	{
		searchbtn.click();
	}

}
