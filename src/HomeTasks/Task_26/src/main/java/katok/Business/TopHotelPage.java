package katok.Business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopHotelPage {

    public TopHotelPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(.//div[@class='bui-review-score__badge'])[1]")
    private WebElement rating;

    public double getRating() {
        return Double.parseDouble(rating.getText().trim());
    }
}
