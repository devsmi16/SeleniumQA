package WebDriverNavigateMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/samigundogan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 1. Amazon ana sayfasina gidelim . https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        driver.get("https://www.amazon.com/");

        // 2. YouTube sayfasina git. https://www.youtube.com/
        //driver.navigate().to("https://www.youtube.com/");
        //driver.get("https://www.youtube.com/");

        // 3. Tekrar Amazon sayfasına dön
        driver.navigate().back();

        // 4. Yeniden Youtube sayfasina gidelim
        driver.navigate().forward();

        Thread.sleep(3000);
        // 5. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        // 6. Sayfayi kapatalim
        driver.close();
    }
}
