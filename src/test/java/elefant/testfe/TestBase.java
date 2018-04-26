package elefant.testfe;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import elefant.webdriver.WebDriverFactory;

@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class TestBase extends AbstractTestNGSpringContextTests {

	@Autowired
	WebDriverFactory factory;

	@Value("${site.url}")
	String siteUrl;

	WebDriver driver = null;

	@BeforeClass(alwaysRun = true)
	public void init() {
		driver = factory.getInstance();
		driver.get(siteUrl);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
