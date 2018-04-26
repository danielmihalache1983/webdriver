package elefant.testfe;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomepageTest extends TestBase {

	HomePage homePage;
	
	@BeforeClass
	public void initPage() {
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void testHomepageIsDisplayed() {
		assertTrue(homePage.isDisplayed());
		homePage.clickFirstBanner();
		//assertTrue(homePage.isDisplayed());
	}
	
	
}