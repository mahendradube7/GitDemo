package dataDrivenFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {

	
	@FindBy (id = "email") WebElement email;
	@FindBy (id = "pass") WebElement Password;
	@FindBy (name = "login") WebElement loginBtn;
	@FindBy (xpath = "//*[text()='Forgotten password?']") WebElement ForgotPwd;
	


}
