package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class MailBoxFeature extends PageBase {
    public MailBoxFeature(WebDriver driver) {
        super(driver);
        scroll = (JavascriptExecutor)driver;
    }
    String VideoStc= "bug.webm";
    String VideoPath= System.getProperty("user.dir") +"\\uploads\\"+VideoStc;
    UserLogin LoginTest=new UserLogin(driver);
    @FindBy(xpath ="//a[@href='/teacher']")
    WebElement home;
    @FindBy(xpath ="//a[@href='/teacher/#']")
    //@FindBy(xpath = "//*[@id=\"sidebar\"]/ul[1]/li[7]/a")
    WebElement mailBox;
    @FindBy(xpath = "//a[@href='/teacher/messages/compose']")
    WebElement composeSideMenu;
    @FindBy(id = "MessageTitle")
    WebElement messageSubject;
    @FindBy(xpath = "//*[@id=\"MessageComposeForm\"]/fieldset/div[6]/div/div")
    WebElement chooseRecipient;
    @FindBy(xpath = "//*[@id=\"MessageComposeForm\"]/fieldset/div[6]/div/ul/li[2]")
    WebElement selectSchoolAdmin;
    @FindBy(id = "search_box")
    WebElement searchByRecipientName;
    @FindBy(id = "UserCheckbox4340067")
    WebElement selectRecipientCheckbox;
    @FindBy(id = "button_2")
    WebElement clearSelectedUser;
    @FindBy(xpath = "/html/body")
    WebElement bodyOfMessage;
    @FindBy(id = "send_button_id")
    //@FindBy(xpath = "//*[@id=\"send_button_id\"]")
    WebElement sendMessageButton;
    @FindBy(id = "att_a_id")
    WebElement attachmentButton;
    @FindBy(id = "add_attachment\"")
    WebElement uploadFile;
    @FindBy(id = "file")
    WebElement chooseFile;
    @FindBy(id = "att_done")
    WebElement doneSelectingAttachmentButton;

    public void MailBoxModule(){
        LoginTest.UserName.sendKeys("demot223");
        LoginTest.Password.sendKeys("12sudo4");
        LoginTest.LoginBtn.click();
        home.click();
        waitForElement(mailBox,30);
        mailBox.click();
        composeSideMenu.click();
    }
    public void ComposeMessageWithAttachment() throws AWTException {
        messageSubject.sendKeys("CheckMessage1");
        ScrollDown();
        chooseRecipient.click();
        selectSchoolAdmin.click();
        searchByRecipientName.sendKeys("Abd Alrahman Abu Tarboush");
        selectRecipientCheckbox.click();
        clearSelectedUser.click();
        selectRecipientCheckbox.click();
        ScrollDown();
        driver.switchTo().frame(0);
        bodyOfMessage.sendKeys("ThisIsTestMessage");
        driver.switchTo().defaultContent();
        ScrollUp();
        attachmentButton.click();

        uploadFile.click();
        chooseFile.click();
        Robot robot =new Robot();
        //CTRL C
        StringSelection selection=new StringSelection(VideoPath);
        Clipboard clipboard =Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);

        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        //Clicking on CTRl V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        doneSelectingAttachmentButton.click();

    }



}
