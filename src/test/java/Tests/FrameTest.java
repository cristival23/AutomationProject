package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest extends SharedData {

    @Test
    public void frameMethod() {
        ElementMethods elementMethods =  new ElementMethods(getWebDriver());
        FrameMethods frameMethods = new FrameMethods(getWebDriver());

        //facem scroll la pagina
        elementMethods.scrollElementByPixel(0,450);

        //identificam un element dupa clasa
        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label")); //pui valoarea clasei din site, cu inspect element
        elementMethods.clickElement(consentField);

        WebElement AlertsFrameWindowsField = getWebDriver().findElement(By.xpath(
                "//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(AlertsFrameWindowsField);

        elementMethods.scrollElementByPixel(0,350);
        WebElement frameField = getWebDriver().findElement(By.xpath(
                "//span[text()='Frames']"));
        elementMethods.clickElement(frameField);


        //interactionam cu un iframe
        frameMethods.switchSpecificIframe("frame1"); //focus pe iframe
        WebElement frame1Element = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frame1Element);

        //specificam sa revina la frame-ul curent
        frameMethods.switchParentFrame();

        frameMethods.switchSpecificIframe("frame2");               //focus pe al doilea iframe
        WebElement frame2Element = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frame2Element);

    }
}
