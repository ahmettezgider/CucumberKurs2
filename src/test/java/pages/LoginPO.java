package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ParentClass;

public class LoginPO extends ParentClass {

        public LoginPO(){
            PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
        }
        public LoginPO(WebDriver driver){
            PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
        }
        @FindBy(css = "a[title='My Account']")
        public WebElement myAccount;

        @FindBy(xpath = "//a[text()='Login']")
        public WebElement loginLink;

        @FindBy(id = "input-email")
        public WebElement usernameInput;

        @FindBy(id = "input-password")
        public WebElement passwordInput;

        @FindBy(xpath = "//input[@value='Login']")
        public WebElement loginSubmitButton;

        @FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
        public WebElement logout;

        @FindBy(css = "div.alert.alert-danger")
        public WebElement AlertDanger;

        public void gotoSite(){
            driver.get("https://demo.opencart.com/");
        }
        public void clickTo(By locater) {
            wait.until(ExpectedConditions.elementToBeClickable(locater)).click();
        }

        public void clickTo(WebElement element) {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        }

        public void sendKeysTo(By locater, String text) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locater)).clear();
            wait.until(ExpectedConditions.visibilityOfElementLocated(locater)).sendKeys(text);
        }

        public void sendKeysTo(WebElement element, String text) {
            wait.until(ExpectedConditions.visibilityOf(element)).clear();
            element.sendKeys(text);
        }
        public void wait(WebElement element){
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        public void filltheForm(String username, String password){
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
        }



    }
