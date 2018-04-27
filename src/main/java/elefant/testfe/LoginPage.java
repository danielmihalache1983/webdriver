package elefant.testfe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends Page {

	private final String usernameFieldLocator = ".//*[@id='login_username']";
	private final String passwordFieldLocator = ".//*[@id='login_password']";
	private final String loginButtonLocator = ".//*[@id='login_classic']";

	@FindBy(how = How.XPATH, using = usernameFieldLocator)
	private WebElement usernameFieldELement;

	@FindBy(how = How.XPATH, using = passwordFieldLocator)
	private WebElement passwordFieldElement;
	
	@FindBy(how = How.XPATH, using = loginButtonLocator)
	private WebElement loginButtonElement;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void loginUser(String username, String password) {
		fillInUsername(username);
		fillInPassword(password);
		clickLogin();
	}

	private void clickLogin() {
		loginButtonElement.click();
	}

	private void fillInPassword(String password) {
		passwordFieldElement.sendKeys(password);
	}

	private void fillInUsername(String username) {
		usernameFieldELement.sendKeys(username);
	}

}
