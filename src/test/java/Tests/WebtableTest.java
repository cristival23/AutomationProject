package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableTest extends SharedData {


    @Test
    public void metodaTest(){
        ElementMethods elementMethods =  new ElementMethods(getWebDriver());

        //facem un scroll la pagina
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,490)", "");

        //identificam un element(ex buton)
        WebElement consentField=getWebDriver().findElement(By.className("fc-button-label"));
        consentField.click();

        WebElement elementsField=getWebDriver().findElement(By.xpath("//h5[text()='Elements']"));
        elementsField.click();

        js.executeScript("window.scrollBy(0,450)", "");

        WebElement webTablesField=getWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesField.click();

        WebElement addField= getWebDriver().findElement(By.id("addNewRecordButton"));
        addField.click();

        WebElement firstnameField=getWebDriver().findElement(By.id("firstName"));
        String firstnameValue="Cristian";
        ElementMethods.fillElement(firstnameField,firstnameValue);
        firstnameField.sendKeys(firstnameValue);

        WebElement lastnameField=getWebDriver().findElement(By.id("lastName"));
        String lastnameValue="Voicu";
        lastnameField.sendKeys(lastnameValue);

        WebElement emailField=getWebDriver().findElement(By.id("userEmail"));
        String emailValue="voicucristianvalentin1993@gmail.com";
        emailField.sendKeys(emailValue);

        WebElement ageField=getWebDriver().findElement(By.id("age"));
        String ageValue= "30";
        ageField.sendKeys(ageValue);

        WebElement salaryField=getWebDriver().findElement(By.id("salary"));
        String salaryValue="999999";
        salaryField.sendKeys(salaryValue);

        WebElement departmentField=getWebDriver().findElement(By.id("department"));
        String departmentValue="Testing";
        departmentField.sendKeys(departmentValue);

        WebElement submitButton=getWebDriver().findElement(By.id("submit"));
        submitButton.click();

        //modificam entryurile adaugate mai sus

        WebElement editField=getWebDriver().findElement(By.id("edit-record-4"));
        editField.click();

        WebElement firstnamemodifyField=getWebDriver().findElement(By.id("firstName"));
        String firstnamemodifyValue="Vlad";
        elementMethods.refillElement(firstnamemodifyField,firstnamemodifyValue);

        WebElement lastNameModifyField=getWebDriver().findElement(By.id("lastName"));
        String lastNameModifyValue="Popescu";
        elementMethods.refillElement(lastNameModifyField,lastNameModifyValue);

        WebElement agemodifyField=getWebDriver().findElement(By.id("age"));
        String agemodifyValue= "20";
        elementMethods.refillElement(agemodifyField,agemodifyValue);

        agemodifyField.clear();
        agemodifyField.sendKeys(agemodifyValue);

        WebElement submitModifyButton=getWebDriver().findElement(By.id("submit"));
        submitModifyButton.click();

        //stergem noul entry

        WebElement deleteButton=getWebDriver().findElement(By.id("delete-record-4"));
        deleteButton.click();

        //inchidem un browser=quit()
        //inchidem un tab=close()

    }
}
