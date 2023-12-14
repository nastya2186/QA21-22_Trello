package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

    WebDriver driver;


    public void init(){
        driver = new ChromeDriver();
        driver.navigate().to("https://trelo.com/");
    }

    public void stop(){
        driver.quit();
    }
}
