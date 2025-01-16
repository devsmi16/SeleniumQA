package WebDriverManageWindowMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethods_2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/samigundogan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 1. Amazon sayfasina git
        driver.get("https://www.amazon.com/");

        // 2. Sayfanin konumunu ve boyutlarini yazdır
        System.out.println("Sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları : " + driver.manage().window().getSize());

        // 3. Sayfanin konumunu ve boyutunu istediğin sekilde ayarla
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(520,800));

        // 4. Sayfanın istedigin konum ve boyuta geldiğini test et
        int xKoor = driver.manage().window().getPosition().getX();
        int yKoor = driver.manage().window().getPosition().getY();
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();


        System.out.println("Son sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("Son sayfanın Boyutları : " + driver.manage().window().getSize());
        Thread.sleep(3000);

        if(xKoor == 0 && yKoor ==0 && width == 520 && height == 800){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        // 5. Sayfayı kapat
        driver.close();
    }
}