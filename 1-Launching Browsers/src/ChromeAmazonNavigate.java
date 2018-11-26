import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAmazonNavigate {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\muham\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.close(); //close only the focus webpage
		driver.quit(); //close all pages and kills the 
	    

	}

}
