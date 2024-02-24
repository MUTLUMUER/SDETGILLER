package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    // id -> By.id
    // name -> By.name
    // class -> By.classname
    // linktext -> By.linktext (SADECE a tagli elemanlar için kullanılır)
    // partiallinktext -> By.partiallinktext (SADECE a tagli elemanlar için kullanılır)

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        //linktext : linkin görünen yazısı selector olarak kullanılır
        WebElement siparislerimLinki = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("getText() = " + siparislerimLinki.getText());

        //PartialLinktext : Linkin görünen yazısının bir kısmını selector olarak kullanabilirsiniz.
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        //elementin özelliklerine getAttribute ile ulaşabilirim (Bütün tagler için geçerli).
        System.out.println("siparislerimLinki.href = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.title = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.rel = " + siparislerimLinki.getAttribute("rel"));

        MyFunc.Bekle(5);
        driver.quit();
    }
}
