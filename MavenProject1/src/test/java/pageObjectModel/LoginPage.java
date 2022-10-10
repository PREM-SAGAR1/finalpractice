package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(linkText ="Sign in") WebElement signIn;
	@FindBy(id="email")  public WebElement userEmail;
    @FindBy(id="passwd") public WebElement  userPassword;
    @FindBy(id="SubmitLogin") public WebElement submitLogin;
    @FindBy(xpath="//li[contains(text(),'Authentication failed.')]") public WebElement loginerror;

     public LoginPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
	}

	public void login()
     {
    	 signIn.click();
    	 userEmail.sendKeys("qatest584585@gmail.com");
    	 userPassword.sendKeys("PASSWORD");
    	 submitLogin.click();
    	 
     }
     
     public String verifyErrorMessage()
     {
    	 return loginerror.getText();
     }
     


}
