import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/samigundogan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        Thread.sleep(3000);

        driver.close();
    }
}