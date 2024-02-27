package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Utlity.MyFunc.Bekle;


// Test Senaryosu
// 1- https://www.facebook.com/ sitesine gidiniz.
// 2- Create New Account butonuna tıklayınız.
// 3- Açılan yeni percerede isim, soyisim ve email giriniz
// 4- Email i tekrar girmenizi isteyen bir input daha açıldığını
//      öncesinde de görünmediğini, sonrasında da göründüğünü
//      assert ile doğrulayınız
// 5- Doğum tahini Select sınıfı ile seçiniz
public class _03_Soru extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://www.facebook.com/");
        MyFunc.Bekle(2);

        List<WebElement> cookiesAccept = driver.findElements(By.cssSelector("[data-testid='cookie-policy-manage-dialog-accept-button'"));
        if (cookiesAccept.size() > 0) // eğer elemanı bulamamışsa
            cookiesAccept.get(0).click();

        MyFunc.Bekle(2);
        WebElement createAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        // By.linkText("Create New Account")
        // [id^='u_0_0']
        createAccount.click();

        MyFunc.Bekle(2);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("ismet");

        MyFunc.Bekle(2);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Temur");

        MyFunc.Bekle(2);
        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse("ReEmail Gözüktü" , reEmail.isDisplayed()); // gözükmemesini bekliyorum
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

        MyFunc.Bekle(2);
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismet@hotmail.com");

        MyFunc.Bekle(2);
        Assert.assertTrue("reEmail Gözükmedi" , reEmail.isDisplayed()); // gözükmesini bekliyorum
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

        MyFunc.Bekle(2);
        WebElement webDay = driver.findElement(By.id("day"));
        WebElement webMounth = driver.findElement(By.id("month"));
        WebElement webYear = driver.findElement(By.id("year"));

        Select day = new Select(webDay);
        Select mounth = new Select(webMounth);
        Select year = new Select(webYear);

        day.selectByValue("23");
        mounth.selectByValue("3");
        year.selectByValue("1980");

        MyFunc.Bekle(3);
        BekleKapat();








    }

}
