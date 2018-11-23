package katok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHomePage {
    public BookingHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//input[@id='ss']")
    private WebElement searchLine;

    @FindBy(xpath = ".//div[@class='xp__dates-inner xp__dates__checkin']")
    private WebElement datesDialogue;

    @FindBy(xpath = ".//span[text()='Проверить цены']")
    private WebElement submitButton;

    @FindBy(xpath = ".//td[@data-date='2018-12-14']")
    WebElement checkInDate;

    @FindBy(xpath = ".//td[@data-date='2018-12-15']")
    WebElement checkOutDate;

    public void enterCity(WebDriver driver, String city) {
        searchLine.clear();
        searchLine.sendKeys(city);
    }

    public void setDates(WebDriver driver) {
        datesDialogue.click();
        checkInDate.click();
        checkOutDate.click();
    }

    public void clickSubmit(WebDriver driver) {
        submitButton.click();
    }

    public void doBasicSetUp(WebDriver driver, String city) {
        enterCity(driver, city);
        setDates(driver);
        clickSubmit(driver);
    }
}
