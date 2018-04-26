package elefant.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Service;

@Service
public class WebDriverFactory {

	public WebDriver getInstance() {
		return new FirefoxDriver();
	}

}
