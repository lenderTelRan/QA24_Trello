package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperBase {

    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    private WebElement findElementBase(By locator) {
        System.out.println(locator);
        return  wd.findElement(locator);
    }
    private List<WebElement> findElementsBase(By locator) {
        return wd.findElements(locator);
    }

    public void clickBase(By locator) {
        findElementBase(locator).click();
    }

    public void typeBase(By locator, String text) {
        WebElement element = findElementBase(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }
    public  boolean isElementPresent(By locator) {
       return !findElementsBase(locator).isEmpty();
    }
}
