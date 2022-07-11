package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	@FindBy(id="add")
	private WebElement plusbtn;
	
	public WebElement getPlusbtn() {
		return plusbtn;
	}

	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-flat']")
	private WebElement addcartbtn;
	
	public AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addtocardbutton()
	{
		addcartbtn.click();
	}

}
