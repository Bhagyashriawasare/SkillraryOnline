package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtowhistlist {
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement cookie;
	
	@FindBy(xpath="//div[@class='play-icon']")
     private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement add;
	
	public Addtowhistlist(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void cookiebutton()
	{
		cookie.click();
	}
	public void playicon()
	{
		play.click();
	}
	public void pauseicon()
	{
		pause.click();
	}
	public void whistlist()
	{
		add.click();
	}
}
