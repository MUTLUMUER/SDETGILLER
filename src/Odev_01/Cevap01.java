package Odev_01;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cevap01 extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://demoqa.com/buttons");

        List<WebElement> consent = driver.findElements(By.xpath("//input"));
        if (consent.size() > 0) {
            consent.get(0).click();
        }
        MyFunc.Bekle(2);
        WebElement input= driver.findElement(By.xpath("//input[@id=userName]"));
        input.sendKeys("Automation Test");

        MyFunc.Bekle(2);

        BekleKapat();


    }
}
