package WebDriverGetMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/samigundogan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com"); // get: belirtilen URl e gider.

        System.out.println("amazon url:" + driver.getCurrentUrl()); //getCurrentUrl: tarayıcıdaki o an daki URl i getirir.

        System.out.println("amazon title" + driver.getTitle()); // getTitle: sayfanın başlığını verir.

        driver.getPageSource(); // getPageSource: sayfanın bize tüm HTMl kodlarını verir.

        System.out.println(driver.getWindowHandle()); // getWindowHandle: tarayıcı da açtığımız adresin unit değerini verir.
                                                      // her seferinde çalıştığında farklı unit değer verir.

        System.out.println("Driver class type" + driver.getClass()); // getClass: import org.openqa.selenium.chrome.ChromeDriver.

    }
}
