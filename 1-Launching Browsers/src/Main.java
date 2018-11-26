import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", 
//		"C:\\Users\\muham\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com/");
		
		System.setProperty("webdriver.gecko.driver", 
		"C:\\Users\\muham\\Downloads\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.amazon.com/");
	}

}
