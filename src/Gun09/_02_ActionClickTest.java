package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utlity.BaseDriver.BekleKapat;
import static Utlity.BaseDriver.driver;

public class _02_ActionClickTest extends BaseDriver {
    @Test
    public void test1(){

        driver.get("http://demoqa.com/buttons");

        WebElement btnClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        // btnClick.click();

       Actions aksiyonlar = new Actions(driver);

       Action aksiyon = aksiyonlar.moveToElement(btnClick).click().build();
        System.out.println("aksiyon hazırlandı");

       MyFunc.Bekle(2);
       aksiyon.perform();
       System.out.println("aksiyon çalıştı");



















    }
}
