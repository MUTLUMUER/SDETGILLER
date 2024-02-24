package Gun03;

import Utlity.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();  // driver tarayıcı
                       //new FirefoxDriver();
                       //new EdgeDriver();

        driver.get("https://techno.study/tr");  // web sayfasını aç


        MyFunc.Bekle(3);
        //bekleme
        driver.quit();
    }
}
