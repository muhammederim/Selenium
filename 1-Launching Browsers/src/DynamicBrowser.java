import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicBrowser {

	public static void main(String[] args) {
		
//		String browser ="Chrome";
//		
//		if(browser.equals("Chrome")) {
//			
//			System.setProperty("webdriver.chrome.driver", 
//			"C:\\Users\\muham\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
//			ChromeDriver driver =new ChromeDriver();
//			driver.get("https://www.amazon.com/");
//			//selenium code..
//		}else if(browser.equals("Firefox")) {
//			
//			System.setProperty("webdriver.gecko.driver", 
//			"C:\\Users\\muham\\Downloads\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
//			FirefoxDriver driver2 = new FirefoxDriver();
//			driver2.get("https://www.amazon.com/");
//			//selenium code..
//		
//	}
		
		//Latest version thats gonna work for all
		
		String browser ="Chrome";
		WebDriver driver=null;
		
		if(browser.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\muham\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
			"C:\\Users\\muham\\Downloads\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			FirefoxDriver driver2 = new FirefoxDriver();
		
	 }
		 driver.get("https://www.amazon.com/");
		 //Code...

		
		    //This will open both browser thats why we need to specify the browser dynamicly ebove
//			System.setProperty("webdriver.chrome.driver", 
//			"C:\\Users\\muham\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
//			System.setProperty("webdriver.gecko.driver", 
//					"C:\\Users\\muham\\Downloads\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
//		
//		     WebDriver driver = new ChromeDriver();
//		     driver=new FirefoxDriver();
//		
//		     driver.get("https://www.amazon.com/");
		
		
		
		
		
		
}
