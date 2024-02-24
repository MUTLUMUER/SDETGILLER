package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {
       // Senaryo:
       // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
       // 2-  isim kutucuğuna "ismet" yazdırınız
       // 3-  soyad kutucuğuna "temur" yazdırınız

        // first_8
        // last_8

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu=driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("İsmet");

        WebElement soyadKutusu=driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("Temur");

        MyFunc.Bekle(5);
        driver.quit();
    }
}
