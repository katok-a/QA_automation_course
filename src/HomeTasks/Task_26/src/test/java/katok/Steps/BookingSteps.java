package katok.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import katok.Business.BookingHomePage;
import katok.Business.BookingResultPage;
import katok.Business.TopHotelPage;
import katok.Core.GetDataFromSQL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookingSteps {
    private WebDriver driver = new ChromeDriver();
    private BookingHomePage homepage = new BookingHomePage(driver);
    private BookingResultPage resultPage = new BookingResultPage(driver);
    private TopHotelPage topHotelPage = new TopHotelPage(driver);

    public BookingSteps() throws SQLException {
    }

    @Given("^I am on booking.com main page$")
    public void loadBookingHomePage() throws SQLException {
        driver.manage().window().maximize();
        GetDataFromSQL dataMiner = new GetDataFromSQL();
        ArrayList<String> URLs = dataMiner.getDataByQuery("select url from urls");
        driver.get(URLs.get(0));
    }

    @When("^I enter to the searchLine (\\D+)$")
    public void enterCityName(String city) {
        homepage.enterCity(city);
    }

    @When("^I set dates for the trip$")
    public void entedDates() {
        homepage.setDates();
    }

    @When("^I click Проверить цены$")
    public void clickSubmit() {
        homepage.clickSubmit();
    }

    @When("^I sort hotels by rating$")
    public void sortByRating() {
        resultPage.sortByRating();
    }

    @When("^I open top hotel in list$")
    public void openTopHotel() {
        resultPage.openFirstHotel(driver);
        resultPage.goToTopHotelPage(driver);
    }

    @Then("^I see page with more than (\\d+) search results$")
    public void checkResults(int result) {
        Assert.assertTrue(resultPage.isHotels(result));
        driver.quit();
    }

    @Then("^Hotel's rating higher than (\\d+)$")
    public void isRatingHigher(int rating) {
        Assert.assertTrue(topHotelPage.getRating() > rating);
        driver.quit();
    }


}
