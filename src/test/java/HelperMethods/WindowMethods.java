package HelperMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
    private WebDriver webDriver;

    public WindowMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void switchSpecificTabWindow (Integer index){
        List<String> tabsOpened = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabsOpened.get(index));  //schimba focus-ul pe al doilea tab, tab(1)
        System.out.println("Tabul curent are URL-ul " + webDriver.getCurrentUrl());
    }

    public void closeCurentTabWindow (){
        webDriver.close();
    }
}
