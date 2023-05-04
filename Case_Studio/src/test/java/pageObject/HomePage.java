package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath="(//a[.='Services'])[1]")
	private WebElement serv;
	
	@FindBy(xpath="//a[.='Mobile App Development']")
	private WebElement mobAppDev;
	
	@FindBy(xpath="(//a[.='Case Studies'])[1]")
	private WebElement caseStudies;
		
	@FindBy(name="email")
	private WebElement mailId;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public void service() {
		serv.click();
	}
	public void mobApp() {
		mobAppDev.click();
	}
	public void studies() {
		caseStudies.click();
	}
	public void mail(String ID) {
		mailId.sendKeys(ID);;
	}
	
	public String mail2() {
		String emailData = mailId.getAttribute("value");
		return emailData;
	}
}
