package WebDriverManageWindowMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethods_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/samigundogan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 1. Youtube sayfasina git  https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 2. Sayfanin konumunu ve boyutlarini yazdır
        System.out.println("Sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları : " + driver.manage().window().getSize());

        // 3. Sayfayı simge durumuna getirin
        driver.manage().window().minimize();

        // 4. simge durumunda 3 saniye bekleyip sayfayı maximize yap
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdır
        System.out.println("Max Sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("Max Sayfanın Boyutları : " + driver.manage().window().getSize());

        // 6. Sayfayı fullscreen yap
        driver.manage().window().fullscreen();

        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdır
        System.out.println("FullScreen Sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("FullScreen Max Sayfanın Boyutları : " + driver.manage().window().getSize());
        Thread.sleep(3000);

        // 8. Sayfayi kapat
        driver.close();

    }
}
