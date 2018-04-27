package elefant.testfe;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import elefant.util.DataProviders;

public class HomepageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;

	@BeforeClass
	public void initPage() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Test
	public void testHomepageIsDisplayed() {
		assertTrue(homePage.isDisplayed());
	}

	@Test(description = "Verify user login success", dataProviderClass = DataProviders.class, dataProvider = "CSV")
	public void testLogin(String username, String password) {
		homePage.goToLoginPage();
		loginPage.loginUser(username, password);
	}
}
