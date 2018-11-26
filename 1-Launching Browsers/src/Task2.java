import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
        "C:\\Users\\muham\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	    
	    driver.get("https://www.dice.com/");
	    driver.get("https://www.indeed.com/");
	    
	    driver.navigate().back();
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String Url=driver.getCurrentUrl();
	    System.out.println(Url);
	    
	    driver.navigate().forward();
	    
	    String title1=driver.getTitle();
	    System.out.println(title1);
	    
	    String Url1=driver.getCurrentUrl();
	    System.out.println(Url1);
	    
	    driver.close();
	    driver.close();
	    
		

	}

}
