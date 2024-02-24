package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {

    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        // navigate().to -> get ile aynı, history için kullanılır, ileri - geri için
        MyFunc.Bekle(3);
        WebElement element=driver.findElement(By.id("alerttest"));
        element.click();
        MyFunc.Bekle(3);
        System.out.println("driver.getTitle() = " + driver.getTitle()); // geçerli title
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // geçerli url

        driver.navigate().back(); // bir önceki sayfaya geri dön
        MyFunc.Bekle(3);
        System.out.println("driver.getTitle() = " + driver.getTitle()); // geçerli title
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // geçerli url

        driver.navigate().forward(); // bir sonraki sayfaya git.(daha önce gittiğin)
        System.out.println("driver.getTitle() = " + driver.getTitle()); // geçerli title
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // geçerli url

        BekleKapat();
    }
}
