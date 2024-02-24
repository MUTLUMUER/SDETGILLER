package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru extends BaseDriver {
    //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
    //    Assert.assertTrue(urunFiyatToplamlam == itemTotal)



    @Test
    public void test1(){


        driver.get("https://www.saucedemo.com/");


        MyFunc.Bekle(2);
        WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(1);
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(1);
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        //1.Ürün sepete ekleniyor
        MyFunc.Bekle(2);
        WebElement product1= driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        product1.click();

        MyFunc.Bekle(2);
        WebElement addToCart= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        // Geri dön
        MyFunc.Bekle(2);
        WebElement btnBack= driver.findElement(By.xpath("//button[@id='back-to-products']"));
        btnBack.click();

        //2.Ürün sepete ekleniyor
        MyFunc.Bekle(2);
        WebElement product2= driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();

        MyFunc.Bekle(2);
        WebElement addToCart2= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();

        //sepete tıklatılıyor
        MyFunc.Bekle(2);
        WebElement sepet= driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        sepet.click();

        //checkout tıklatılıyor
        MyFunc.Bekle(2);
        WebElement buttonCheckOut= driver.findElement(By.xpath("//*[@id='checkout']"));
        buttonCheckOut.click();

        //Kullanıcı bilgileri giriliyor
        MyFunc.Bekle(2);
        WebElement firstname= driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Kaan Hakan");

        MyFunc.Bekle(2);
        WebElement lastname= driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Gül");

        MyFunc.Bekle(2);
        WebElement zipcode= driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("34777");

        //continue ya tıklatılıyor
        MyFunc.Bekle(2);
        WebElement btnContinue= driver.findElement(By.xpath("//input[@id='continue']"));
        btnContinue.click();

        //Sepet toplam işlemleri yapılıyor
        List<WebElement> urunler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double urunUcretToplam=0;
        for (WebElement e: urunler)
        {
            System.out.println("e.getText() = " + e.getText());  //$15.99
            String strUrunFiyat = e.getText().replaceAll("[^0-9,.]","");
            double urunFiyat=Double.parseDouble(strUrunFiyat);
            urunUcretToplam = urunUcretToplam+urunFiyat;
        }

        System.out.println("urunUcretToplam = " + urunUcretToplam);

        //item total alınıyor
        WebElement itemtotalElement= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String strItemTotal = itemtotalElement.getText().replaceAll("[^0-9,.]","");
        double itemTotal=Double.parseDouble(strItemTotal);
        System.out.println("ItemTotal = " + itemTotal);

        Assert.assertTrue("Rakamlar eşit değil", urunUcretToplam==itemTotal);

        BekleKapat();
    }

}
