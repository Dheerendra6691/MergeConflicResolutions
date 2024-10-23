package mergeConflict;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectSearchExample {
	public static void main(String[] args) {
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		// Set Chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); // Optional: Maximizes the browser window
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		try {
			// Perform search using a pre-constructed URL
			String searchTerm = "Selenium 4.0 tutorial";
			driver.get("https://www.google.com/search?q=" + searchTerm.replace(" ", "+"));

			// Optional: wait to view the results
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}

/*
 * How would you perform a search without visiting a search engine’s page? To
 * perform a search without visiting the search engine’s homepage, you can
 * directly construct the search URL with the desired query. Most search engines
 * allow you to perform searches through URL parameters, which means you can
 * include the search term in the URL and navigate directly to the results page.
 * 
 * 
 * 
 */