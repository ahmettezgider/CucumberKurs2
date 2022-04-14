package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ParentClass;

public class ForgotPassPage extends ParentClass {


    public String url = "https://opencart.abstracta.us/index.php?route=account/login";
    public String email = "ZeydinToprak@hotmail.com";

    public ForgotPassPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Forgotten')])[1]")
    public WebElement eForgotPassButton;

    @FindBy(id = "input-email")
    public WebElement eForgotEmailAddress;

    @FindBy(css = "input[type='submit']")
    public WebElement eForgotContinueButton;

    @FindBy(css = "div.alert.alert-success")
    public WebElement eForgotSuccessText;

    @FindBy(id = "input-email")
    public WebElement eEmail;

    @FindBy(id = "input-password")
    public WebElement ePassword;

    @FindBy(css = "input[type='submit']")
    public WebElement eLoginButton;

    @FindBy(css = "div[class='alert alert-danger alert-dismissible']")
    public WebElement eFailedLogin;

    @FindBy(xpath = "//li//a[text()='Edit Account']")
    public WebElement eSuccessfulLogin;

}
