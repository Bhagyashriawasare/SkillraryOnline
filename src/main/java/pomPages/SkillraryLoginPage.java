package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement skilldemoappbtn;
	
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void gearbutton()
	{
		gearbtn.click();
	}
	public void skillrarybutton()
	{
		skilldemoappbtn.click();
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
