import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\muham\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		//get
		driver.get("https://www.amazon.com/");
		driver.get("https://www.google.com/");
		
		     //navigate
		     driver.navigate().back();
	         driver.navigate().forward();
	         driver.navigate().refresh();
	         
	         //getTitle 
	         String title = driver.getTitle(); 
	         System.out.println(title);
	         
	       //getCurrentURL 
	         String url = driver.getCurrentUrl(); 
	         System.out.println(url);
	         
	       //close() , quit()
	         driver.close();

	}

}
