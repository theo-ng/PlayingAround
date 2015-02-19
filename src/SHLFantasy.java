import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SHLFantasy {

	public static void main(String[] args) {
		WebDriver wdriver = new FirefoxDriver();
		String baseUrl = "https://dl.dropboxusercontent.com/u/34714712/SHL%20S22MAIN/SHL-ProTeamScoring.html";
		String tagname = "";
		
		//launch FF @ baseURL
		wdriver.get(baseUrl);
		
		//do stuff
		
		
		//close FF
		wdriver.close();
		
		//exit program
		System.exit(0);
	}
}
