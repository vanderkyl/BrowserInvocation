
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chromedriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Choose browser: Chrome | IE\n");
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter choice: ");
		String input = reader.next();
		System.out.println(input);
		
		if (input.toLowerCase().equals("chrome")) {
			// Chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kyle\\Documents\\selenium-2.45.0\\drivers\\chromedriver.exe");
			WebDriver cDriver = new ChromeDriver();
			cDriver.get("http://agavelove.com");
		} else if (input.toLowerCase().equals("ie")) {
			// Internet Explorer driver
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Kyle\\Documents\\selenium-2.45.0\\drivers\\IEDriverServer.exe");
			WebDriver ieDriver = new InternetExplorerDriver();
			ieDriver.get("http://google.com");
		}
		reader.close();
	}

}
