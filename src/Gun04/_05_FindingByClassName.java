package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class _05_FindingByClassName {
    public static void main(String[] args) {
        // Browserda incele yaptığınızda id lerden aramalar için #, class aramalar için . konabilir.

        // Senaryo:
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  Bütün label ları bulup textlerini yazdırınız

        WebDriver driver= new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());
        // findElement:  locator birden fazla elemanı işaret ediyorsa bile, ilkini bulur

        // Bütün elemanları almak için findElemenS kullanılır
        List<WebElement> etiketler= driver.findElements(By.className("form-sub-label"));

        System.out.println("etiketler.size() = " + etiketler.size());

        for (WebElement e: etiketler)
            System.out.println("e.getText() = " + e.getText());

        MyFunc.Bekle(5);
        driver.quit();
    }
}
