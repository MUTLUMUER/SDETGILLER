package Gun05;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Test;

public class _04_CssSelector_Test extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys("Merhaba Selenium");

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("Aranılan mesaj bulunamadı!", msg.getText().contains("Merhaba Selenium"));
        //Ben true bekliyorum, değilse göster, yoksa test passed

        BekleKapat();
    }







}
