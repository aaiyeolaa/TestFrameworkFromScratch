package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Hooks;

public class HomePage {

    public WebDriver driver;

    By runButton = By.id("run-button");
    By windowOutput = By.id("output");
//    COMMENTS DISABLED
    
    public HomePage(Hooks hooks) {
        this.driver = hooks.getDriver();

    }

    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }

    public void clickOnRunButton(){
        driver.findElement(runButton).click();
    }

    public Boolean isWindowOutDisplayed(){
        return driver.findElement(windowOutput).isDisplayed();
    }

    public String getWindowOutputText(){
        return driver.findElement(windowOutput).getText();
    }

    }


