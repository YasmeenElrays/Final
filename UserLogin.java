package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLogin extends PageBase {

    public UserLogin(WebDriver driver) {
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
    public void LoginPage (){
       UserName.sendKeys("automation_t1");
       Password.sendKeys("12sudo4");
       LoginBtn.click();
       newPopupCloseBtn.click();

    }
}
