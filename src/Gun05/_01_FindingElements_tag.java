package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com/");

        List<WebElement> linkler = driver.findElements(By.tagName("a"));
                                   // bütün a olan tagli elementleri bul

        for(WebElement e: linkler)
            if (!e.getText().equals(""))
              System.out.println("e.getText() = " + e.getText());

        BekleKapat();
    }

}
