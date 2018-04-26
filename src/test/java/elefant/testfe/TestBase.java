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

	@Value("${webdriver.gecko.driver}")
	String geckoDriver;

	WebDriver driver = null;

	@BeforeClass(alwaysRun = true)
	public void init() {
		System.setProperty("webdriver.gecko.driver", geckoDriver);

		driver = factory.getInstance();
		driver.get("http://www.elefant.ro");
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
