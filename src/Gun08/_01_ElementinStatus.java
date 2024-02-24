package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementinStatus extends BaseDriver {

    @Test
    public void test1(){
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        MyFunc.Bekle(2);

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed()); // web de görünüyor mu
        System.out.println("sali.isEnabled() = " + sali.isEnabled()); // web de etkin mi
        System.out.println("sali.isSelected() = " + sali.isSelected()); // çekli mi

        sali.click();
        MyFunc.Bekle(2);
        System.out.println("sali.isSelected() = " + sali.isSelected()); // çekli mi

        /*** cumartesi ***/
        WebElement cumartesi=driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed()); // web de görünüyor mu
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled()); // web de etkin mi
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected()); // çekli mi

        BekleKapat();
    }

}
