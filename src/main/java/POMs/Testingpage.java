package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seletrain;
	
	public WebElement getSeletrain() {
		return seletrain;
	}

	@FindBy(id="mycart")
	private WebElement cart;
	
	public WebElement getCart() {
		return cart;
	}

	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement face;
	
	public WebElement getFace() {
		return face;
	}

	public Testingpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void facebook()
	{
		face.click();
	}
	

}
