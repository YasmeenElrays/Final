package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageTask extends PageBase{

    public LoginPageTask(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"competitionModal\"]/div/div/div[2]/button")
    public WebElement newPopupCloseBtn;

    @FindBy(id = "UserUsername")
    WebElement UserName;

    @FindBy(id = "UserPassword")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"login_wrapper\"]/div/div[4]/input")
    WebElement LoginBtn;
    @FindBy(id = "flashMessage")
    public  WebElement flashMsg;

    public void LoginWithInvalidCredentials (){
        UserName.sendKeys("demot223");
        Password.sendKeys("12sud4");
        LoginBtn.click();
    }
    public void LoginWithValidCredentials(){
        UserName.sendKeys("demot223");
        Password.sendKeys("12sudo4");
        LoginBtn.click();
    }

}