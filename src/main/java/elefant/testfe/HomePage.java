package elefant.testfe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends Page {

	private final String megaMenuLocator = ".//*[@class='homepage-highlights-tall-banner']";
	private final String bannerLocator = ".//*[@class='homepage-highlights-tall-banner']";
	private final String contulMeuLocator = ".//div[@class='hidden-xs header-account-display']";
	private final String intraInContLocator = ".//a[@title='Autentificare']";

	@FindBy(how = How.XPATH, using = megaMenuLocator)
	private WebElement megaMenuElement;

	@FindBy(how = How.XPATH, using = bannerLocator)
	private WebElement firstBannerElement;

	@FindBy(how = How.XPATH, using = contulMeuLocator)
	private WebElement contulMeuElement;
	
	@FindBy(how = How.XPATH, using = intraInContLocator)
	private WebElement intraInContElement;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isDisplayed() {
		boolean status = false;
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {
			status = megaMenuElement.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public void clickFirstBanner() {
		firstBannerElement.click();
	}

	public void goToLoginPage() {
		clickContulMeu();
		clickIntraInCont();
	}

	private void clickIntraInCont() {
		intraInContElement.click();
	}

	private void clickContulMeu() {
		contulMeuElement.click();
	}

}
