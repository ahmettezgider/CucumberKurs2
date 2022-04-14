package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Locators;

import java.time.Duration;

public class ParentClass {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentClass(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void gotoHomepage(){
        driver.get("http://opencart.abstracta.us/");
    }


    public void clickTo(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendkeysTo(WebElement element, String str){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(str);
    }

    public WebElement waitFor(WebElement element, Conditions condition){
        switch (condition){
            case clickable:
                return wait.until(ExpectedConditions.elementToBeClickable(element));
            default:
                return wait.until(ExpectedConditions.visibilityOf(element));
        }
    }

}
