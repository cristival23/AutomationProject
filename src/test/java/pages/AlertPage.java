package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id =  "alertButton")
    private WebElement alert0k;

    @FindBy(id = "timerAlertButton")
    private WebElement timmerButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "promtButton")
    private WebElement promptButton;

    @FindBy(id = "CancelButton")
    private WebElement alert3TextArea;

    @FindBy(id = "promptResult")
    private WebElement alert4TextArea;


    public void dealWithAcceptAlert(){
        elementMethods.clickElement(alert0k);
        alertMethods.acceptAlert();
    }
    public void dealWithDelayAlert(){
        elementMethods.clickElement(timmerButton);
    }
    public void dealWithCancelButton(){
        elementMethods.clickElement(buttonOkCancel);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(alert3TextArea, "You selected Confirm" );
    }

    public void dealWithPromtButton(String text){
        elementMethods.clickElement(promptButton);
        alertMethods.fillAlert(text);
        elementMethods.validateElementText(alert4TextArea, "You selected " + text);

    }


}
