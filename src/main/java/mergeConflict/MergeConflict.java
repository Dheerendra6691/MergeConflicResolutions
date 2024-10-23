package mergeConflict;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeConflict {

	public static void main(String[] args) {
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Set Chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); // Optional: Maximizes the browser window

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver(options);

		try {
			// Navigate to Google
			driver.get("https://www.google.com");

			// Locate the search box element by name attribute and send a search query
			WebElement searchBox = driver.findElement(By.name("q"));

			searchBox.sendKeys("Selenium WebDriver tutorial");


			// Submit the search query
			searchBox.submit();

			// Wait for the results to load
			Thread.sleep(3000);

			// Locate the first search result and click on it
			// The tag name h3 is the HTML tag, which represents the third-level heading
			// element in HTML, often used for titles or subheadings.
			WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));

			firstResult.click();

			// Optional: wait a few seconds to see the result page
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
