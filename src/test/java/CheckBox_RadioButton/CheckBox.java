package CheckBox_RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/samigundogan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 1. https://the-internet.herokuapp.com/checkboxes
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);

        //2. Checkbox1 ve checkbox2 elementlerini locate et
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));


        //3. Checkbox1 seçili değilse onay kutusunu tıkla
        if(!checkBox1.isSelected()){
            Thread.sleep(2000);
            checkBox1.click();
        }

        //4. Checkbox2 seçili değilse onay kutusunu tıkla
        Thread.sleep(2000);
        if(!checkBox2.isSelected()){
            checkBox2.click();
        }

        driver.close();
    }
}
