package pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public ElementMethods elementMethods;
    public WebDriver webDriver;
    public AlertMethods alertMethods;

    public BasePage (WebDriver webDriver){
        this.webDriver = webDriver;
        elementMethods = new ElementMethods(webDriver);
        alertMethods = new AlertMethods(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
