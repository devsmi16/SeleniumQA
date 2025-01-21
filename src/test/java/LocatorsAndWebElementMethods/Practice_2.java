package LocatorsAndWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2 {
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/samigundogan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        // Search kutusuna "laptop" yazıp arat
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();

        //   Amazon'da görüntülenen ilgili sonuçların sayısını yazdır
        WebElement aramaSonucuElement = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[1]"));
        System.out.println("Arama Sonucu : " + aramaSonucuElement.getText());

        //   Sonra karşınıza çıkan ilk sonucun resmine tıkla
        WebElement firstPicture = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]"));
        firstPicture.click();

        // 2 sn beklet ve browseri kapat
        Thread.sleep(2000);
        driver.quit();

    }
}
