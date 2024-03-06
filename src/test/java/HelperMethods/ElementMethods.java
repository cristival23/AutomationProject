package HelperMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Map;


public class ElementMethods {
    private static WebDriver webDriver;

    public ElementMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void scrollElementByPixel(Integer x, Integer y) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
    }

    public static void waitVisibleElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        waitVisibleElement(element);
        element.click();
    }

    public  void validateElementText (WebElement element,String expected){
        waitVisibleElement(element);
        String actual = element.getText();
        Assert.assertEquals(actual,expected);
    }

    public  void printElementText (WebElement element){
        waitVisibleElement(element);
        System.out.println(element.getText());
    }

    public static void fillElement(WebElement Element, String value){
        waitVisibleElement(Element);
        Element.sendKeys(value);

    }

    public void refillElement(WebElement element, String value){
        waitVisibleElement(element);
        element.clear();
        element.sendKeys(value);
    }
    public void selectTextElement(WebElement element, String value){
        waitVisibleElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void selectValueElement(WebElement element, String value){
        waitVisibleElement(element);
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public static void fillPressElement(WebElement element, String value, Keys key){
        waitVisibleElement(element);
        element.sendKeys(value);
        element.sendKeys(key);
    }

    public void clickElementWithJavaScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("arguments[0].click();", element);
    }
}



