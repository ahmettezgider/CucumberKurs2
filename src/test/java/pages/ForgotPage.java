package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ParentClass;

public class ForgotPage extends ParentClass {


    public ForgotPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Forgotten')])[1]")
    public WebElement eForgotPassButton;

    @FindBy(id = "input-email")
    public WebElement eEmailAddress;

    @FindBy(css = "input[type='submit']")
    public WebElement eContinueButton;

    @FindBy(css = "div.alert.alert-success")
    public WebElement eSuccessText;

}
