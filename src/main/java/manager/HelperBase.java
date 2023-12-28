package manager;

import org.openqa.selenium.*;

import java.util.List;

public class HelperBase {

    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElementBase(By locator){
        System.out.println(locator);
        return driver.findElement(locator);
    }

    private List<WebElement> findElementsBase(By locator){
        System.out.println(locator);
        return driver.findElements(locator);
    }

    public void pause(){

        try {
            Thread.sleep(1000L);
        }catch(InterruptedException e){
            throw new RuntimeException(e);

        }
    }

    public void clickBase(By locator){
        WebElement element = findElementBase(locator);
        element.click();
            }

            public void typeBase(By locator, String text){
        WebElement element = findElementBase(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

            }

        public boolean isElementPresent(By locator){
        return !findElementsBase(locator).isEmpty();
        }

        public boolean isTextInElementEquals(By locator, String text){
        WebElement element = findElementBase(locator);
        return element.getText().equals(text);
        }


}
