package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VirtualMeeting extends PageBase {

    public VirtualMeeting(WebDriver driver) {
        super(driver);
        scroll = (JavascriptExecutor)driver;
    }

    @FindBy(xpath = "//a[@href='/teacher/vcrs/meetings']")
    WebElement virtualMeeting;
    @FindBy(xpath = "//a[@href='/teacher/vcrs/meetings_add']")
    WebElement addMeetingButton;
    @FindBy(xpath = "//button[contains(@class,'btn btn-default pick')]")
    WebElement continueButton;
    @FindBy(id = "VcrTitle")
    WebElement title;
    @FindBy(xpath = "//input[contains(@name,'[starting_time]')]")
    WebElement startingTime;
//    @FindBy(xpath = "//td[@class='day'][preceding::td[@class='day today active']][@xpath='1']")
    @FindBy(xpath = "//td[@class='day today active']")
    WebElement ActiveDay;
    @FindBy(xpath ="//span[contains(@class,'hour active hour')]")
    WebElement SelectTime;
    @FindBy(xpath = "//span[@class='minute active']")
    WebElement SelectMin;
    @FindBy(xpath = "//div[@class='select-styled']")
    WebElement Duration;
    @FindBy(xpath = "//li[@rel='45']")
    WebElement durationSelect;
    @FindBy(xpath = "//input[@value='Create' or @value='إضافة']")
    WebElement CreateBtn;
    //td[contains(@class,'day ')][preceding::td[@class='day today active']]



 public void VMPage() throws InterruptedException {
        ScrollDown();
        ScrollDown();
        ScrollDown();
        ScrollDown();
        virtualMeeting.click();
        addMeetingButton.click();
        continueButton.click();
        title.sendKeys("AutomationVM");
        startingTime.click();
        ScrollDown();
//        ActiveDay.click();
     selectDateFromDatePicker(driver,ActiveDay);
//     List<WebElement> Days=driver.findElements(By.className("day"));
//     int Total = Days.size();
//     for(int i=0;i<Total;i++){
//         String select=Days.get(i).getText();
//         System.out.println(select);
//         if (select.equals(ActiveDay)){
//           Days.get(i+1).click();
//             return;
//         }

        SelectTime.click();
        SelectMin.click();
        Duration.click();
        durationSelect.click();
        CreateBtn.click();

 }}

