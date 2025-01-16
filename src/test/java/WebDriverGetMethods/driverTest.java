package WebDriverGetMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverTest {
    public static void main(String[] args) {
        try {
            // ChromeDriver yolunu ayarla
            System.setProperty("webdriver.chrome.driver", "/Users/samigundogan/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();

            // 1. Amazon sayfasına git
            driver.get("https://www.amazon.com/");
            System.out.println("Amazon sayfasına gidildi.");

            // 2. Sayfa başlığını yazdır
            String actualTitle = driver.getTitle();
            System.out.println("Sayfanın Title'ı: " + actualTitle);

            // 3. Sayfa başlığının Amazon içerdiğini test et
            String expectedTitle = "Amazon";
            testCondition(actualTitle.contains(expectedTitle), "Title Testi");

            // 4. Sayfa URL'sini yazdır
            String actualURL = driver.getCurrentUrl();
            System.out.println("Sayfanın URL'si: " + actualURL);

            // 5. Sayfa URL'sinin "amazon" içerdiğini test et
            String expectedURL = "amazon";
            testCondition(actualURL.contains(expectedURL), "URL Testi");

            // 6. Sayfa handle değerini yazdır
            System.out.println("Sayfanın Handle Değeri: " + driver.getWindowHandle());

            // 7. Sayfa HTML kodlarında "shopping" kelimesi geçtiğini test edin
            String pageSource = driver.getPageSource();
            String expected = "shopping";
            testCondition(pageSource.contains(expected), "HTML Testi");

            // 8. 2 saniye bekle ve sayfayı kapat
            Thread.sleep(2000);
            shutdownWebDriver(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Test koşullarını kontrol eden metot
    public static void testCondition(boolean condition, String message) {
        if (condition) {
            System.out.println(message + " Başarılı!");
        } else {
            System.out.println(message + " Başarısız!");
        }
    }

    // WebDriver'ı kapatmak için kullanılan metot
    public static void shutdownWebDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver başarıyla kapatıldı.");
        }
    }
}