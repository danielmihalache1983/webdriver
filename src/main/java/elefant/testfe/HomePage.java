package elefant.testfe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends Page {

	private final String megaMenuLocator = ".//*[@class='homepage-highlights-tall-banner']";
	private final String bannerLocator = ".//*[@class='homepage-highlights-tall-banner']";

	@FindBy(how = How.XPATH, using = megaMenuLocator)
	private WebElement megaMenuElement;

	@FindBy(how = How.XPATH, using = bannerLocator)
	private WebElement firstBannerElement;

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

}
