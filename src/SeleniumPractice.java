import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPractice {
	
	public static void main(String[] args) {
		WebDriver wdriver = new FirefoxDriver();
		String baseUrl = "http://gmail.com";
		String email = "theodore.n.ng@gmail.com";
		String pword = "redacted";
		
		//launch FF @ baseURL
		wdriver.get(baseUrl);
		//Enter log-in info
		wdriver.findElement(By.id("Email")).sendKeys(email);
		wdriver.findElement(By.id("Passwd")).sendKeys(pword);
		wdriver.findElement(By.name("signIn")).click();
		
		//close FF
		wdriver.close();
		
		//exit program
		System.exit(0);
	}
	
}