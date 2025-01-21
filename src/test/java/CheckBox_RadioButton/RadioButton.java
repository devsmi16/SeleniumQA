package CheckBox_RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/samigundogan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        //https://www.facebook.com adresine git
        String url = "https://www.facebook.com";
        driver.get(url);

        //“Yeni Hesap Oluştur” button’una bas
        WebElement yeniHesapOlustur_Button = driver.findElement(By.xpath("//a[.='Yeni Hesap Oluştur']"));;
        yeniHesapOlustur_Button.click();

        //“radio buttons” elementlerini locate et
        Thread.sleep(2000);
        WebElement erkek_RadioButton = driver.findElement(By.xpath("//input[@value=\"2\"]"));

        //Secili degilse cinsiyet butonundan size uygun olanı seç
        if(!erkek_RadioButton.isSelected()){
            //Thread.sleep(2000);

            erkek_RadioButton.click();
            Thread.sleep(2000);
        }

        driver.close();
    }
}
