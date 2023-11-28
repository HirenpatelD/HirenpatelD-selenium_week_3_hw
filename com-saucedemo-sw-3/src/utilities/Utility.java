package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Utility extends BaseTest {
    /**
     * This method will send text to element
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    /**
     * This method will click on element
     */
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    /**
     *Ths Method will get text from an element
     */

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public void assertionMethod(String message, String expectedText, String actualText) {
        Assert.assertEquals(message, expectedText, actualText);
    }
    public void productElement(By by) {
        List<WebElement> productsElement = driver.findElements(by);
        System.out.println("Total number of products on display are: " + productsElement.size());
    }
}

