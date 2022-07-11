package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppPage {
	@FindBy(id="course")
	private WebElement coursebtn;
	
	public WebElement getCoursebtn() {
		return coursebtn;
	}

	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seletrainbtn;
	
	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement dd;
	
    public SkillraryDemoAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getDd() {
		return dd;
	}

    public void seleniumtraining()
	{
		seletrainbtn.click();
	}
	

}
