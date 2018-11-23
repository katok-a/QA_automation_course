package katok.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import katok.BookingHomePage;
import katok.BookingResultPage;
import katok.TopHotelPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class BookingSteps {
    private WebDriver driver = new ChromeDriver();
    private BookingHomePage homepage = new BookingHomePage(driver);
    private BookingResultPage resultPage = new BookingResultPage(driver);
    private TopHotelPage topHotelPage = new TopHotelPage(driver);
    private final String CITY = "Москва";

    @Given("^I am on booking.com main page$")
    public void loadBookingHomePage() {
        driver.manage().window().maximize();
        driver.get("https://www.booking.com");
    }

    @When("^I enter to the searchLine CITY name name$")
    public void enterCityName() {
        homepage.enterCity(driver, CITY);
    }

    @When("^I set dates for the trip$")
    public void entedDates() {
        homepage.setDates(driver);
    }

    @When("^I click submitButton$")
    public void clickSubmit() {
        homepage.clickSubmit(driver);
    }

    @When("^I sort hotels by rating$")
    public void sortByRating() {
        resultPage.sortByRating(driver);
    }

    @When("^I open top hotel in list$")
    public void openTopHotel() {
        resultPage.openFirstHotel(driver);
        resultPage.goToTopHotelPage(driver);
    }

    @Then("^I see page with search results>0$")
    public void checkResults() {
        Assert.assertTrue(resultPage.isHotels(driver));
        driver.quit();
    }

    @Then("^Hotel's rating>(\\d+)$")
    public void isRatingHigher(int rating) {
        System.out.println(rating);
        Assert.assertTrue(topHotelPage.getRating(driver) > rating);
        driver.quit();
    }


}
