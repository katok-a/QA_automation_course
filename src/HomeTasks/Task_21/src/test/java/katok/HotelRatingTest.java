package katok;

import katok.BookingHomePage;
import katok.BookingResultPage;
import katok.HotelRatingTest;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HotelRatingTest {
    private final String CITY = "Москва";
    private final double MIN_RATING = 9.0;
    private BookingHomePage bookingHomePage;
    private BookingResultPage bookingResultPage;
    private TopHotelPage topHotelPage;
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.booking.com");
        driver.manage().window().maximize();
    }

    @Test
    public void HotelRatingTest() {
        bookingHomePage = new BookingHomePage(driver);
        bookingResultPage = new BookingResultPage(driver);
        topHotelPage = new TopHotelPage(driver);
        bookingHomePage.doBasicSetUp(driver, CITY);
        bookingResultPage.sortByRating(driver);
        bookingResultPage.openFirstHotel(driver);
        bookingResultPage.goToTopHotelPage(driver);
        Assert.assertTrue(topHotelPage.getRating(driver)>MIN_RATING);
    }

    @AfterClass
    public static void Close() {
        driver.close();
    }
}
