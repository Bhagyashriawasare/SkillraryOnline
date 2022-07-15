package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {
	@FindBy(xpath="//a[text()='COURSE']")
    private WebElement coursebtn;
	
	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement dropdown;
	
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getCoursebtn() {
		return coursebtn;
	}

	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement stbtn;
	
	public DemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void seletrainbutton()
	{
		stbtn.click();
	}
	
}
