package katok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.List;

public class BookingResultPage {
    public BookingResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(xpath = ".//span[@class[contains(.,'sr-hotel__name')]]")})
    private List<WebElement> hotelsList;

    @FindBy(xpath = ".//a[@data-category=\"review_score_and_price\"]")
    WebElement ratingButton;

    @FindBy(xpath = "(.//a[@class='hotel_name_link url'])[1]/span[2]")
    WebElement firstHotelInList;

    public boolean isHotels(WebDriver driver) {
        return hotelsList.size() > 0;
    }

    public void sortByRating(WebDriver driver) {
        ratingButton.click();
    }

    public void openFirstHotel(WebDriver driver) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(By.xpath("//*[@id=\"utag_59_iframe\"]"))));
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(By.xpath(".//div[@class='sr-usp-overlay sr-usp-overlay--wide']"))));
        firstHotelInList.click();
    }

    public void goToTopHotelPage(WebDriver driver) {
        ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(handles.size() - 1));
    }
}