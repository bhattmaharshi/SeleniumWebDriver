import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/maharshibhatt/Documents/SelenuimFindings/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.espncricinfo.com/";
		driver.get(baseURL);

	}

}
