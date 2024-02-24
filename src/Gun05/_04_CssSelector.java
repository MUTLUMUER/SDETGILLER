package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_CssSelector extends BaseDriver {
    public static void main(String[] args) {
        // Senaryo : (css selector kullanılarak yapılacak)
        // https://demo.seleniumeasy.com/basic-first-form-demo.html sayfasına gidiniz.
        // Kutucuğa "Merhaba Selenium" yazıp butona tıklatınız.
        // Butonun altında çıkan mesaj , yazdığınız mesajla aynı ise "Test PASSED"
        // değilse "Test Failed"  yazdırınız.
        // div[id='user-message']  ,    By.cssSelector()
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys("Merhaba Selenium");

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().contains("Merhaba Selenium"))
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");

        BekleKapat();
    }
}
