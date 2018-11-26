import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\muham\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	    
	    driver.get("https://www.rediff.com/");
	    
	    String title = driver.getTitle();
	    
	    if(title.contains("Busines")) {
	    	 System.out.println("Verified");
	    	
	    }else {
	    	System.out.println("Not Verified");
	    }
	    driver.close();

	}

}
